//package PokemonGame;
package com.company;


import java.io.IOException;

public interface Game {
    void setUp();
    void instructions() throws IOException;
    void game() throws IOException;
    void results();

}
