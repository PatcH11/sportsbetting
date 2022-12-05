package ru.argus.sportsbetting.service.impl;

import org.springframework.stereotype.Service;
import ru.argus.sportsbetting.data.dto.create.BetCreateDto;
import ru.argus.sportsbetting.data.dto.get.BetGetDto;
import ru.argus.sportsbetting.data.entity.Match;
import ru.argus.sportsbetting.data.mapper.BetMapper;
import ru.argus.sportsbetting.data.repository.BetRepository;
import ru.argus.sportsbetting.data.repository.MatchRepository;
import ru.argus.sportsbetting.service.BetService;

import java.util.List;
import java.util.Optional;

@Service
public class BetServiceImpl implements BetService {

    private final BetMapper betMapper;
    private final BetRepository betRepository;
    private final MatchRepository matchRepository;

    public BetServiceImpl(BetMapper betMapper,
                          BetRepository betRepository,
                          MatchRepository matchRepository) {
        this.betMapper = betMapper;
        this.betRepository = betRepository;
        this.matchRepository = matchRepository;
    }

    @Override
    public BetGetDto create(BetCreateDto betCreateDto) {
        Optional<Match> matchOptional = matchRepository.findByIdAndScoreNull(betCreateDto.getMatchId());

        if (matchOptional.isPresent()) {
            return betMapper.toGetDto(betRepository.save(betMapper.fromCreateDto(betCreateDto)));
        } else {
            throw new RuntimeException("Unable to place a bet, the match has already been played.");
        }
    }

    @Override
    public List<BetGetDto> getAllBetsByUserId(Long userId) {
        return betMapper.toGetDto(betRepository.findByUser_Id(userId));
    }
}
