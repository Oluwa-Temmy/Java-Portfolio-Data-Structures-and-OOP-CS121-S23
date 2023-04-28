//*********************************************************
//         Activity 9: ESP Game
//          Submission: 2/1/2023
//******************************************************
//Description:
//This program picks a number and the number is associated with a color
//The user will then guess the color
//The program runs 10 times
//At the end of the program will tell the user how many they get right out of 10
//********************************************************

import java.util.Random;
import java.util.Scanner;

public class ESPGame {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();

        int i;
        int number;
        String color;
        String guess;
        int correct = 0;

        System.out.println("**I choose a color and you guess\nand I will tell you how many you got correct**");
        for(i = 0;i<10;i++){
            number = rand.nextInt(5);

            if (number == 0){
                color = "red";
            }
            else if (number == 1){
                color = "green";
            }
            else if (number == 2){
                color = "blue";
            }
            else if (number == 3){
                color = "orange";
            }
            else {
                color = "yellow";
            }
            System.out.println("What color did I choose?\nGreen, Blue, Red, Orange, or Yellow");
            guess = keyboard.nextLine();

            if (guess.equals(color)){
                correct++;

            }
        }
        System.out.printf(("Alright you got %d out of %d correct"), correct, i);
    }
}
