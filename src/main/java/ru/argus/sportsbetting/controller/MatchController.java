package ru.argus.sportsbetting.controller;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import ru.argus.sportsbetting.data.dto.get.MatchDontPlayDto;
import ru.argus.sportsbetting.data.dto.get.MatchGetDto;
import ru.argus.sportsbetting.service.MatchService;

import java.util.List;

@Controller
public class MatchController {

    private final MatchService matchService;
    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @QueryMapping
    public List<MatchGetDto> getAllMatches() {
        return matchService.getMatches();
    }

    @QueryMapping
    public void playMatches() {
        matchService.playMatches();
    }

    @QueryMapping
    public List<MatchDontPlayDto> getDontPlayMatches() {
        return matchService.getDontPlayMatches();
    }
}
