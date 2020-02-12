package com.enaimus.sfgchucknorrisjokes.repositories.impl;

import com.enaimus.sfgchucknorrisjokes.models.Joke;
import com.enaimus.sfgchucknorrisjokes.repositories.JokeRepository;
import com.enaimus.sfgchucknorrisjokes.services.JokeService;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Repository;

@Repository("jokeRepository")
public class ChuckNorriesJokeRepositoryImpl implements JokeRepository
{

    private final ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

    @Override
    public Joke getRandomJoke() {

        return Joke.fromQuote(chuckNorrisQuotes.getRandomQuote());
    }
}
