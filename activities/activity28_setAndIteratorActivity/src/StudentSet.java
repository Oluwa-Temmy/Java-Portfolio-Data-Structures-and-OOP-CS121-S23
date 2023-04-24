
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class StudentSet {
    Set <String> da_set = new HashSet<>();
    Scanner keyboard = new Scanner(System.in);

    //************addStudents***************************
    //Add students to the new set(da_set)
    //When called the user is asked to input as many students as they would like
    //Then while the while loop is true it takes in the Scanner input
    //if the input equals q then the while loop stops and returns the set
    //else it adds the student to the set
    //**************************************************
    public Set<String> addStudents() {
        System.out.println("Hello, user\nAdd as many students as you would like.\n" +
                "When your finished press q to quit\n");
        while (true) {
            System.out.println("Enter Student name");
            String input = keyboard.nextLine();
            if (input.equals("q")) {
                return da_set;
            }
            da_set.add(input);
        }
    }
    //**************displayStudent*****************
    //The method creates an iterator for the set(da_set)
    //and prints the items from a while loop
    public void displayStudent(){
        Iterator<String> items = da_set.iterator();
        System.out.println("List of students:\n-------------");
        while (items.hasNext()){
            System.out.println(items.next());
        }
    }
}
