package com.WI.WIGOLDFISH.services.impl;

import com.WI.WIGOLDFISH.entities.member.MemberDtoReq;
import com.WI.WIGOLDFISH.entities.member.MemberDtoRes;
import com.WI.WIGOLDFISH.services.interfaces.MemberService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

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
    public List<MemberDtoRes> findAll() {
        return null;
    }
}
