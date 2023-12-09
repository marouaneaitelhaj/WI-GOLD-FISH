package com.WI.WIGOLDFISH.dto.fish;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import com.WI.WIGOLDFISH.dto.level.LevelDtoRes;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class FishDtoReq {
     @NotNull private  String  name;
     @NotNull private double averageWeight;
     @NotNull private Long level_id;
}
