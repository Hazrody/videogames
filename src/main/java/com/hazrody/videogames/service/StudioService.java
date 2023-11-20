package com.hazrody.videogames.service;

import com.hazrody.videogames.dao.entity.Studio;
import com.hazrody.videogames.dao.repository.StudioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudioService {

    @Autowired
    StudioRepository studioRepository;

    public Optional<Studio> getStudioById(Long id) {
        return this.studioRepository.findById(id);
    }

    public Page<Studio> getAllStudio(PageRequest pageRequest) {
        return this.studioRepository.findAll(pageRequest);
    }
}
