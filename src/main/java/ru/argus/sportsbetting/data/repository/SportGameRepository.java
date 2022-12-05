package ru.argus.sportsbetting.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.argus.sportsbetting.data.entity.SportGame;

public interface SportGameRepository extends JpaRepository<SportGame, Long> {
}