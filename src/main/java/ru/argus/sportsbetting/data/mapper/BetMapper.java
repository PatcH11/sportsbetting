package ru.argus.sportsbetting.data.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.argus.sportsbetting.data.dto.create.BetCreateDto;
import ru.argus.sportsbetting.data.dto.get.BetGetDto;
import ru.argus.sportsbetting.data.entity.Bet;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BetMapper {

    BetGetDto toGetDto(Bet bet);

    List<BetGetDto> toGetDto(Iterable<Bet> bets);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "user.id", source = "userId")
    @Mapping(target = "match.id", source = "matchId")
    @Mapping(target = "teamWinner.id", source = "teamWinnerId")
    Bet fromCreateDto(BetCreateDto betCreateDto);
}
