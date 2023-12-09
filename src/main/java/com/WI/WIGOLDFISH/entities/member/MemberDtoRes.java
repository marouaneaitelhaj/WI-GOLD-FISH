package com.WI.WIGOLDFISH.dto.member;

import com.WI.WIGOLDFISH.dto.hunting.HuntingDtoReq;
import com.WI.WIGOLDFISH.dto.ranking.RankingDtoReq;
import com.WI.WIGOLDFISH.enums.IndentityDocumentType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberDtoRes {
    private Long num;
    private String name;
    private String familyName;
    private LocalDate accessionDate;
    private String nationality;
    private IndentityDocumentType indentityDocumentType;
    private String indentityNumber;
    private List<RankingDtoReq> rankings;
    private List<HuntingDtoReq> huntings;
}
