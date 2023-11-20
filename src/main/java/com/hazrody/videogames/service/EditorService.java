package com.hazrody.videogames.service;

import com.hazrody.videogames.dao.entity.Editor;
import com.hazrody.videogames.dao.repository.EditorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EditorService {

    @Autowired
    EditorRepository editorRepository;


    public Optional<Editor> getEditorById(Long id) {
        return this.editorRepository.findById(id);
    }

    public Page<Editor> getAllEditor(PageRequest pageRequest) {
        return this.editorRepository.findAll(pageRequest);
    }
}
