
//package PokemonGame;
package com.company;


import java.util.LinkedList;
import java.util.Queue;

public class PlayerQueue {
    private Queue<Player> playerQueue = new LinkedList();

    public PlayerQueue() {
    }

    public boolean addPlayer(Player user) {
        return this.playerQueue.add(user);
    }

    public Player removePlayer() {
        return (Player)this.playerQueue.remove();
    }

    public int size() {
        return this.playerQueue.size();
    }

    public boolean isEmpty() {
        return this.playerQueue.isEmpty();
    }
}
