package com.WI.WIGOLDFISH.IDs;

import com.WI.WIGOLDFISH.ENTITIES.Competition;
import com.WI.WIGOLDFISH.ENTITIES.Member;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class RankingId implements Serializable {
    private int member_id;
    private String competition_id;
}
