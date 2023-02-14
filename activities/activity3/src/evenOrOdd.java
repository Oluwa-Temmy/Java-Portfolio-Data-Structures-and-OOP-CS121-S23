//******************************************
//         Activity 3: Logical Operators - Even or Odd
//             Name: Osayi Odiase
//          Submission: 1/21/2020
//*****************************************
//Description:
//This program finds out whether an int input is odd or even
//Input a number and I will check if it is odd or even
//****************************************
import java.util.Scanner;

//use scanner
public class evenOrOdd {
    public static void main(String[] args) {
        Scanner hippie = new Scanner(System.in);

        String name;
        int number;
        String odd_even;

        System.out.println("what is your name?");
        name = hippie.nextLine();
        System.out.printf("Ok %s, you give me a number and I'll guess\n if it's even or odd.\n",name);
        System.out.println("Alright, what is your number?");
        number = hippie.nextInt();
        System.out.print("Alright, let me process");


        if (number % 2 == 0)
        {
            odd_even = "even";
        }
        else
        {
            odd_even = "odd";
        }

        System.out.printf("So your number is an %s number",odd_even);


    }
}
