package com.example.demo.controller;



import com.example.demo.model.Loja;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/lojas")
public class LojaController {

    @GetMapping
    public List<Loja> listar() {
        return List.of(
                new Loja(1L, "Loja Central", "Luanda", true),
                new Loja(2L, "Loja Talatona", "Luanda", true),
                new Loja(3L, "Loja Benguela", "Benguela", false)
        );
    }
}
