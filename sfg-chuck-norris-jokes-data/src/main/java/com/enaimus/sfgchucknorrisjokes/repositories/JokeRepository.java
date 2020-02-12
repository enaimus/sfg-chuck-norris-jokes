package com.enaimus.sfgchucknorrisjokes.repositories;

import com.enaimus.sfgchucknorrisjokes.models.Joke;

public interface JokeRepository {

    Joke getRandomJoke();
}
