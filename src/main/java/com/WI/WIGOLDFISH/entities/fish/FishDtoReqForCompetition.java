package com.WI.WIGOLDFISH.entities.fish;

import ch.qos.logback.classic.Level;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FishDtoReqForCompetition {
  @NotNull
  private String name;
  @NotNull
  private double averageWeight;
  @NotNull
  private Level level;
}
