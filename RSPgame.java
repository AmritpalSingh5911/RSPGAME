import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

import java.util.Random;

class RSPgame {
    public static void main(String[] args) {
        System.out.println("Let's Enjoy Game");
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String player_name = sc.nextLine();
        new ProcessBuilder("cmd", "/c", "cls");
        int player_score = 0, computer_score = 0;
        System.out.println("How many rounds do you like to play");
        int rounds = sc.nextInt();
        for (int round = 1; round <= rounds; round++) {
            new ProcessBuilder("cmd", "/c", "cls");
            System.out.println("Round Number" + round + "/" + rounds);
            System.out.println(player_name + " 's Score = " + player_score);
            System.out.println("Computer Score = " + computer_score);
            int computer_choice;
            System.out.println("1). Rock");
            System.out.println("2). Paper");
            System.out.println("3). Scissors");
            System.out.println("Select your choice :");
            byte player_choice = sc.nextByte();
            do {
                Random rand = new Random();
                computer_choice = rand.nextInt(3);
                if (computer_choice == 0) {
                    System.out.println("Computer choose : Rock");
                } else if (computer_choice == 1) {
                    System.out.println("computer choose : Paper");
                } else {
                    System.out.println("computer choose : Scissors");
                }
            } while (player_choice != 1 && player_choice != 2 && player_choice != 3);
            if (player_choice == 1 && computer_choice == 3) {
                System.out.println("Player wins");
                player_score++;
            } else if (player_choice == 2 && computer_choice == 1) {
                System.out.println("Player wins");
                player_score++;
            } else if (player_choice == 3 && computer_choice == 2) {
                System.out.println("Player wins");
                player_score++;
            } else if (player_choice == computer_choice) {
                System.out.println("Draw");
            } else {
                System.out.println("computer wins");
                computer_score++;
            }

        }
        if (player_score == computer_score)

        {
            System.out.println("match is drawn");
        } else if (player_score > computer_score) {
            System.out.println(player_name + "You won the match");
        } else {
            System.out.println("Computer Won the match");
        }
        sc.close();

    }
}