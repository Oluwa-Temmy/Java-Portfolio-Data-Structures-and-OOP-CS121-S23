//******************************************
//         Activity 2: Conditionals - Book Club
//             Name: Osayi Odiase
//          Submission: 1/19/2020
//*****************************************
//Description:
//Based on how many books the user has read, the user gets points.
//The more books you read the more points you get.
//Input your name and input the amount of books you've read.
//****************************************


import javax.swing.*;

public class BookClubPoints {
    public static void main(String[] args) {

        String name;
        int books;
        int points = 0;

        name = JOptionPane.showInputDialog("what is your name?");
        books = Integer.parseInt(JOptionPane.showInputDialog(String.format("How many books have you read this month, %s", name)));

        if (books == 0)
            points = 0;

        if (books == 1)
            points = 5;

        if (books == 2)
            points = 15;

        if (books == 3)
            points = 30;

        if (books >= 4)
            points = 60;

        JOptionPane.showMessageDialog(null,String.format("Wow you read %d, books. You deserve a reward\n Here's %d points\n Go and buy something for that pretty mind of yours ;)", books, points));

    }
}
