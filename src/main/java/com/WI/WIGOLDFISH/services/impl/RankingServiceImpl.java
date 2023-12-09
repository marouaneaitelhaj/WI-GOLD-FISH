package com.WI.WIGOLDFISH.services.impl;

import com.WI.WIGOLDFISH.entities.competition.CompetitionDtoReq;
import com.WI.WIGOLDFISH.entities.competition.CompetitionDtoRes;
import com.WI.WIGOLDFISH.entities.ranking.RankingDtoReq;
import com.WI.WIGOLDFISH.entities.ranking.RankingDtoRes;
import com.WI.WIGOLDFISH.ids.RankingId;
import com.WI.WIGOLDFISH.services.interfaces.CompetitionService;
import com.WI.WIGOLDFISH.services.interfaces.RankingService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class RankingServiceImpl implements RankingService {
    @Override
    public RankingDtoReq save(RankingDtoReq dtoMini) {
        return null;
    }

    @Override
    public RankingDtoReq update(RankingDtoReq dtoMini, RankingId rankingId) {
        return null;
    }

    @Override
    public Boolean delete(RankingId rankingId) {
        return null;
    }

    @Override
    public RankingDtoRes findOne(RankingId rankingId) {
        return null;
    }

    @Override
    public List<RankingDtoRes> findAll() {
        return null;
    }
}
