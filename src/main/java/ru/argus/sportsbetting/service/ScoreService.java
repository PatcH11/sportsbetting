package ru.argus.sportsbetting.service;

import ru.argus.sportsbetting.data.dto.get.ScoreGetDto;

import java.util.List;

public interface ScoreService {

    List<ScoreGetDto> getScores();
}
