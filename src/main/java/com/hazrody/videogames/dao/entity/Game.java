package com.hazrody.videogames.dao.entity;

import jakarta.persistence.*;

import java.time.ZonedDateTime;
import java.util.List;

@Entity
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private ZonedDateTime publicationDate;

    @ManyToMany
    @JoinTable(
            name = "game_editor",
            joinColumns = @JoinColumn(name = "id_game"),
            inverseJoinColumns = @JoinColumn(name = "id_editor")
    )
    List<Editor> editors;

    @ManyToMany
    @JoinTable(
            name = "game_studio",
            joinColumns = @JoinColumn(name = "id_game"),
            inverseJoinColumns = @JoinColumn(name = "id_studio")
    )
    List<Studio> studios;

    @ManyToMany
    @JoinTable(
            name = "game_genre",
            joinColumns = @JoinColumn(name = "id_game"),
            inverseJoinColumns = @JoinColumn(name = "id_genre")
    )
    List<Genre> genres;

    @ManyToMany
    @JoinTable(
            name = "game_platform",
            joinColumns = @JoinColumn(name = "id_game"),
            inverseJoinColumns = @JoinColumn(name = "id_platform")
    )
    List<Platform> platforms;

}
