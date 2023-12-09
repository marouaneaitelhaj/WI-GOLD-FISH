package com.WI.WIGOLDFISH.services.impl;

import com.WI.WIGOLDFISH.dto.level.LevelDtoReq;
import com.WI.WIGOLDFISH.dto.level.LevelDtoRes;
import com.WI.WIGOLDFISH.services.interfaces.LevelService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class LevelServiceImpl implements LevelService {
    @Override
    public LevelDtoReq save(LevelDtoReq dtoMini) {
        return null;
    }

    @Override
    public LevelDtoReq update(LevelDtoReq dtoMini, Long aLong) {
        return null;
    }

    @Override
    public Boolean delete(Long aLong) {
        return null;
    }

    @Override
    public LevelDtoRes findOne(Long aLong) {
        return null;
    }

    @Override
    public Page<LevelDtoRes> findAll(Pageable pageable) {
        return null;
    }
}
