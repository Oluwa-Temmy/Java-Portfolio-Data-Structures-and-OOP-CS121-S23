//***************************************************
//               Activity 1: Task 2
//    Name: Osayi Odiase    Course: CS 121
//          Submission Date: (1/18/2023)
//***************************************************
// Description: Asks the user to enter in two numbers
// then displays the result of operations of
// adding, subtracting, multiplying, dividing, square root, power and  logarithm.
//***************************************************
//***************************************************
// CLASS: activityOne_TaskTwo
// NO METHODS
//**************************************************
import javax.swing.*;

public class activityOne_TaskTwo {
    public static void main(String[] args) {


        //variable types
        String name;
        double first_num;
        double second_num;
        double multiply;
        double add;
        double first_squared;
        double second_squared;
        double subtract;
        double divide;
        double power;
        double first_log;
        double second_log;

        //input dialogue
        name = JOptionPane.showInputDialog("what is your name?");
        first_num = Integer.parseInt(JOptionPane.showInputDialog("Type a number 1 - 99999999999 and beyond infinite"));
        second_num = Integer.parseInt(JOptionPane.showInputDialog("Type a second number 1 - 99999999999 and beyond infinite"));

        //All operations
        multiply = first_num * second_num;
        add = first_num + second_num;
        subtract = first_num - second_num;
        divide = first_num / second_num;
        power = Math.pow(first_num, second_num);
        first_squared = Math.sqrt(first_num);
        second_squared = Math.sqrt(second_num);
        first_log = Math.log(first_num);
        second_log = Math.log(second_num);


        // where the sentence is made
        JOptionPane.showMessageDialog(null,String.format("Alright %s, so here are your results\n Multiplication: %.2f\n " +
                "Added: %.2f\n " +
                "Subtracted: %.2f\n " +
                "Divided: %.2f\n " + "The first # squared: %.2f\n The second # squared: %.2f\n The First logarithm: %.2f\n Second logarithm: %.2f\n" +
                "Power: %.2f", name, multiply, add, subtract, divide, first_squared, second_squared, first_log, second_log, power));
    }
}
