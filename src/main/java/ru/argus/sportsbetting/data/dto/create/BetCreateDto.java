package ru.argus.sportsbetting.data.dto.create;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link ru.argus.sportsbetting.data.entity.Bet} entity
 */
public class BetCreateDto implements Serializable {
    private final Long userId;
    private final Long matchId;
    private final Long teamWinnerId;

    public BetCreateDto(Long userId, Long matchId, Long teamWinnerId) {
        this.userId = userId;
        this.matchId = matchId;
        this.teamWinnerId = teamWinnerId;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getMatchId() {
        return matchId;
    }

    public Long getTeamWinnerId() {
        return teamWinnerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BetCreateDto entity = (BetCreateDto) o;
        return Objects.equals(this.userId, entity.userId) &&
                Objects.equals(this.matchId, entity.matchId) &&
                Objects.equals(this.teamWinnerId, entity.teamWinnerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, matchId, teamWinnerId);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "userId = " + userId + ", " +
                "matchId = " + matchId + ", " +
                "teamWinnerId = " + teamWinnerId + ")";
    }
}