//******************************************
//         Activity 2: Conditionals - Test Scores
//             Name: Osayi Odiase
//          Submission: 1/19/2020
//*****************************************
//Description:
//This program finds the average of three test scores and gives you a grade
//Input your name and 3 test scores, and it will calculate the average
//****************************************
import javax.swing.*;

public class TestScores {
    public static void main(String[] args) {
        String name;
        int score_one;
        int score_two;
        int score_three;
        char grade = 'A';

        name = JOptionPane.showInputDialog("what is your name?");
        JOptionPane.showMessageDialog(null, String.format("ok %s, give me three test scores between 0 and 100  and I will find the average\n and minimum of the three", name));
        score_one = Integer.parseInt(JOptionPane.showInputDialog(String.format("What is the first score?")));
        score_two = Integer.parseInt(JOptionPane.showInputDialog(String.format("What is the second score?")));
        score_three = Integer.parseInt(JOptionPane.showInputDialog(String.format("What is the third score?")));
        JOptionPane.showMessageDialog(null, "Alright let me process...");

        double average = (double)(score_one + score_two + score_three) / 3;
        if (average < 60)
        {
            grade = 'F';
        }
        else {
            if (average < 70) {
                grade = 'D';
            } else {
                if (average < 80) {
                    grade = 'C';
                } else {
                    if (average < 90) {
                        grade = 'B';
                    } else {
                        if (average < 100) {
                            grade = 'A';
                        }
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(null, String.format("So your average is %.2f, %s\n And your grade is %c", average,name,grade));

    }
}
