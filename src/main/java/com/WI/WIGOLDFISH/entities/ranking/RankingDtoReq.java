package com.WI.WIGOLDFISH.entities.ranking;

import com.WI.WIGOLDFISH.ids.RankingId;
import jakarta.validation.constraints.NotNull;
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
