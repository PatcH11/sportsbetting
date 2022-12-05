package ru.argus.sportsbetting.data.dto.get;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link ru.argus.sportsbetting.data.entity.Result} entity
 */
public class ResultGetDto implements Serializable {
    private final Long id;
    private final MatchGetDto match;
    private final ScoreGetDto score;

    public ResultGetDto(Long id, MatchGetDto match, ScoreGetDto score) {
        this.id = id;
        this.match = match;
        this.score = score;
    }

    public Long getId() {
        return id;
    }

    public MatchGetDto getMatch() {
        return match;
    }

    public ScoreGetDto getScore() {
        return score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResultGetDto entity = (ResultGetDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.match, entity.match) &&
                Objects.equals(this.score, entity.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, match, score);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "match = " + match + ", " +
                "score = " + score + ")";
    }
}