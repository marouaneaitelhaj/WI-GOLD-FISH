package com.WI.WIGOLDFISH.controllers;

import com.WI.WIGOLDFISH.entities.competition.CompetitionDtoReq;
import com.WI.WIGOLDFISH.services.impl.CompetitionServiceImpl;
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
@RequestMapping("/competition")
public class CompetitionController {
    @Autowired
    private CompetitionServiceImpl competitionServiceImpl;

    @PostMapping
    public ResponseEntity<?> createCompetition(@Validated @RequestBody CompetitionDtoReq competitionDtoReq) {
        competitionDtoReq = competitionServiceImpl.save(competitionDtoReq);
        Map<String, Object> response = new HashMap<>();
        response.put("data", competitionDtoReq);
        response.put("message", "Competition created successfully");
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<?> getCompetitions(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {
        Pageable pageable = PageRequest.of(page, size);
        return ResponseEntity.ok(competitionServiceImpl.findAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getCompetition(@PathVariable String s) {
        return ResponseEntity.ok(competitionServiceImpl.findOne(s));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateCompetition(@PathVariable String s, @Validated @RequestBody CompetitionDtoReq competitionDtoReq) {
        competitionDtoReq = competitionServiceImpl.update(competitionDtoReq, s);
        Map<String, Object> response = new HashMap<>();
        response.put("data", competitionDtoReq);
        response.put("message", "Competition updated successfully");
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCompetition(@PathVariable String s) {
        competitionServiceImpl.delete(s);
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Competition deleted successfully");
        return ResponseEntity.ok(response);
    }
}
