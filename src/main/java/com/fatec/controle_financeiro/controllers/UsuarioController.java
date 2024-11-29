package com.fatec.controle_financeiro.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.controle_financeiro.entities.User;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/usuario")
public class UsuarioController{

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody @Valid User user){
        /*if(user.getName() == null || user.getName().trim().isEmpty()){
            return ResponseEntity.badRequest().body("Usuário inválido") ;
        }
        if(user.getAge() <= 0){
            return ResponseEntity.badRequest().body("Idade inválida") ;
        }*/

        return ResponseEntity.ok("Bem-vindo, " + user.getName() + "! Você tem " + user.getAge() + " anos.");
    }
}