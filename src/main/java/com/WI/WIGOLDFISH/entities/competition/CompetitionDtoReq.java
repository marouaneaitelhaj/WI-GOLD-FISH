package com.WI.WIGOLDFISH.entities.competition;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompetitionDtoReq {
    @Pattern(regexp = "[a-z]{3}-[0-9]{2}-[0-9]{2}-[0-9]{2}")
    private String code;
    @NotNull
    private LocalDate date;
    @NotNull
    private LocalDateTime startTime;
    @NotNull
    private LocalDateTime endTime;
    @Max(100)
    private int numberOfParticipants;
    @NotNull
    private String location;
    @NotNull
    private Double amount;
}
