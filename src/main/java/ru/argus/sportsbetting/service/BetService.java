package ru.argus.sportsbetting.service;

import ru.argus.sportsbetting.data.dto.create.BetCreateDto;
import ru.argus.sportsbetting.data.dto.get.BetGetDto;

import java.util.List;

public interface BetService {

    BetGetDto create(BetCreateDto betCreateDto);

    List<BetGetDto> getAllBetsByUserId(Long userId);
}
