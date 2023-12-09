package com.WI.WIGOLDFISH.dto.ranking;

import com.WI.WIGOLDFISH.ids.RankingId;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class  RankingDtoReq {
    @NotNull private RankingId rankingId;
    @NotNull private  int rank;
    @NotNull private int score;
    @NotNull private Long member_id;
    @NotNull private String competition_id;
}
