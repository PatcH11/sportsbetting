package ru.argus.sportsbetting.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.argus.sportsbetting.data.entity.Bet;

import java.util.List;

public interface BetRepository extends JpaRepository<Bet, Long> {

    List<Bet> findByUser_Id(Long userId);
}
