package ru.argus.sportsbetting.data.dto.get;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link ru.argus.sportsbetting.data.entity.Team} entity
 */
public class TeamGetDto implements Serializable {
    private final Long id;
    private final String name;

    public TeamGetDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamGetDto entity = (TeamGetDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.name, entity.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "name = " + name + ")";
    }
}