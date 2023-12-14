package com.WI.WIGOLDFISH.repositories;

import com.WI.WIGOLDFISH.entities.competition.Competition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CompetitionRepository extends JpaRepository<Competition, String> {
    Optional<Competition> findByCode(String code);
}
