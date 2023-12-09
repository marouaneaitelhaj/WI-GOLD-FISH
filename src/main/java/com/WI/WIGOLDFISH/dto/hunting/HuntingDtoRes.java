package com.WI.WIGOLDFISH.dto.hunting;

import com.WI.WIGOLDFISH.dto.competition.CompetitionDtoReq;
import com.WI.WIGOLDFISH.dto.fish.FishDtoReq;
import com.WI.WIGOLDFISH.dto.member.MemberDtoReq;

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
public class HuntingDtoRes {
    private  Long id;
    private int numberOfFish;
    private FishDtoReq fish;
    private MemberDtoReq member;
    private CompetitionDtoReq competition;
}
