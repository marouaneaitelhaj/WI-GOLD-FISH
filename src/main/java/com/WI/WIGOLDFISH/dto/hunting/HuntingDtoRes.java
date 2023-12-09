package com.WI.WIGOLDFISH.dto.hunting;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Hunting {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private  Long id;
    private int numberOfFish;
    @ManyToOne
    private Fish fish;
    @ManyToOne
    private MemberDtoReq member;
    @ManyToOne
    private CompetitionDtoReq competition;
}
