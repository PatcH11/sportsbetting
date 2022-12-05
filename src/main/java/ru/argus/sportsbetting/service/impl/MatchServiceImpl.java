package ru.argus.sportsbetting.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.argus.sportsbetting.data.dto.get.MatchDontPlayDto;
import ru.argus.sportsbetting.data.dto.get.MatchGetDto;
import ru.argus.sportsbetting.data.entity.Match;
import ru.argus.sportsbetting.data.entity.Score;
import ru.argus.sportsbetting.data.mapper.MatchMapper;
import ru.argus.sportsbetting.data.repository.MatchRepository;
import ru.argus.sportsbetting.data.repository.ScoreRepository;
import ru.argus.sportsbetting.service.MatchService;

import java.util.List;

@Service
public class MatchServiceImpl implements MatchService {

    private final MatchMapper matchMapper;
    private final ScoreRepository scoreRepository;
    private final MatchRepository matchRepository;

    public MatchServiceImpl(MatchMapper matchMapper,
                            ScoreRepository scoreRepository,
                            MatchRepository matchRepository) {
        this.matchMapper = matchMapper;
        this.scoreRepository = scoreRepository;
        this.matchRepository = matchRepository;
    }

    @Override
    public List<MatchDontPlayDto> getDontPlayMatches() {
        return matchMapper.toMatchDontPlayDto(matchRepository.findByScoreNull());
    }

    @Override
    public List<MatchGetDto> getMatches() {
        return matchMapper.toGetDto(matchRepository.findAll());
    }

    @Override
    @Transactional
    public void playMatches() {
        List<Match> matchesToPlay = matchRepository.findByScoreNull();

        for (Match match : matchesToPlay) {
            Score score = new Score();

            score.setHomeTeamScore(generateRandomNumber(5));
            score.setAwayTeamScore(generateRandomNumber(5));

            scoreRepository.save(score);

            match.setScore(score);

            matchRepository.save(match);
        }
    }

    private int generateRandomNumber(int max) {
        return (int) (Math.random() * ++max);
    }
}
