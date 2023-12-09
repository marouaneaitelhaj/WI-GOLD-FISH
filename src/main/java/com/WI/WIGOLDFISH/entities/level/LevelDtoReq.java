package com.WI.WIGOLDFISH.entities.level;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class LevelDtoReq {
    @NotNull private  Long code;
    @NotNull private String description;
    @NotNull private int points;
}
