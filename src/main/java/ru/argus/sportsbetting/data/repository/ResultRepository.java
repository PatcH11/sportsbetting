package ru.argus.sportsbetting.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.argus.sportsbetting.data.entity.Result;

public interface ResultRepository extends JpaRepository<Result, Long> {
}