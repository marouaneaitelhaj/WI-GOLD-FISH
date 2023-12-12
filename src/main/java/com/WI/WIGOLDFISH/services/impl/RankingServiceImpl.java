package com.WI.WIGOLDFISH.services.impl;

import com.WI.WIGOLDFISH.entities.competition.Competition;
import com.WI.WIGOLDFISH.entities.competition.CompetitionDtoReq;
import com.WI.WIGOLDFISH.entities.competition.CompetitionDtoRes;
import com.WI.WIGOLDFISH.entities.member.Member;
import com.WI.WIGOLDFISH.entities.ranking.Ranking;
import com.WI.WIGOLDFISH.entities.ranking.RankingDtoReq;
import com.WI.WIGOLDFISH.entities.ranking.RankingDtoRes;
import com.WI.WIGOLDFISH.exceptions.ResourceNotFound;
import com.WI.WIGOLDFISH.ids.RankingId;
import com.WI.WIGOLDFISH.repositories.CompetitionRepository;
import com.WI.WIGOLDFISH.repositories.MemberRepository;
import com.WI.WIGOLDFISH.repositories.RankingRepository;
import com.WI.WIGOLDFISH.services.interfaces.CompetitionService;
import com.WI.WIGOLDFISH.services.interfaces.MemberService;
import com.WI.WIGOLDFISH.services.interfaces.RankingService;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class RankingServiceImpl implements RankingService {
    private final RankingRepository rankingRepository;
    private final CompetitionRepository competitionRepository;
    private final ModelMapper modelMapper;
    private final MemberRepository memberRepository;

    @Override
    public RankingDtoReq save(RankingDtoReq dtoMini) {
        competitionRepository.findById(dtoMini.getCompetition_id())
                .orElseThrow(() -> new ResourceNotFound("Competition not found"));
        memberRepository.findById(dtoMini.getMember_id()).orElseThrow(() -> new ResourceNotFound("Member not found"));
        Ranking ranking = modelMapper.map(dtoMini, Ranking.class);
        ranking.setCompetition(new Competition(dtoMini.getCompetition_id()));
        ranking.setMember(new Member(dtoMini.getMember_id()));
        ranking = rankingRepository.save(ranking);
        return modelMapper.map(ranking, RankingDtoReq.class);
    }

    @Override
    public RankingDtoReq update(RankingDtoReq dtoMini, RankingId rankingId) {
        competitionRepository.findById(dtoMini.getCompetition_id())
                .orElseThrow(() -> new ResourceNotFound("Competition not found"));
        memberRepository.findById(dtoMini.getMember_id()).orElseThrow(() -> new ResourceNotFound("Member not found"));
        Ranking ranking = modelMapper.map(dtoMini, Ranking.class);
        ranking.setCompetition(new Competition(dtoMini.getCompetition_id()));
        ranking.setMember(new Member(dtoMini.getMember_id()));
        ranking.setRankingId(rankingId);
        ranking = rankingRepository.save(ranking);
        return modelMapper.map(ranking, RankingDtoReq.class);
    }

    @Override
    public Boolean delete(RankingId rankingId) {
        rankingRepository.findById(rankingId).orElseThrow(() -> new ResourceNotFound("Ranking not found"));
        rankingRepository.deleteById(rankingId);
        if (rankingRepository.findById(rankingId).isPresent()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public RankingDtoRes findOne(RankingId rankingId) {
        Ranking ranking = rankingRepository.findById(rankingId)
                .orElseThrow(() -> new ResourceNotFound("Ranking not found"));
        return modelMapper.map(ranking, RankingDtoRes.class);
    }

    @Override
    public List<RankingDtoRes> findAll() {
        List<RankingDtoRes> rankingDtoRes = rankingRepository.findAll().stream()
                .map(ranking -> modelMapper.map(ranking, RankingDtoRes.class)).toList();
        return rankingDtoRes;
    }
}
