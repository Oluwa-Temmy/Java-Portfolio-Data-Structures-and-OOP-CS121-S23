import java.util.HashMap;
import java.util.Scanner;

public class HashMap_Methods {
    //Create the HashMap
    private HashMap<Integer, String> student_classroom = new HashMap<>();
    //*****************************************************************

    //These are used for the continue program to get user input
    private Scanner keyboard = new Scanner(System.in);
    int desk = 0;
    private String ans;
    private String ans2;
    //******************************************************************

    //This is the list of students used for the put method
    private String [] student_list = {"Rebeca", "Johnny", "Philip", "Jacey", "Fitzgerald", "Somi", "Jacey"};

    //This function puts an item into a hashmap from the student list above
    //Uses a for loop to get the items from the student list and gives each
    //name a key(desk)
    //Then uses .put(key, value) to insert the value into the hashmap
    //Returns the HashMap(student_classroom)
    public HashMap<Integer, String> putMethod(){
        for (String student : student_list){
            desk++;
            student_classroom.put(desk, student);
        }
        return student_classroom;
    }
    //This function gets a value by referring to its key in the HashMap, .get(key)
    public String getMethod(int key){
        return student_classroom.get(key);
    }

    //This remove function removes a key-value from the HashMap by
    //referring to its key
    //The function asks for which key(desk #) you would like to remove and
    //displays the formatted hashmap onto the console
    //It takes the user input and uses the .remove(key) method to remove the
    //key-value item from the hashmap(student_classroom), does not remove the key
    //Note: If you want to remove both you can also use .remove(key,value)
    public void removeMethod(){
        System.out.println("\nWhich desk would you like to remove\n" +
                "from the class?");
        formatClassroom(student_classroom);
        int key = Integer.parseInt(keyboard.nextLine());
        student_classroom.remove(key);
        System.out.println("\nHere is the new student classroom");
        formatClassroom(student_classroom);
    }

    //Get the size of the hashmap using the .size() method
    //Note: Hashmaps do not start with zero(or include the last element)
    //when using .size() so add +1 to iterate properly
    public int getClassroomSize(){
        return student_classroom.size();
    }

    //Check wather or not the hashmap contains any items/students using .isEmpty() method
    //returns a boolean of true if empty
    //false if not empty
    public boolean getMappingMethod(){
        return student_classroom.isEmpty();
    }

    //Clear the HashMap of all items using .clear() method
    public void clearClassroomMethod(){
        student_classroom.clear();
    }

    //displays single objects like the return object of .get() method
    public void displayMethod(Object display_option){
        System.out.println(display_option);
    }

    //takes in HashMap<Integer,String> data type
    //Uses a for loop to iterate through each item
    //Note: Hashmaps do not start with zero(or include the last element)
    //when using .size() so add +1 to iterate properly
    //Also, used a condition to change null to n/a
    //prints a formatted hashmap
    public void formatClassroom(HashMap<Integer,String> map_option){
        System.out.println(" Desk # | Student\n-------------------");
        for (int i =1; i< map_option.size()+1; i++){
            String student_name = map_option.get(i);
            if (student_name == null){
                student_name = "N/A";
            }
            System.out.printf("    %d   |  %s \n",i,student_name);
        }
    }

    //This is method for controlling the speed at which things print onto
    //the console and if user wants to quit. If user wants to quit the program
    //simply follow the instructions and System.exit(1) will execute
    //else click any button to continue the program
    public void continueProgram(){
        System.out.println("\n**Continue y/n");
        ans = keyboard.nextLine();
        ans.toLowerCase();
        if (ans.equals("n") || ans.equals("no")){
            System.out.println("**Are you sure? This WILL TERMINATE the program! y/n");
            ans2 = keyboard.nextLine();
            ans2.toLowerCase();
            if (ans2.equals("y") || ans.equals("yes")){
                System.exit(1);
            }
        }
        else {
            ans = "";
            ans2 ="";
        }
    }
}
