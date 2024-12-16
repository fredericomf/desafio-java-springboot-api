package com.fredericomf.desafio_screenmatch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fredericomf.desafio_screenmatch.dto.FraseDTO;
import com.fredericomf.desafio_screenmatch.service.FraseService;

@RestController
public class FraseController {

    @Autowired
    private FraseService servico;

    @GetMapping("/series/frases")
    public FraseDTO getRandomQuote() {
        return servico.getRandomQuote();
    }
}
