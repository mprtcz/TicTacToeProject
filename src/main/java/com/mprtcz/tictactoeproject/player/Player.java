package com.mprtcz.tictactoeproject.player;

/**
 * @author Michal_Partacz
 * @since 28.06.2017.
 */
public class Player {
    private String name;
    private int score;
    private GamesHistory gamesHistory;
    private int currentSign;

    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.gamesHistory = new GamesHistory();
    }

    public void setCurrentSign(int currentSign) {
        this.currentSign = currentSign;
    }

    public int getCurrentSign() {
        return currentSign;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", gamesHistory=" + gamesHistory +
                ", currentSign=" + currentSign +
                '}';
    }

    public String getName() {
        return name;
    }
}
