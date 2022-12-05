package ru.argus.sportsbetting.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.argus.sportsbetting.data.entity.Score;

public interface ScoreRepository extends JpaRepository<Score, Long> {
}