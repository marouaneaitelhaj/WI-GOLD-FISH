package com.WI.WIGOLDFISH.entities.hunting;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HuntingDtoReq {
     private  Long id;
     private int numberOfFish;
     private String fish_id;
     private Long member_id;
     private String competition_id;
}
