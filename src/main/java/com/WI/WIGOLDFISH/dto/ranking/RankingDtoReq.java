package com.WI.WIGOLDFISH.dto.ranking;

import com.WI.WIGOLDFISH.ids.RankingId;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class  RankingDtoReq {
    private RankingId rankingId;
    private  int rank;
    private int score;
    private Long member_id;
    private String competition_id;
}
