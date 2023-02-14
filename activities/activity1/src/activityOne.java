//***************************************************
//                Activity 1: Task Two
//    Name: Osayi Odiase    Course: CS 121
//          Submission Date: (1/18/2023)
//**************************************************
// Description: Display's name in three ways. All Caps, in all lowercase, and in reverse
// Input your firstname and lastname
//***************************************************
//***************************************************
// CLASS: activityOne
// NO METHODS
//**************************************************
import java.util.Scanner;
public class activityOne {
    public static void main(String[] args) {
        Scanner name_input = new Scanner(System.in);

        System.out.println("What is your firstname?");
        String firstname = name_input.nextLine();
        System.out.println("What is your last name?");
        String lastname = name_input.nextLine();

        String name = firstname + " " + lastname;

        StringBuilder reversed_name = new StringBuilder(name);

        System.out.printf("--Here are your name variations--\n Regular: %s %s \n All Caps: %s\n All lowercase: %s \n Reversed: %s\n\n", firstname, lastname, name.toUpperCase(), name.toLowerCase(), reversed_name.reverse());

    }
}
