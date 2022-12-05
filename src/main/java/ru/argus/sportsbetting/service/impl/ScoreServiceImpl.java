package ru.argus.sportsbetting.service.impl;

import org.springframework.stereotype.Service;
import ru.argus.sportsbetting.data.dto.get.ScoreGetDto;
import ru.argus.sportsbetting.data.mapper.ScoreMapper;
import ru.argus.sportsbetting.data.repository.ScoreRepository;
import ru.argus.sportsbetting.service.ScoreService;

import java.util.List;

@Service
public class ScoreServiceImpl implements ScoreService {

    private final ScoreMapper scoreMapper;
    private final ScoreRepository scoreRepository;

    public ScoreServiceImpl(ScoreMapper scoreMapper,
                            ScoreRepository scoreRepository) {
        this.scoreMapper = scoreMapper;
        this.scoreRepository = scoreRepository;
    }

    @Override
    public List<ScoreGetDto> getScores() {
        return scoreMapper.toGetDto(scoreRepository.findAll());
    }
}
