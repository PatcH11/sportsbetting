package ru.argus.sportsbetting.data.mapper;

import org.mapstruct.Mapper;
import ru.argus.sportsbetting.data.dto.get.SportGameGetDto;
import ru.argus.sportsbetting.data.entity.SportGame;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SportGameMapper {

    SportGameGetDto toGetDto(SportGame sportGame);

    List<SportGameGetDto> toGetDto(Iterable<SportGame> sportGames);
}
