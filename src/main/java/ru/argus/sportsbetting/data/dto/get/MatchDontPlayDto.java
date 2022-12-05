package ru.argus.sportsbetting.data.dto.get;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link ru.argus.sportsbetting.data.entity.Match} entity
 */
public class MatchDontPlayDto implements Serializable {
    private final Long id;
    private final SportGameGetDto sportGame;
    private final TeamGetDto teamHome;
    private final TeamGetDto teamAway;

    public MatchDontPlayDto(Long id, SportGameGetDto sportGame, TeamGetDto teamHome, TeamGetDto teamAway) {
        this.id = id;
        this.sportGame = sportGame;
        this.teamHome = teamHome;
        this.teamAway = teamAway;
    }

    public Long getId() {
        return id;
    }

    public SportGameGetDto getSportGame() {
        return sportGame;
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
        MatchDontPlayDto entity = (MatchDontPlayDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.sportGame, entity.sportGame) &&
                Objects.equals(this.teamHome, entity.teamHome) &&
                Objects.equals(this.teamAway, entity.teamAway);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sportGame, teamHome, teamAway);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "sportGame = " + sportGame + ", " +
                "teamHome = " + teamHome + ", " +
                "teamAway = " + teamAway + ")";
    }
}