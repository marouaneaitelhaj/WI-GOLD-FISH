package com.WI.WIGOLDFISH.repositories;

import com.WI.WIGOLDFISH.entities.competition.Competition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompetitionRepository extends JpaRepository<Competition, String> {
}
