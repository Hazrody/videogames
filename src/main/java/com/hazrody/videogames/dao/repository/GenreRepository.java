package com.hazrody.videogames.dao.repository;

import com.hazrody.videogames.dao.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
