package com.nazjara.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesService {

    private final ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();

    public String getJoke() {
        return quotes.getRandomQuote();
    }
}
