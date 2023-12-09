package com.WI.WIGOLDFISH.entities.competition;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.WI.WIGOLDFISH.entities.hunting.HuntingDtoReq;
import com.WI.WIGOLDFISH.entities.ranking.RankingDtoReq;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompetitionDtoRes {
    private String code;
    private LocalDate date;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private int numberOfParticipants;
    private String location;
    private Double amount;
    private List<RankingDtoReq> ranking;
    private List<HuntingDtoReq> huntings;
}
