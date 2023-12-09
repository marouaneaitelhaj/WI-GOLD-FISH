package com.WI.WIGOLDFISH.entities.ranking;

import com.WI.WIGOLDFISH.entities.competition.CompetitionDtoReq;
import com.WI.WIGOLDFISH.entities.member.MemberDtoReq;
import com.WI.WIGOLDFISH.ids.RankingId;
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
