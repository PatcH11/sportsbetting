package ru.argus.sportsbetting.data.dto.get;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link ru.argus.sportsbetting.data.entity.Score} entity
 */
public class ScoreGetDto implements Serializable {
    private final Long id;
    private final Integer homeTeamScore;
    private final Integer awayTeamScore;

    public ScoreGetDto(Long id, Integer homeTeamScore, Integer awayTeamScore) {
        this.id = id;
        this.homeTeamScore = homeTeamScore;
        this.awayTeamScore = awayTeamScore;
    }

    public Long getId() {
        return id;
    }

    public Integer getHomeTeamScore() {
        return homeTeamScore;
    }

    public Integer getAwayTeamScore() {
        return awayTeamScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScoreGetDto entity = (ScoreGetDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.homeTeamScore, entity.homeTeamScore) &&
                Objects.equals(this.awayTeamScore, entity.awayTeamScore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, homeTeamScore, awayTeamScore);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "homeTeamScore = " + homeTeamScore + ", " +
                "awayTeamScore = " + awayTeamScore + ")";
    }
}