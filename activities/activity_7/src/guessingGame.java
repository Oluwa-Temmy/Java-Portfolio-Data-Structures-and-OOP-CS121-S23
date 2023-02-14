//*********************************************************
//         Activity 7: Guessing Game
//             Name: Osayi Odiase
//          Submission: 2/6/2023
//******************************************************
//Description:
//This program asks the user to guess a random number
//The program will tell you if you are too high or too low when guessing
//********************************************************

import java.util.Random;
import java.util.Scanner;

    public class guessingGame {
        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            Random random_num = new Random();
            int round = 0;
            int random;
            int guess;


            System.out.println("Guess a number 1-100\ntype q to quit");

            random = random_num.nextInt(100);

            while (true) {
                round++;
                String answer = keyboard.nextLine();
                if (answer.equalsIgnoreCase("q")) {
                    System.out.println("You didn't even try\nGuesses: " + round);
                    break;
                } else {
                    guess = Integer.parseInt(answer); //converting user input into an integer string = String.value
                    if (guess < random) {
                        System.out.println("To Low");
                    }else if (guess > random) {
                        System.out.println("To high");
                    } else {
                    System.out.println("Correct\nGuesses: " + round);
                    break;
//                    } else if (guess < 0) {
//                        System.out.println("Error: Select a positive number");
//                    }
//
                    }
                }

            }
            keyboard.close();
        }
    }