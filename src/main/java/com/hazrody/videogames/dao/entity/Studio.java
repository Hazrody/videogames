package com.hazrody.videogames.dao.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Studio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(
            name = "game_studio",
            joinColumns = @JoinColumn(name = "id_game"),
            inverseJoinColumns = @JoinColumn(name = "id_studio")
    )
    List<Game> games;

}
