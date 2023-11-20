package com.hazrody.videogames.dao.repository;

import com.hazrody.videogames.dao.entity.Game;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long> {
    @Query(value = "SELECT * FROM GAME as g inner join game_studio as gs on g.id = gs.id_game inner join game_platform as gp on g.id = gp.id_game inner join game_genre as gg on g.id = gg.id_game where gg.id = :idGenre and gs.id = :idStudio and gp.id = :idPlatform", nativeQuery = true)
    Page<Game> findByGenrePlatformAndStudio(@Param("idGenre") Long idGenre, @Param("idPlatform") Long idPlatform, @Param("idStudio") Long idStudio, Pageable pageable);
}
