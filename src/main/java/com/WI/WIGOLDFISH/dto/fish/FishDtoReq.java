package com.WI.WIGOLDFISH.dto.fish;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import com.WI.WIGOLDFISH.dto.level.LevelDtoRes;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class FishDtoReq {
    private  String  name;
    private double averageWeight;
    private Long level_id;
}
