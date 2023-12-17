package com.WI.WIGOLDFISH.services;

import com.WI.WIGOLDFISH.entities.competition.Competition;
import com.WI.WIGOLDFISH.entities.fish.Fish;
import com.WI.WIGOLDFISH.entities.hunting.Hunting;
import com.WI.WIGOLDFISH.entities.hunting.HuntingDtoReq;
import com.WI.WIGOLDFISH.entities.member.Member;
import com.WI.WIGOLDFISH.repositories.*;
import com.WI.WIGOLDFISH.services.impl.CompetitionServiceImpl;
import com.WI.WIGOLDFISH.services.impl.HuntingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import static org.mockito.BDDMockito.given;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import java.util.Optional;
@ExtendWith(MockitoExtension.class)
public class CompetitionServiceImplTest {
    @InjectMocks
    private HuntingServiceImpl huntingService;

    @Mock
    private CompetitionRepository competitionRepository;
}
