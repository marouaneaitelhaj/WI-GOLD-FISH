package com.WI.WIGOLDFISH.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Fish {
    @Id
    private  String  name;
    private double averageWeight;
    @ManyToOne
    private Level level;
    @OneToMany(mappedBy = "fish", fetch = FetchType.LAZY)
    private List<Hunting> huntingList;
}