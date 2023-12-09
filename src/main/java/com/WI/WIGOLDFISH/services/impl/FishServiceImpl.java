package com.WI.WIGOLDFISH.services.impl;

import com.WI.WIGOLDFISH.entities.fish.Fish;
import com.WI.WIGOLDFISH.entities.fish.FishDtoReq;
import com.WI.WIGOLDFISH.entities.fish.FishDtoRes;
import com.WI.WIGOLDFISH.exceptions.ResourceNotFound;
import com.WI.WIGOLDFISH.repositories.FishRepository;
import com.WI.WIGOLDFISH.repositories.LevelRepository;
import com.WI.WIGOLDFISH.services.interfaces.FishService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class FishServiceImpl implements FishService {
    @Autowired
    private FishRepository fishRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private LevelRepository levelRepository;
    @Override
    public FishDtoReq save(FishDtoReq dtoMini) {
        levelRepository.findById(dtoMini.getLevel_id()).orElseThrow(() -> new ResourceNotFound("Level not found"));
        Fish fish = modelMapper.map(dtoMini, Fish.class);
        fish = fishRepository.save(fish);
        return modelMapper.map(fish, FishDtoReq.class);
    }

    @Override
    public FishDtoReq update(FishDtoReq dtoMini, String s) {
        fishRepository.findById(s).orElseThrow(() -> new ResourceNotFound("Fish not found"));
        levelRepository.findById(dtoMini.getLevel_id()).orElseThrow(() -> new ResourceNotFound("Level not found"));
        Fish fish = modelMapper.map(dtoMini, Fish.class);
        fish.setName(s);
        fish = fishRepository.save(fish);
        return modelMapper.map(fish, FishDtoReq.class);
    }

    @Override
    public Boolean delete(String s) {
        fishRepository.findById(s).orElseThrow(() -> new ResourceNotFound("Fish not found"));
        fishRepository.deleteById(s);
        if (fishRepository.findById(s).isPresent()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public FishDtoRes findOne(String s) {
        Fish fish = fishRepository.findById(s).orElseThrow(() -> new ResourceNotFound("Fish not found"));
        return modelMapper.map(fish, FishDtoRes.class);
    }

    @Override
    public List<FishDtoRes> findAll() {
        List<FishDtoRes> fishDtoRes = fishRepository.findAll().stream().map(fish -> modelMapper.map(fish, FishDtoRes.class)).toList();
        return fishDtoRes;
    }
}
