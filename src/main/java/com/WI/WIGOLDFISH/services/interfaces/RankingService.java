package com.WI.WIGOLDFISH.services.interfaces;

import com.WI.WIGOLDFISH.dto.competition.CompetitionDtoReq;
import com.WI.WIGOLDFISH.dto.competition.CompetitionDtoRes;
import com.WI.WIGOLDFISH.dto.ranking.RankingDtoReq;
import com.WI.WIGOLDFISH.dto.ranking.RankingDtoRes;
import com.WI.WIGOLDFISH.ids.RankingId;
import com.WI.WIGOLDFISH.services.BaseService;

public interface RankingService extends BaseService<RankingDtoRes, RankingDtoReq, RankingId> {
}
