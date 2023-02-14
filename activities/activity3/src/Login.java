//******************************************
//         Activity 3: Logical Operators - Login
//             Name: Osayi Odiase
//          Submission: 1/21/2020
//*****************************************
//Description:
//Create a string user and password and then use
//that username and password to unlock the message.
//Input a user and password and input that to get the secret message
//****************************************
import javax.swing.*;

public class Login {
    public static void main(String[] args) {

        String name;
        String userName;
        String password;
        String user;
        String pw;

        name = JOptionPane.showInputDialog("What is your name?");
        user = JOptionPane.showInputDialog("Make a memorable user name");
        pw = JOptionPane.showInputDialog("Make a memorable password");
        JOptionPane.showMessageDialog(null,String.format("Hello %s, ***, hope you have fun learning",name));
        JOptionPane.showMessageDialog(null, String.format("To Unlock *** input the your password and username"));

        userName = JOptionPane.showInputDialog("What was your username again?");
        password = JOptionPane.showInputDialog("What was your password again?");

        if (userName.equals(user) && password.equals(pw)){
            JOptionPane.showMessageDialog(null,"Secret Message Unlocked:\n Welcome to CS21");
        }
        else {
            if (!(userName.equals(user)) && (password.equals(pw))){
                JOptionPane.showMessageDialog(null, "Not valid Username");
            }
            else if ((userName.equals(user)) && (!password.equals(pw))){
                JOptionPane.showMessageDialog(null, "Not valid password");
            }
            else {
                JOptionPane.showMessageDialog(null, "Invalid Username and Password");
            }
        }

    }
}
