package com.WI.WIGOLDFISH.entities.competition;

import com.WI.WIGOLDFISH.entities.hunting.Hunting;
import com.WI.WIGOLDFISH.entities.ranking.Ranking;
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
@Entity
@Table(name = "competition")
public class Competition {
    @Id
    private String code;
    private LocalDate date;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private int numberOfParticipants;
    private String location;
    private Double amount;
    @OneToMany(mappedBy = "competition", fetch = FetchType.LAZY)
    private List<Ranking> ranking;
    @OneToMany(mappedBy = "competition", fetch = FetchType.LAZY)
    private List<Hunting> huntings;
    public Competition(String code) {
        this.code = code;
    }
}
