package samplepackage1;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] choices = { "rock", "paper", "scissors" };

        System.out.println("🎮 Welcome to Rock, Paper, Scissors!");

        while (true) {
            System.out.print("\nEnter your choice (rock, paper, scissors or quit): ");
            String userChoice = sc.next().toLowerCase();

            if (userChoice.equals("quit")) {
                System.out.println("👋 Thanks for playing! Goodbye!");
                break;
            }

            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("❌ Invalid choice! Try again.");
                continue;
            }

            String computerChoice = choices[rand.nextInt(3)];
            System.out.println("Computer chose: " + computerChoice);

            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You win! 🎉");
            } else {
                System.out.println("You lose! 😭");
            }
        }

        sc.close();
    }
}
