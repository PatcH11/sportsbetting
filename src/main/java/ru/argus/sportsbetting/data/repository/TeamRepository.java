package ru.argus.sportsbetting.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.argus.sportsbetting.data.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {
}