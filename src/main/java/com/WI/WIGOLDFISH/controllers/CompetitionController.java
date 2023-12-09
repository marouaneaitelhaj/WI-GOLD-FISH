package com.WI.WIGOLDFISH.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.WI.WIGOLDFISH.entities.competition.CompetitionDtoReq;
import com.WI.WIGOLDFISH.services.impl.CompetitionServiceImpl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
@RestController
@RequestMapping("/competition")
public class CompetitionController {
    @Autowired
    private CompetitionServiceImpl competitionServiceImpl;

    @PostMapping
    public ResponseEntity<?>  createCompetition(@Validated @RequestBody CompetitionDtoReq competitionDtoReq) {
        competitionDtoReq = competitionServiceImpl.save(competitionDtoReq);
        Map<String, Object> response = new HashMap<>();
        response.put("data", competitionDtoReq);
        response.put("message", "Competition created successfully");
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<?>  getCompetitions() {
        List<CompetitionDtoReq> competitionDtoReq = competitionServiceImpl.findAll();
        Map<String, Object> response = new HashMap<>();
        response.put("data", competitionDtoReq);
        response.put("message", "Competition created successfully");
        return ResponseEntity.ok(response);
    }
}
