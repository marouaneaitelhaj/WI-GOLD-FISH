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
@Entity
public class  RankingDtoReq {
    @EmbeddedId
    private RankingId rankingId;
    private  int rank;
    private int score;
    @ManyToOne
    @MapsId("member")
    private MemberDtoReq member;
    @ManyToOne
    @MapsId("competition")
    private CompetitionDtoReq competition;
}
