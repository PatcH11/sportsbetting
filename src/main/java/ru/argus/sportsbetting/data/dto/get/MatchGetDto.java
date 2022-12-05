package ru.argus.sportsbetting.data.dto.get;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link ru.argus.sportsbetting.data.entity.Match} entity
 */
public class MatchGetDto implements Serializable {
    private final Long id;
    private final SportGameGetDto sportGame;
    private final ScoreGetDto score;
    private final TeamGetDto teamHome;
    private final TeamGetDto teamAway;

    public MatchGetDto(Long id, SportGameGetDto sportGame, ScoreGetDto score, TeamGetDto teamHome, TeamGetDto teamAway) {
        this.id = id;
        this.sportGame = sportGame;
        this.score = score;
        this.teamHome = teamHome;
        this.teamAway = teamAway;
    }

    public Long getId() {
        return id;
    }

    public SportGameGetDto getSportGame() {
        return sportGame;
    }

    public ScoreGetDto getScore() {
        return score;
    }

    public TeamGetDto getTeamHome() {
        return teamHome;
    }

    public TeamGetDto getTeamAway() {
        return teamAway;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MatchGetDto entity = (MatchGetDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.sportGame, entity.sportGame) &&
                Objects.equals(this.score, entity.score) &&
                Objects.equals(this.teamHome, entity.teamHome) &&
                Objects.equals(this.teamAway, entity.teamAway);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sportGame, score, teamHome, teamAway);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "sportGame = " + sportGame + ", " +
                "score = " + score + ", " +
                "teamHome = " + teamHome + ", " +
                "teamAway = " + teamAway + ")";
    }
}