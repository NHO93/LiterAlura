package com.edenilsonfabiano.literAlura.repository;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.edenilsonfabiano.literAlura.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LivroRepository extends JpaRepository<Livro, Long> {
    @JsonIgnoreProperties(ignoreUnknown = true)
    boolean existsByTitle(String title);
    Optional<Livro> findById(Long id);
}
