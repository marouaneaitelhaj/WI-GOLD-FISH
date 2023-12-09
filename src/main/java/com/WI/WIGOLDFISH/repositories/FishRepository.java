package com.WI.WIGOLDFISH.repositories;

import com.WI.WIGOLDFISH.entities.fish.Fish;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FishRepository extends JpaRepository<Fish, String> {
}
