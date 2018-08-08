package com.company;

public class Player {
    private String playerName;
    private int score;

    public Player(String name) {
        this.playerName = name;
        this.score = 0;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}


