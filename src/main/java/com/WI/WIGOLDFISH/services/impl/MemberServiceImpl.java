package com.WI.WIGOLDFISH.services.impl;

import com.WI.WIGOLDFISH.dto.member.MemberDtoReq;
import com.WI.WIGOLDFISH.dto.member.MemberDtoRes;
import com.WI.WIGOLDFISH.services.interfaces.MemberService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class MemberServiceImpl implements MemberService {
    @Override
    public MemberDtoReq save(MemberDtoReq dtoMini) {
        return null;
    }

    @Override
    public MemberDtoReq update(MemberDtoReq dtoMini, Long aLong) {
        return null;
    }

    @Override
    public Boolean delete(Long aLong) {
        return null;
    }

    @Override
    public MemberDtoRes findOne(Long aLong) {
        return null;
    }

    @Override
    public Page<MemberDtoRes> findAll(Pageable pageable) {
        return null;
    }
}