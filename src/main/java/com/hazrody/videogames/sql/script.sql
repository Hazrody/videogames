CREATE TABLE editor
(
    id   serial PRIMARY KEY,
    name varchar(200) NOT NULL
);

CREATE TABLE studio
(
    id   serial PRIMARY KEY,
    name varchar(200) NOT NULL
);

CREATE TABLE game
(
    id               serial PRIMARY KEY,
    name             varchar(200) NOT NULL,
    publication_date DATE
);

CREATE TABLE genre
(
    id   serial PRIMARY KEY,
    name varchar(200) NOT NULL
);

CREATE TABLE platform
(
    id   serial PRIMARY KEY,
    name varchar(200) NOT NULL
);


CREATE TABLE game_editor
(
    id        serial PRIMARY KEY,
    id_game   serial,
    id_editor serial,
    FOREIGN KEY (id_game) REFERENCES game (id),
    FOREIGN KEY (id_editor) REFERENCES editor (id)
);

CREATE TABLE game_studio
(
    id        serial PRIMARY KEY,
    id_game   serial,
    id_studio serial,
    FOREIGN KEY (id_game) REFERENCES game (id),
    FOREIGN KEY (id_studio) REFERENCES studio (id)
);

CREATE TABLE game_genre
(
    id       serial PRIMARY KEY,
    id_game  serial,
    id_genre serial,
    FOREIGN KEY (id_game) REFERENCES game (id),
    FOREIGN KEY (id_genre) REFERENCES genre (id)
);

CREATE TABLE game_platform
(
    id          serial PRIMARY KEY,
    id_game     serial,
    id_platform serial,
    FOREIGN KEY (id_game) REFERENCES game (id),
    FOREIGN KEY (id_platform) REFERENCES platform (id)
);





