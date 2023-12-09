package com.WI.WIGOLDFISH.dto.fish;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class FishDtoRes {
    @Id
    private  String  name;
    private double averageWeight;
    @ManyToOne
    private LevelDtoRes level;
    @OneToMany(mappedBy = "fish", fetch = FetchType.LAZY)
    private List<HuntingDtoReq> huntingList;
}
