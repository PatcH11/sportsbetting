package ru.argus.sportsbetting.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.argus.sportsbetting.data.entity.Match;

import java.util.List;
import java.util.Optional;

public interface MatchRepository extends JpaRepository<Match, Long> {

    Optional<Match> findByTeamHome_IdOrTeamAway_Id(Long homeId, Long awayId);

    List<Match> findByScoreNull();

    Optional<Match> findByIdAndScoreNull(Long id);
}