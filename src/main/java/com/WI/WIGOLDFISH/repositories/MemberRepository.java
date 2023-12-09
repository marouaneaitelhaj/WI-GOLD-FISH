package com.WI.WIGOLDFISH.repositories;

import com.WI.WIGOLDFISH.entities.Competition;
import com.WI.WIGOLDFISH.entities.Member;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
