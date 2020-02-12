package com.enaimus.sfgchucknorrisjokes.services.impl;

import com.enaimus.sfgchucknorrisjokes.models.Joke;
import com.enaimus.sfgchucknorrisjokes.repositories.JokeRepository;
import com.enaimus.sfgchucknorrisjokes.services.JokeService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    @Qualifier("jokeRepository")
    private final JokeRepository jokeRepository;

    JokeServiceImpl(JokeRepository jokeRepository){
        this.jokeRepository = jokeRepository;
    }

    @Override
    public Joke getRandomJoke() {
        return jokeRepository.getRandomJoke();
    }
}
