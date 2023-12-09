package com.WI.WIGOLDFISH.dto.competition;

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
public class CompetitionDtoRes {
    @Id
    private String code;
    private LocalDate date;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private int numberOfParticipants;
    private String location;
    private Double amount;
    @OneToMany(mappedBy = "competition", fetch = FetchType.LAZY)
    private List<RankingDtoReq> ranking;
    @OneToMany(mappedBy = "competition", fetch = FetchType.LAZY)
    private List<HuntingDtoReq> huntings;
}
