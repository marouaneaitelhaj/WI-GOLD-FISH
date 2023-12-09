package com.WI.WIGOLDFISH.ENTITIES;

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
public class Competition {
    @Id
    private String code;
    private LocalDate date;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private int numberOfParticipants;
    private String location;
    private Double amount;
}
