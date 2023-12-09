package com.WI.WIGOLDFISH.dto.competition;

import com.WI.WIGOLDFISH.dto.hunting.HuntingDtoReq;
import com.WI.WIGOLDFISH.dto.ranking.RankingDtoReq;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompetitionDtoReq {
    @Id
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
