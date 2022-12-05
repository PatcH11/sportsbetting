-- liquibase formatted sql

-- changeset patch:1670193476647-1
CREATE TABLE bets
(
    id             BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    user_id        BIGINT                                  NOT NULL,
    match_id       BIGINT                                  NOT NULL,
    team_winner_id BIGINT                                  NOT NULL,
    CONSTRAINT pk_bets PRIMARY KEY (id)
);

-- changeset patch:1670193476647-2
CREATE TABLE matches
(
    id            BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    sport_game_id BIGINT                                  NOT NULL,
    score_id      BIGINT,
    team_home_id  BIGINT                                  NOT NULL,
    team_away_id  BIGINT                                  NOT NULL,
    CONSTRAINT pk_matches PRIMARY KEY (id)
);

-- changeset patch:1670193476647-3
CREATE TABLE results
(
    id       BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    match_id BIGINT                                  NOT NULL,
    score_id BIGINT                                  NOT NULL,
    CONSTRAINT pk_results PRIMARY KEY (id)
);

-- changeset patch:1670193476647-4
CREATE TABLE scores
(
    id              BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    home_team_score INTEGER                                 NOT NULL,
    away_team_score INTEGER                                 NOT NULL,
    CONSTRAINT pk_scores PRIMARY KEY (id)
);

-- changeset patch:1670193476647-5
CREATE TABLE sport_games
(
    id   BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    name VARCHAR(255)                            NOT NULL,
    CONSTRAINT pk_sport_games PRIMARY KEY (id)
);

-- changeset patch:1670193476647-6
CREATE TABLE teams
(
    id   BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    name VARCHAR(255)                            NOT NULL,
    CONSTRAINT pk_teams PRIMARY KEY (id)
);

-- changeset patch:1670193476647-7
CREATE TABLE users
(
    id         BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    username   VARCHAR(255)                            NOT NULL,
    password   VARCHAR(255)                            NOT NULL,
    email      VARCHAR(255)                            NOT NULL,
    first_name VARCHAR(255)                            NOT NULL,
    last_name  VARCHAR(255)                            NOT NULL,
    CONSTRAINT pk_users PRIMARY KEY (id)
);

-- changeset patch:1670193476647-8
ALTER TABLE bets
    ADD CONSTRAINT FK_BETS_ON_MATCH FOREIGN KEY (match_id) REFERENCES matches (id);

-- changeset patch:1670193476647-9
ALTER TABLE bets
    ADD CONSTRAINT FK_BETS_ON_TEAM_WINNER FOREIGN KEY (team_winner_id) REFERENCES teams (id);

-- changeset patch:1670193476647-10
ALTER TABLE bets
    ADD CONSTRAINT FK_BETS_ON_USER FOREIGN KEY (user_id) REFERENCES users (id);

-- changeset patch:1670193476647-11
ALTER TABLE matches
    ADD CONSTRAINT FK_MATCHES_ON_SCORE FOREIGN KEY (score_id) REFERENCES scores (id);

-- changeset patch:1670193476647-12
ALTER TABLE matches
    ADD CONSTRAINT FK_MATCHES_ON_SPORT_GAME FOREIGN KEY (sport_game_id) REFERENCES sport_games (id);

-- changeset patch:1670193476647-13
ALTER TABLE matches
    ADD CONSTRAINT FK_MATCHES_ON_TEAM_AWAY FOREIGN KEY (team_away_id) REFERENCES teams (id);

-- changeset patch:1670193476647-14
ALTER TABLE matches
    ADD CONSTRAINT FK_MATCHES_ON_TEAM_HOME FOREIGN KEY (team_home_id) REFERENCES teams (id);

-- changeset patch:1670193476647-15
ALTER TABLE results
    ADD CONSTRAINT FK_RESULTS_ON_MATCH FOREIGN KEY (match_id) REFERENCES matches (id);

-- changeset patch:1670193476647-16
ALTER TABLE results
    ADD CONSTRAINT FK_RESULTS_ON_SCORE FOREIGN KEY (score_id) REFERENCES scores (id);

