package ru.argus.sportsbetting.data.mapper;

import org.mapstruct.Mapper;
import ru.argus.sportsbetting.data.dto.get.TeamGetDto;
import ru.argus.sportsbetting.data.entity.Team;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TeamMapper {

    TeamGetDto toGetDto(Team team);

    List<TeamGetDto> toGetDto(Iterable<Team> teams);
}
