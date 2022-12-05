package ru.argus.sportsbetting.data.dto.get;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link ru.argus.sportsbetting.data.entity.Bet} entity
 */
public class BetGetDto implements Serializable {
    private final Long id;
    private final UserGetDto user;
    private final MatchGetDto match;
    private final TeamGetDto teamWinner;

    public BetGetDto(Long id, UserGetDto user, MatchGetDto match, TeamGetDto teamWinner) {
        this.id = id;
        this.user = user;
        this.match = match;
        this.teamWinner = teamWinner;
    }

    public Long getId() {
        return id;
    }

    public UserGetDto getUser() {
        return user;
    }

    public MatchGetDto getMatch() {
        return match;
    }

    public TeamGetDto getTeamWinner() {
        return teamWinner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BetGetDto entity = (BetGetDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.user, entity.user) &&
                Objects.equals(this.match, entity.match) &&
                Objects.equals(this.teamWinner, entity.teamWinner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, match, teamWinner);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "user = " + user + ", " +
                "match = " + match + ", " +
                "teamWinner = " + teamWinner + ")";
    }
}