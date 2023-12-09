package com.WI.WIGOLDFISH.ENTITIES;

import com.WI.WIGOLDFISH.IDs.RankingId;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Ranking {
    @EmbeddedId
    private RankingId rankingId;
    private  int rank;
    private int score;
}
