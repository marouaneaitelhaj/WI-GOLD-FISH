package com.WI.WIGOLDFISH.services.impl;

import com.WI.WIGOLDFISH.dto.hunting.HuntingDtoReq;
import com.WI.WIGOLDFISH.dto.hunting.HuntingDtoRes;
import com.WI.WIGOLDFISH.services.interfaces.HuntingService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class HuntingServiceImpl implements HuntingService {
    @Override
    public HuntingDtoReq save(HuntingDtoReq dtoMini) {
        return null;
    }

    @Override
    public HuntingDtoReq update(HuntingDtoReq dtoMini, Long aLong) {
        return null;
    }

    @Override
    public Boolean delete(Long aLong) {
        return null;
    }

    @Override
    public HuntingDtoRes findOne(Long aLong) {
        return null;
    }

    @Override
    public Page<HuntingDtoRes> findAll(Pageable pageable) {
        return null;
    }
}
