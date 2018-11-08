package com.udacity.gradle.builditbigger.backend;

import com.example.joketellinglib.JokeTelling;

/** The object model for the data we are sending through endpoints */
public class JokeBean {

    private JokeTelling jokeTelling;

    public JokeBean(){
        jokeTelling=new JokeTelling();
    }

    public String getJoke(){
        return jokeTelling.getRandomJoke();
    }
}