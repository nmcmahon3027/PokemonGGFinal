//package PokemonGame;
package com.company;


import java.io.IOException;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws IOException {
        GuessingGame theGame = new GuessingGame();
        theGame.instructions();
        theGame.setUp();
        theGame.game();
        theGame.results();
    }
}
