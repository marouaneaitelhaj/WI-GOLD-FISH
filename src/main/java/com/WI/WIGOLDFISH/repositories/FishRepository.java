package com.WI.WIGOLDFISH.repositories;

import com.WI.WIGOLDFISH.entities.Competition;
import com.WI.WIGOLDFISH.entities.Fish;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FishRepository extends JpaRepository<Fish, String> {
}
