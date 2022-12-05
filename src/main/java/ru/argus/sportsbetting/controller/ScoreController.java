package ru.argus.sportsbetting.controller;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import ru.argus.sportsbetting.data.dto.get.ScoreGetDto;
import ru.argus.sportsbetting.service.ScoreService;

import java.util.List;

@Controller
public class ScoreController {

    private final ScoreService scoreService;

    public ScoreController(ScoreService scoreService) {
        this.scoreService = scoreService;
    }

    @QueryMapping
    public List<ScoreGetDto> getAllScores() {
        return scoreService.getScores();
    }
}
