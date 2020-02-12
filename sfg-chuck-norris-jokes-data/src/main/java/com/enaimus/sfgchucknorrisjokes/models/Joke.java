package com.enaimus.sfgchucknorrisjokes.models;

public class Joke {

    private String quote;

    public Joke(){
    }

    private  Joke(String quote){
        this.quote = quote;
    }

    public static Joke fromQuote(String quote){
        return new Joke(quote);
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
