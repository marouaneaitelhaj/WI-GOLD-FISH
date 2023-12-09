package com.WI.WIGOLDFISH.dto.hunting;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HuntingDtoReq {
    @NotNull private  Long id;
    @NotNull private int numberOfFish;
    @NotNull private String fish_id;
    @NotNull private Long member_id;
    @NotNull private String competition_id;
}
