package com.WI.WIGOLDFISH.dto.level;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import com.WI.WIGOLDFISH.dto.fish.FishDtoReq;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LevelDtoRes {
    private  Long code;
    private String description;
    private int points;
    private List<FishDtoReq> fishList;
}
