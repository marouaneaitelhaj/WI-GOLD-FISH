package com.WI.WIGOLDFISH.repositories;

import com.WI.WIGOLDFISH.entities.Competition;
import com.WI.WIGOLDFISH.entities.Hunting;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HuntingRepository extends JpaRepository<Hunting, Long> {
}
