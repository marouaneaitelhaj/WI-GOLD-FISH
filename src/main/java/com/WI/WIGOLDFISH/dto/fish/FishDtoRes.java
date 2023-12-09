package com.WI.WIGOLDFISH.dto.fish;

import com.WI.WIGOLDFISH.dto.hunting.HuntingDtoReq;
import com.WI.WIGOLDFISH.dto.level.LevelDtoReq;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class FishDtoRes {
    private  String  name;
    private double averageWeight;
    private LevelDtoReq level;
    private List<HuntingDtoReq> huntingList;
}
