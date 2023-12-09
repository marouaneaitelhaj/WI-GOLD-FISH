package com.WI.WIGOLDFISH.services.impl;

import com.WI.WIGOLDFISH.dto.competition.CompetitionDtoReq;
import com.WI.WIGOLDFISH.dto.competition.CompetitionDtoRes;
import com.WI.WIGOLDFISH.services.interfaces.CompetitionService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class RankingServiceImpl implements CompetitionService {
    @Override
    public CompetitionDtoReq save(CompetitionDtoReq dtoMini) {
        return null;
    }

    @Override
    public CompetitionDtoReq update(CompetitionDtoReq dtoMini, String s) {
        return null;
    }

    @Override
    public Boolean delete(String s) {
        return null;
    }

    @Override
    public CompetitionDtoRes findOne(String s) {
        return null;
    }

    @Override
    public Page<CompetitionDtoRes> findAll(Pageable pageable) {
        return null;
    }
}
