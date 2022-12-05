package ru.argus.sportsbetting.data.entity;

import javax.persistence.*;

@Entity
@Table(name = "matches")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "sport_game_id", nullable = false)
    private SportGame sportGame;

    @ManyToOne
    @JoinColumn(name = "score_id")
    private Score score;

    @ManyToOne(optional = false)
    @JoinColumn(name = "team_home_id", nullable = false)
    private Team teamHome;

    @ManyToOne(optional = false)
    @JoinColumn(name = "team_away_id", nullable = false)
    private Team teamAway;

    public Team getTeamAway() {
        return teamAway;
    }

    public void setTeamAway(Team teamAway) {
        this.teamAway = teamAway;
    }

    public Team getTeamHome() {
        return teamHome;
    }

    public void setTeamHome(Team teamHome) {
        this.teamHome = teamHome;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public SportGame getSportGame() {
        return sportGame;
    }

    public void setSportGame(SportGame sportGame) {
        this.sportGame = sportGame;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}