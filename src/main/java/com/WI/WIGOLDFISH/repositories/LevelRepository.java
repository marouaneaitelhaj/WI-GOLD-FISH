package com.WI.WIGOLDFISH.repositories;

import com.WI.WIGOLDFISH.entities.Competition;
import com.WI.WIGOLDFISH.entities.Level;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LevelRepository extends JpaRepository<Level, Long> {
}
