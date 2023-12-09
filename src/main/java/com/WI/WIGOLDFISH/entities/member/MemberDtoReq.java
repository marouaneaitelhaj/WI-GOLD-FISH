package com.WI.WIGOLDFISH.dto.member;

import com.WI.WIGOLDFISH.enums.IndentityDocumentType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class    MemberDtoReq {
    @NotNull private Long num;
    @NotNull private String name;
    @NotNull private String familyName;
    @NotNull private LocalDate accessionDate;
    @NotNull private String nationality;
    @NotNull private IndentityDocumentType indentityDocumentType;
    @NotNull private String indentityNumber;
}
