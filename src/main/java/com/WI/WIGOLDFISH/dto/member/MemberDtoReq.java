package com.WI.WIGOLDFISH.dto.member;

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
@Entity
@Table(name = "member")
public class    MemberDtoReq {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long num;
    private String name;
    private String familyName;
    private LocalDate accessionDate;
    private String nationality;
    private IndentityDocumentType indentityDocumentType;
    private String indentityNumber;
    @OneToMany(mappedBy = "member")
    private List<RankingDtoReq> rankings;
    @OneToMany(mappedBy = "member")
    private List<HuntingDtoReq> huntings;
}
