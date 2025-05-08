package com.inforush.controller;

import com.inforush.model.*;
import com.inforush.service.ConteudoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/conteudos")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class ConteudoController {

    private final ConteudoService conteudoService;

    @GetMapping
    public List<Conteudo> listarTodos() {
        return conteudoService.listarTodos();
    }

    @GetMapping("/area/{area}")
    public List<Conteudo> porArea(@PathVariable Area area) {
        return conteudoService.porArea(area);
    }

    @GetMapping("/buscar")
    public List<Conteudo> buscarPorTitulo(@RequestParam String titulo) {
        return conteudoService.buscarPorTitulo(titulo);
    }

    @PostMapping
    public Conteudo criar(@RequestBody @Valid Conteudo conteudo) {
        return conteudoService.salvar(conteudo);
    }
}
