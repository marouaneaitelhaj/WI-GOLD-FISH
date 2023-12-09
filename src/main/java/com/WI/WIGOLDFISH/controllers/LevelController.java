package com.WI.WIGOLDFISH.controllers;

import com.WI.WIGOLDFISH.entities.level.LevelDtoReq;
import com.WI.WIGOLDFISH.services.impl.LevelServiceImpl;
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
@RequestMapping("/level")
public class LevelController {
    @Autowired
    private LevelServiceImpl levelServiceImpl;

    @PostMapping
    public ResponseEntity<?> createLevel(@Validated @RequestBody LevelDtoReq levelDtoReq) {
        levelDtoReq = levelServiceImpl.save(levelDtoReq);
        Map<String, Object> response = new HashMap<>();
        response.put("data", levelDtoReq);
        response.put("message", "Level created successfully");
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<?> getLevels() {
        return ResponseEntity.ok(levelServiceImpl.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getLevel(@PathVariable Long s) {
        return ResponseEntity.ok(levelServiceImpl.findOne(s));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateLevel(@PathVariable Long s, @Validated @RequestBody LevelDtoReq levelDtoReq) {
        levelDtoReq = levelServiceImpl.update(levelDtoReq, s);
        Map<String, Object> response = new HashMap<>();
        response.put("data", levelDtoReq);
        response.put("message", "Level updated successfully");
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteLevel(@PathVariable Long s) {
        levelServiceImpl.delete(s);
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Level deleted successfully");
        return ResponseEntity.ok(response);
    }
}
