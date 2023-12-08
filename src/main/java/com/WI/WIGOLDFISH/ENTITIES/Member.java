package com.WI.WIGOLDFISH.ENTITIES;

import com.WI.WIGOLDFISH.ENUMS.IndentityDocumentType;
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
public class Member {
    @Id
    @Column(name = "member_id")
    private int num;
    private String name;
    private String familyName;
    private LocalDate accessionDate;
    private String nationality;
    private IndentityDocumentType indentityDocumentType;
    private String indentityNumber;
}
