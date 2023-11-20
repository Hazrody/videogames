INSERT INTO studio(id, name)
values (1, 'Sucker Punch Productions');

INSERT INTO editor(id, name)
values (1, 'Sony');

INSERT INTO game(id, name, publication_date)
values (1, 'Ghost of Tsushima', '2020-07-17');

INSERT INTO genre(id, name)
values (1, 'Infiltration');

INSERT INTO genre(id, name)
values (2, 'Action-Aventure');

INSERT INTO platform(id, name)
values (1, 'Playstation');

INSERT INTO game_editor(id, id_game, id_editor)
values (1, 1, 1);

INSERT INTO game_genre(id, id_game, id_genre)
values (1, 1, 1);

INSERT INTO game_genre(id, id_game, id_genre)
values (2, 1, 2);

INSERT INTO game_platform(id, id_game, id_platform)
values (1, 1, 1);

INSERT INTO game_studio(id, id_game, id_studio)
values (1, 1, 1);



