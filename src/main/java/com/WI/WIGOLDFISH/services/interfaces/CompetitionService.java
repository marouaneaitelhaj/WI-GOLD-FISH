package com.WI.WIGOLDFISH.services.interfaces;

import com.WI.WIGOLDFISH.entities.competition.CompetitionDtoReq;
import com.WI.WIGOLDFISH.entities.competition.CompetitionDtoRes;
import com.WI.WIGOLDFISH.services.BaseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CompetitionService extends BaseService<CompetitionDtoRes, CompetitionDtoReq, String> {
    Page<CompetitionDtoRes> findAll(Pageable pageable);
}
