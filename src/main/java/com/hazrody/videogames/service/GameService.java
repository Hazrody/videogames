package com.hazrody.videogames.service;

import com.hazrody.videogames.dao.entity.Game;
import com.hazrody.videogames.dao.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    GameRepository gameRepository;

    public Optional<Game> getGameById(Long id) {
        return gameRepository.findById(id);
    }

    public Page<Game> getGameByGenrePlatformAndStudio(PageRequest pageRequest, Long idGenre, long idPlatform, long idStudio) {
        return this.gameRepository.findByGenrePlatformAndStudio(idGenre, idPlatform, idStudio, pageRequest);
    }
}
