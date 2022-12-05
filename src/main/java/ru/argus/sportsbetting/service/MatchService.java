package ru.argus.sportsbetting.service;

import ru.argus.sportsbetting.data.dto.get.MatchDontPlayDto;
import ru.argus.sportsbetting.data.dto.get.MatchGetDto;

import java.util.List;

public interface MatchService {

    List<MatchDontPlayDto> getDontPlayMatches();

    List<MatchGetDto> getMatches();

    void playMatches();
}
