package com.inforush.service;

import com.inforush.model.*;
import com.inforush.repository.ConteudoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ConteudoService {

    private final ConteudoRepository conteudoRepository;

    public List<Conteudo> listarTodos() {
        return conteudoRepository.findAll();
    }

    public List<Conteudo> porArea(Area area) {
        return conteudoRepository.findByArea(area);
    }

    public List<Conteudo> buscarPorTitulo(String titulo) {
        return conteudoRepository.findByTituloContainingIgnoreCase(titulo);
    }

    public Conteudo salvar(Conteudo conteudo) {
        return conteudoRepository.save(conteudo);
    }
}
