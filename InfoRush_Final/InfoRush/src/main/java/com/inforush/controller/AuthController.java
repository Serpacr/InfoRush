package com.inforush.controller;

import com.inforush.model.Usuario;
import com.inforush.usuario.UsuarioRepository;
import com.inforush.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/register")
    public String register(@RequestBody Usuario usuario) {
        usuario.setRole(Role.USER); // Por padrão, os novos usuários são "USER"
        usuarioRepository.save(usuario);
        return "Usuário registrado com sucesso!";
    }

    // O login será tratado pelo Spring Security
}
