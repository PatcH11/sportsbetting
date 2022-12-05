package ru.argus.sportsbetting.data.mapper;

import org.mapstruct.Mapper;
import ru.argus.sportsbetting.data.dto.get.ScoreGetDto;
import ru.argus.sportsbetting.data.entity.Score;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ScoreMapper {

    ScoreGetDto toGetDto(Score score);

    List<ScoreGetDto> toGetDto(Iterable<Score> scores);
}
