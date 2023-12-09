package com.WI.WIGOLDFISH.services.impl;

import com.WI.WIGOLDFISH.entities.competition.Competition;
import com.WI.WIGOLDFISH.entities.competition.CompetitionDtoReq;
import com.WI.WIGOLDFISH.entities.competition.CompetitionDtoRes;
import com.WI.WIGOLDFISH.exceptions.ResourceNotFound;
import com.WI.WIGOLDFISH.repositories.CompetitionRepository;
import com.WI.WIGOLDFISH.services.interfaces.CompetitionService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompetitionServiceImpl implements CompetitionService {
    @Autowired
    private CompetitionRepository competitionRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CompetitionDtoReq save(CompetitionDtoReq dtoMini) {
        Competition competition = modelMapper.map(dtoMini, Competition.class);
        competition = competitionRepository.save(competition);
        return modelMapper.map(competition, CompetitionDtoReq.class);
    }

    @Override
    public CompetitionDtoReq update(CompetitionDtoReq dtoMini, String s) {
        Competition competition = modelMapper.map(dtoMini, Competition.class);
        competition.setCode(s);
        competitionRepository.findById(s).orElseThrow(() -> new ResourceNotFound("Competition not found"));
        competition = competitionRepository.save(competition);
        return modelMapper.map(competition, CompetitionDtoReq.class);
    }

    @Override
    public Boolean delete(String s) {
        competitionRepository.findById(s).orElseThrow(() -> new ResourceNotFound("Competition not found"));
        competitionRepository.deleteById(s);
        if (competitionRepository.findById(s).isPresent()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public CompetitionDtoRes findOne(String s) {
        Competition competition = competitionRepository.findById(s).orElseThrow(() -> new ResourceNotFound("Competition not found"));
        return modelMapper.map(competition, CompetitionDtoRes.class);
    }

    @Override
    public List<CompetitionDtoRes> findAll() {
        return competitionRepository.findAll().stream().map(competition -> modelMapper.map(competition, CompetitionDtoRes.class)).toList();
    }

    @Override
    public Page<CompetitionDtoRes> findAll(Pageable pageable) {
        return null;
    }
}
