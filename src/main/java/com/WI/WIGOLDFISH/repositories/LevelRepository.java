package com.WI.WIGOLDFISH.repositories;

import com.WI.WIGOLDFISH.entities.level.Level;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LevelRepository extends JpaRepository<Level, Long> {
    Optional<Level> findFirstByCodeGreaterThanOrderByCodeDesc(Long code);
    Optional<Level> findFirstByCodeLessThanOrderByCodeDesc(Long code);
    List<Level> findByOrderByCodeAsc();
}