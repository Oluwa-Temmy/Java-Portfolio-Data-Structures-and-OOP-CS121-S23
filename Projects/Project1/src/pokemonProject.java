//*********************************************************
//         Project 1: Pokémon Battle
//             Name: Osayi Odiase
//          Submission: 2/12/2023
//******************************************************
//Description:
//This game is a game where you can battle custom pokemon with custom abilities.
//This game is played in the terminal of the editor. 
//The player enters any number of rounds they would wish to play.
//And each round round the player that doesnt get to 0 health first gets a point
//Each round you get a point and the player to win the most round wins the game
//********************************************************

import java.util.Random;
import java.util.Scanner;

public class pokemonProject {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random random_num = new Random();

        int round;
        int round_winner = 0;

        String player_1;
        int health1;
        String move1;
        int move_power1;
        int attack_speed1;
        int win1 = 0;

        String player_2;
        int health2;
        String move2;
        int move_power2;
        int attack_speed2;
        int win2 = 0;


        System.out.println("Welcome to the pokemon battles\nPick an odd number of rounds you would like to play?");
        round = keyboard.nextInt();
        keyboard.nextLine();

        for (int i = 1; i <= round; i++) {
            //player 1 customization
            System.out.println("Player 1, who's your pokemon?");
            player_1 = keyboard.nextLine();
            System.out.println("What is your health?");
            health1 = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("Whats your move");
            move1 = keyboard.nextLine();
            System.out.println("How much damage can your move do?");
            move_power1 = keyboard.nextInt();
            System.out.println("What is your attack speed?");
            attack_speed1 = keyboard.nextInt();
            keyboard.nextLine();
            System.out.printf("Player 1\n-------\nPokemon: %s\nHit Points: %d\nMove: %s\nMove Power: %d\nAttack Speed: %d",
                    player_1,health1,move1,move_power1,attack_speed1);


            //player 2 customization
            System.out.println("\n\nPlayer 2, who's your pokemon?");
            player_2 = keyboard.nextLine();
            System.out.println("What is your health?");
            health2 = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("Whats your move");
            move2 = keyboard.nextLine();
            System.out.println("How much damage can your move do?");
            move_power2 = keyboard.nextInt();
            System.out.println("What is your attack speed?");
            attack_speed2 = keyboard.nextInt();
            keyboard.nextLine();
            System.out.printf("Player 2\n-------\nPokemon: %s\nHit Points: %d\nMove: %s\nMove Power: %d\nAttack Speed: %d",
                    player_2,health2,move2,move_power2,attack_speed2);

            int random = random_num.nextInt(2);
            while (true) {
                if (attack_speed1 > attack_speed2) {
                    health2 -= move_power1;
                    if (health2 <= 0) {
                        win1 += 1;
                        break;
                    }
                } else if (random == 0) {
                    health2 -= move_power1;
                    if (health2 <= 0) {
                        win1 += 1;
                        break;
                    } else {
                        health1 -= move_power2;
                        if (health1 <= 0) {
                            win2 += 1;
                            break;
                        }
                    }
                } else {
                    health1 -= move_power2;
                    if (health1 <= 0) {
                        win2 += 1;
                        break;
                    }
                }
            }
            System.out.printf("\nWins\n----------\nPlayer 1: %d\nPlayer 2: %d\n", win1, win2);
            round_winner = Math.max(win1, win2);
            if (round_winner == win1) {
                System.out.printf("Player 1's %s wins round %d\n", player_1,i);
            } else {
                System.out.printf("Player 2's %s wins round %d\n", player_2,i);
            }
        }

        System.out.printf("\nFinal Score\n----------\nPlayer 1: %d\nPlayer 2: %d\n", win1, win2);
        if (round_winner == win1){
            System.out.println("Player 1 wins the game");
        }
        else {
            System.out.println("Player 2 wins the game");
        }
    }
}
