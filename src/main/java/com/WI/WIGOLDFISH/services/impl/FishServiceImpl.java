package com.WI.WIGOLDFISH.services.impl;

import com.WI.WIGOLDFISH.dto.fish.FishDtoReq;
import com.WI.WIGOLDFISH.dto.fish.FishDtoRes;
import com.WI.WIGOLDFISH.services.interfaces.FishService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class FishServiceImpl implements FishService {
    @Override
    public FishDtoReq save(FishDtoReq dtoMini) {
        return null;
    }

    @Override
    public FishDtoReq update(FishDtoReq dtoMini, String s) {
        return null;
    }

    @Override
    public Boolean delete(String s) {
        return null;
    }

    @Override
    public FishDtoRes findOne(String s) {
        return null;
    }

    @Override
    public Page<FishDtoRes> findAll(Pageable pageable) {
        return null;
    }
}