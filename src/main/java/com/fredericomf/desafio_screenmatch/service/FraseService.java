package com.fredericomf.desafio_screenmatch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fredericomf.desafio_screenmatch.dto.FraseDTO;
import com.fredericomf.desafio_screenmatch.model.Frase;
import com.fredericomf.desafio_screenmatch.repository.FraseRepository;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repository;

    public FraseDTO getRandomQuote() {

        Frase frase = repository.getRandomQuote();

        return new FraseDTO(frase.getFrase(), frase.getPersonagem(), frase.getPoster(), frase.getTitulo());
    }
}
