package com.WI.WIGOLDFISH.repositories;

import com.WI.WIGOLDFISH.entities.ranking.Ranking;
import com.WI.WIGOLDFISH.ids.RankingId;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RankingRepository extends JpaRepository<Ranking, RankingId> {
}
