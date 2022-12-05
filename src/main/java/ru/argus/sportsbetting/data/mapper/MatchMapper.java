package ru.argus.sportsbetting.data.mapper;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;
import org.mapstruct.ReportingPolicy;
import ru.argus.sportsbetting.data.dto.get.MatchDontPlayDto;
import ru.argus.sportsbetting.data.dto.get.MatchGetDto;
import ru.argus.sportsbetting.data.entity.Match;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MatchMapper {

    MatchGetDto toGetDto(Match match);

    Match fromGetDto(MatchGetDto matchGetDto);

    List<MatchGetDto> toGetDto(Iterable<Match> matches);

    @Named("dontPlay")
    MatchDontPlayDto fromMatch(Match match);

    @IterableMapping(qualifiedByName = "dontPlay")
    List<MatchDontPlayDto> toMatchDontPlayDto(Iterable<Match> matches);
}
