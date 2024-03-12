package com.learning.core.day04;

public class CricketRating {
	private String playerName;
    private float critic1;
    private float critic2;
    private float critic3;
    private float avgRating;
    private String coins;

    public CricketRating(String playerName, float critic1, float critic2) throws NotEligibleException {
        this.playerName = playerName;
        this.critic1 = critic1;
        this.critic2 = critic2;
        calculateAverageRating(critic1, critic2);
        this.coins = calculateCoins();
    }

    public CricketRating(String playerName, float critic1, float critic2, float critic3) throws NotEligibleException {
        this.playerName = playerName;
        this.critic1 = critic1;
        this.critic2 = critic2;
        this.critic3 = critic3;
        calculateAverageRating(critic1, critic2, critic3);
        this.coins = calculateCoins();
    }

    public void calculateAverageRating(float critic1, float critic2) {
        this.avgRating = (critic1 + critic2) / 2;
    }

    public void calculateAverageRating(float critic1, float critic2, float critic3) {
        this.avgRating = (critic1 + critic2 + critic3) / 3;
    }

    public String calculateCoins() throws NotEligibleException {
        if (avgRating >= 7) {
            return "Gold";
        } else if (avgRating >= 5 && avgRating < 7) {
            return "Silver";
        } else if (avgRating >= 2 && avgRating < 5) {
            return "Copper";
        } else {
            throw new NotEligibleException("Player is not eligible for coins.");
        }
    }

    public void display() {
        System.out.println(playerName + " " + avgRating + " " + coins);
    }
}
