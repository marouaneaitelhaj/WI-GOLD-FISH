package com.WI.WIGOLDFISH.controllers;

import com.WI.WIGOLDFISH.entities.ranking.RankingDtoReq;
import com.WI.WIGOLDFISH.ids.RankingId;
import com.WI.WIGOLDFISH.services.impl.RankingServiceImpl;
import jakarta.validation.Valid;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/ranking")
@RequiredArgsConstructor
public class RankingController {
    private final RankingServiceImpl rankingServiceImpl;

    @PostMapping
    public ResponseEntity<?> createRanking(@Valid @RequestBody RankingDtoReq rankingDtoReq) {
        rankingDtoReq = rankingServiceImpl.save(rankingDtoReq);
        Map<String, Object> response = new HashMap<>();
        response.put("data", rankingDtoReq);
        response.put("message", "Ranking created successfully");
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<?> getRankings() {
        return ResponseEntity.ok(rankingServiceImpl.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getRanking(@PathVariable RankingId s) {
        return ResponseEntity.ok(rankingServiceImpl.findOne(s));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateRanking(@PathVariable RankingId s, @Valid @RequestBody RankingDtoReq rankingDtoReq) {
        rankingDtoReq = rankingServiceImpl.update(rankingDtoReq, s);
        Map<String, Object> response = new HashMap<>();
        response.put("data", rankingDtoReq);
        response.put("message", "Ranking updated successfully");
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteRanking(@PathVariable RankingId s) {
        rankingServiceImpl.delete(s);
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Ranking deleted successfully");
        return ResponseEntity.ok(response);
    }
}
