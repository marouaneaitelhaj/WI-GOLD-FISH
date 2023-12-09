package com.WI.WIGOLDFISH.controllers;

import com.WI.WIGOLDFISH.entities.member.MemberDtoReq;
import com.WI.WIGOLDFISH.services.impl.MemberServiceImpl;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/member")
public class MemberController {
    @Autowired
    private MemberServiceImpl memberServiceImpl;

    @PostMapping
    public ResponseEntity<?> createMember(@Validated @RequestBody MemberDtoReq memberDtoReq) {
        memberDtoReq = memberServiceImpl.save(memberDtoReq);
        Map<String, Object> response = new HashMap<>();
        response.put("data", memberDtoReq);
        response.put("message", "Member created successfully");
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<?> getMembers() {
        return ResponseEntity.ok(memberServiceImpl.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getMember(@PathVariable Long s) {
        return ResponseEntity.ok(memberServiceImpl.findOne(s));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateMember(@PathVariable Long s, @Validated @RequestBody MemberDtoReq memberDtoReq) {
        memberDtoReq = memberServiceImpl.update(memberDtoReq, s);
        Map<String, Object> response = new HashMap<>();
        response.put("data", memberDtoReq);
        response.put("message", "Member updated successfully");
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteMember(@PathVariable Long s) {
        memberServiceImpl.delete(s);
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Member deleted successfully");
        return ResponseEntity.ok(response);
    }
}
