package ru.argus.sportsbetting.controller;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import ru.argus.sportsbetting.data.dto.create.BetCreateDto;
import ru.argus.sportsbetting.data.dto.get.BetGetDto;
import ru.argus.sportsbetting.service.BetService;

import java.util.List;

@Controller
public class BetController {

    private final BetService betService;

    public BetController(BetService betService) {
        this.betService = betService;
    }

    @MutationMapping
    public BetGetDto createBet(@Argument("betCreateInput") BetCreateDto betCreateDto) {
        return betService.create(betCreateDto);
    }

    @QueryMapping
    public List<BetGetDto> getAllUserBets(@Argument Long userId) {
        return betService.getAllBetsByUserId(userId);
    }
}
