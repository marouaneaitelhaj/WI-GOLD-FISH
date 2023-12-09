package com.WI.WIGOLDFISH.dto.ranking;

import com.WI.WIGOLDFISH.dto.competition.CompetitionDtoReq;
import com.WI.WIGOLDFISH.dto.member.MemberDtoReq;
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
public class RankingDtoRes {
    private RankingId rankingId;
    private int rank;
    private int score;
    private MemberDtoReq member;
    private CompetitionDtoReq competition;
}
