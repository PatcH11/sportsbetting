package ru.argus.sportsbetting.data.mapper;

import org.mapstruct.Mapper;
import ru.argus.sportsbetting.data.dto.get.ResultGetDto;
import ru.argus.sportsbetting.data.entity.Result;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ResultMapper {

    ResultGetDto toGetDto(Result result);

    List<ResultGetDto> toGetDto(Iterable<Result> results);
}
