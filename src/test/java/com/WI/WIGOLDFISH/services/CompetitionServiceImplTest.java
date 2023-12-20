package com.WI.WIGOLDFISH.services;

import com.WI.WIGOLDFISH.entities.competition.Competition;
import com.WI.WIGOLDFISH.entities.fish.Fish;
import com.WI.WIGOLDFISH.entities.hunting.Hunting;
import com.WI.WIGOLDFISH.entities.hunting.HuntingDtoReq;
import com.WI.WIGOLDFISH.entities.member.Member;
import com.WI.WIGOLDFISH.entities.ranking.Ranking;
import com.WI.WIGOLDFISH.exceptions.ResourceNotFound;
import com.WI.WIGOLDFISH.ids.RankingId;
import com.WI.WIGOLDFISH.repositories.*;
import com.WI.WIGOLDFISH.services.impl.HuntingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
public class CompetitionServiceImplTest {
    @InjectMocks
    private HuntingServiceImpl huntingService;

    @Mock
    private CompetitionRepository competitionRepository;
    @Mock
    private FishRepository fishRepository;
    @Mock
    private MemberRepository memberRepository;
    @Mock
    private ModelMapper modelMapper;
    @Mock
    private HuntingRepository huntingRepository;
    @Mock
    private RankingRepository rankingRepository;


    HuntingDtoReq dtoMini;

    Hunting hunting;
    HuntingDtoReq huntingDtoReq;

    Competition competition;

    Fish fish;
    Ranking ranking;

    RankingId rankingId;
    Member member;

    @BeforeEach
    public void setUp() {
        competition = new Competition();
        competition.setCode("its-12-12-23");
        dtoMini = new HuntingDtoReq();
        dtoMini.setCompetition_id(competition.getCode());
        dtoMini.setFish_id("hota");
        dtoMini.setMember_id(1L);
        dtoMini.setNumberOfFish(1);
        fish = new Fish();
        fish.setName("hota");
        hunting = new Hunting();
        hunting.setCompetition(competition);
        hunting.setFish(fish);
        hunting.setMember(new Member(1L));
        hunting.setNumberOfFish(1);
        rankingId = new RankingId();
        rankingId.setCompetition(competition);
        rankingId.setMember(new Member(1L));
        ranking = new Ranking();
        ranking.setRankingId(rankingId);
        ranking.setScore(10);
        member = new Member();
        member.setNum(1L);
        huntingDtoReq = new HuntingDtoReq();
        huntingDtoReq.setCompetition_id(competition.getCode());
    }

    @Test
    public void testSaveFuncWithCompetitionNotExist() {
        given(competitionRepository.findById(anyString())).willReturn(Optional.empty());
        assertThrows(ResourceNotFound.class, () -> huntingService.save(dtoMini));
    }

    @Test
    public void testSaveFuncWithFishNotExist() {
        given(competitionRepository.findById(anyString())).willReturn(Optional.of(competition));
        given(fishRepository.findById(anyString())).willReturn(Optional.empty());
        assertThrows(ResourceNotFound.class, () -> huntingService.save(dtoMini));
    }

    @Test
    public void testSaveFuncWithMemberNotExist() {
        given(competitionRepository.findById(anyString())).willReturn(Optional.of(competition));
        given(fishRepository.findById(anyString())).willReturn(Optional.of(fish));
        given(memberRepository.findById(anyLong())).willReturn(Optional.empty());
        assertThrows(ResourceNotFound.class, () -> huntingService.save(dtoMini));
    }


    @Test
    public void testCreateNewHunting() {
        given(modelMapper.map(any(HuntingDtoReq.class), eq(Hunting.class))).willReturn(hunting);
        given(huntingRepository.save(any(Hunting.class))).willReturn(hunting);
        given(modelMapper.map(any(Hunting.class), eq(HuntingDtoReq.class))).willReturn(dtoMini);

        HuntingDtoReq result = huntingService.createNewHunting(dtoMini, competition, fish, member);

        assertEquals(dtoMini, result);
    }



}
