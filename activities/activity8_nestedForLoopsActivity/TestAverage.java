//*********************************************************
//         Activity 8: Test Average
//             Name: Osayi Odiase
//          Submission: 2/6/2023
//******************************************************
//Description:
//This program asks the user for how many students there are
//and how many tests each student took.
//The scores of all the tests are then averaged out
//********************************************************
import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int students;
        int test_scores;

        double score;

        System.out.println("How many students took the test");
        students = keyboard.nextInt();
        System.out.println("How many test scores per student?");
        test_scores = keyboard.nextInt();

        //issue with getting each score
        int i;
        int t;
        double total = 0;


        for (i=1;i<=students; i++) {
            System.out.printf("Student %d scores\n-----------------\n", i);
            for (t = 1; t <= test_scores; t++) {
                System.out.printf("What is test score number %d\n", t);
                score = keyboard.nextInt();
                total += score;
            }
            double avr = total/test_scores;
            System.out.printf("The average for student %d, is: %.2f\n\n", i, avr);
            total = 0;
        }
    }
}
