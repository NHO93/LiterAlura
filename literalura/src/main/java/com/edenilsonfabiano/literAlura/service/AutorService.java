package com.edenilsonfabiano.literAlura.service;

import com.edenilsonfabiano.literAlura.model.Autor;
import com.edenilsonfabiano.literAlura.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {
    @Autowired
    private AutorRepository repository;

    public List<Autor> listAuthors() {
        return repository.findAll();
    }

    public List<Autor> listAuthorsAliveInSpecifYear(Integer ano) {
        return repository.findAutoresByYear(ano);
    }
}

