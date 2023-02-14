//******************************************
//         Activity 3: Logical Operators - Triangles
//             Name: Osayi Odiase
//          Submission: 1/21/2020
//*****************************************
//Description:
//Check to see what type of triangle you make
//Input three numbers and the program guesses the triangle
//****************************************
import javax.swing.*;

public class Triangles {
    public static void main(String[] args) {
        int side_a;
        int side_b;
        int side_c;

        JOptionPane.showMessageDialog(null,"Check for triangles.\nInput three numbers and I can tell\n you what type of triangles they make");
        side_a = Integer.parseInt(JOptionPane.showInputDialog("What is your first side?"));
        side_b = Integer.parseInt(JOptionPane.showInputDialog("What is your second side?"));
        side_c = Integer.parseInt(JOptionPane.showInputDialog("What is your third side?"));
        JOptionPane.showMessageDialog(null, "Alright, let me process");

        if (side_a == side_b && side_a == side_c){
            JOptionPane.showMessageDialog(null, "This is an Equilateral Triangle");
        }
        else {
            if ((side_a != side_b && side_a == side_c)||(side_a == side_b && side_a != side_c)){
                JOptionPane.showMessageDialog(null,"This is an Isosceles Triangles");
            }
            if (side_a != side_b && side_a != side_c) {
                JOptionPane.showMessageDialog(null, "This ia an Scalene Triangle");
            }
        }
    }
}
