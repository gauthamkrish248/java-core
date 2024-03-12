package com.learning.core.day04;

import java.util.Scanner;

public class D04P02 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter player name:");
        String playerName = scanner.nextLine();
        
        System.out.println("Enter ratings of critic 1:");
        float critic1 = scanner.nextFloat();
        
        System.out.println("Enter ratings of critic 2:");
        float critic2 = scanner.nextFloat();
        
        System.out.println("Does this player have a rating from critic 3? (Y/N)");
        char choice = scanner.next().charAt(0);
        
        if (choice == 'Y' || choice == 'y') {
            System.out.println("Enter ratings of critic 3:");
            float critic3 = scanner.nextFloat();
            
            try {
                CricketRating player = new CricketRating(playerName, critic1, critic2, critic3);
                player.display();
            } catch (NotEligibleException e) {
                System.out.println("NotEligible: " + e.getMessage());
            }
        } else {
            try {
                CricketRating player = new CricketRating(playerName, critic1, critic2);
                player.display();
            } catch (NotEligibleException e) {
                System.out.println("NotEligible: " + e.getMessage());
            }
        }
        
        scanner.close();
    }
}
