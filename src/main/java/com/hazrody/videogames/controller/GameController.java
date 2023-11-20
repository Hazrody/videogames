package com.hazrody.videogames.controller;

import com.hazrody.videogames.dao.entity.Editor;
import com.hazrody.videogames.dao.entity.Game;
import com.hazrody.videogames.dao.entity.Studio;
import com.hazrody.videogames.service.EditorService;
import com.hazrody.videogames.service.GameService;
import com.hazrody.videogames.service.StudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class GameController {

    @Autowired
    GameService gameService;

    @Autowired
    StudioService studioService;

    @Autowired
    EditorService editorService;


    @QueryMapping
    public Game game(@Argument Long id) {
        Optional<Game> optionalGame = this.gameService.getGameById(id);
        return optionalGame.orElse(null);
    }

    @QueryMapping
    public Page<Game> games(@Argument int page, @Argument Long genre, @Argument Long platform, @Argument Long idStudio) {
        PageRequest pageRequest = PageRequest.of(page, 15);
        return this.gameService.getGameByGenrePlatformAndStudio(pageRequest, genre, platform, idStudio);
    }

    @QueryMapping
    public Studio studio(@Argument Long id) {
        Optional<Studio> optionalStudio = this.studioService.getStudioById(id);
        return optionalStudio.orElse(null);
    }

    @QueryMapping
    public Page<Studio> studios(@Argument int page) {
        PageRequest pageRequest = PageRequest.of(page, 15);
        return this.studioService.getAllStudio(pageRequest);
    }


    @QueryMapping
    public Editor editor(@Argument Long id) {
        Optional<Editor> optionalEditor = this.editorService.getEditorById(id);
        return optionalEditor.orElse(null);
    }

    @QueryMapping
    public Page<Editor> editors(@Argument int page) {
        PageRequest pageRequest = PageRequest.of(page, 15);
        return this.editorService.getAllEditor(pageRequest);
    }


}
