package com.WI.WIGOLDFISH.controllers;

import com.WI.WIGOLDFISH.entities.hunting.HuntingDtoReq;
import com.WI.WIGOLDFISH.services.impl.HuntingServiceImpl;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/hunting")
public class HuntingController {
    @Autowired
    private HuntingServiceImpl huntingServiceImpl;

    @PostMapping
    public ResponseEntity<?> createHunting(@Validated @RequestBody HuntingDtoReq huntingDtoReq) {
        huntingDtoReq = huntingServiceImpl.save(huntingDtoReq);
        Map<String, Object> response = new HashMap<>();
        response.put("data", huntingDtoReq);
        response.put("message", "Hunting created successfully");
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<?> getHuntings() {
        return ResponseEntity.ok(huntingServiceImpl.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getHunting(@PathVariable Long long1) {
        return ResponseEntity.ok(huntingServiceImpl.findOne(long1));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateHunting(@PathVariable Long s, @Validated @RequestBody HuntingDtoReq huntingDtoReq) {
        huntingDtoReq = huntingServiceImpl.update(huntingDtoReq, s);
        Map<String, Object> response = new HashMap<>();
        response.put("data", huntingDtoReq);
        response.put("message", "Hunting updated successfully");
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteHunting(@PathVariable Long s) {
        huntingServiceImpl.delete(s);
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Hunting deleted successfully");
        return ResponseEntity.ok(response);
    }
}
