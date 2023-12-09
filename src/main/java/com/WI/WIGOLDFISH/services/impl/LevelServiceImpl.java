package com.WI.WIGOLDFISH.services.impl;

import com.WI.WIGOLDFISH.entities.level.Level;
import com.WI.WIGOLDFISH.entities.level.LevelDtoReq;
import com.WI.WIGOLDFISH.entities.level.LevelDtoRes;
import com.WI.WIGOLDFISH.exceptions.ResourceNotFound;
import com.WI.WIGOLDFISH.repositories.LevelRepository;
import com.WI.WIGOLDFISH.services.interfaces.LevelService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class LevelServiceImpl implements LevelService {
    @Autowired
    private LevelRepository levelRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public LevelDtoReq save(LevelDtoReq dtoMini) {
        Level level = modelMapper.map(dtoMini, Level.class);
        level = levelRepository.save(level);
        return modelMapper.map(level, LevelDtoReq.class);
    }

    @Override
    public LevelDtoReq update(LevelDtoReq dtoMini, Long aLong) {
        levelRepository.findById(aLong).orElseThrow(() -> new ResourceNotFound("Level not found"));
        Level level = modelMapper.map(dtoMini, Level.class);
        level.setCode(aLong);
        level = levelRepository.save(level);
        return modelMapper.map(level, LevelDtoReq.class);
    }

    @Override
    public Boolean delete(Long aLong) {
        levelRepository.findById(aLong).orElseThrow(() -> new ResourceNotFound("Level not found"));
        levelRepository.deleteById(aLong);
        if (levelRepository.findById(aLong).isPresent()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public LevelDtoRes findOne(Long aLong) {
        Level level = levelRepository.findById(aLong).orElseThrow(() -> new ResourceNotFound("Level not found"));
        return modelMapper.map(level, LevelDtoRes.class);
    }

    @Override
    public List<LevelDtoRes> findAll() {
        List<LevelDtoRes> levelDtoResList = levelRepository.findAll().stream().map(level -> modelMapper.map(level, LevelDtoRes.class)).toList();
        return levelDtoResList;
    }
}
