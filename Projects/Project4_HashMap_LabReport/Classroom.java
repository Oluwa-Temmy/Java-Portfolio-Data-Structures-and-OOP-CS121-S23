//*********************************************************
//         Activity 29: HashMap Lab Report
//          Submission: 5/1/2023
//*********************************************************
//In this program I analyze the HashMap data structure that
//can be found in java.util
//This is the implementation code using the HashMap that shows
//how a HashMap can be used to have students in a Classroom
//When running the code in the console, each method is broken down
//to properly explain how it works
//Also, there is a document attached
//*********************************************************

import java.util.HashMap;
public class Classroom {
    public static void main(String[] args) {
        HashMap_Methods test = new HashMap_Methods();

        //**********************putMethod****************************
        //This section of code gives an example of the put method
        HashMap<Integer, String> resultOfPut = test.putMethod();
        System.out.println("In this example I will use a classroom to \n" +
                "represent how a HashMap works\n" +
                "The classroom will represent the\n" +
                "hashmap, the key will be the desk, \n" +
                "and the values will be represented with\n" +
                "the names of the students.");

        test.continueProgram();

        System.out.println("\nputMethod()\n----------\n" +
                "Using the putMethod, I will put a list of \n" +
                "student names into the HashMap\n" +
                "and each student will get assigned to a desk\n");
        test.formatClassroom(resultOfPut);

        test.continueProgram();

        System.out.println("\nThe desk numbers represent the keys, \n" +
                "and the names are the values of the hashmap\n" +
                "In the HashMap you can see that there are\n" +
                "no duplicate keys, but there are duplicate\n" +
                "values. HashMaps allow duplicate values, but not\n" +
                "duplicate keys because it has to be able to access\n" +
                "certain values using it.\n" +
                "In this case there can be 2 students in a class with\n" +
                "the same name sitting at different desks, but you can't\n" +
                "have one student sitting at 2 desks at the same time");

        test.continueProgram();

        //**********************getMethod******************************
        //This section of code shows how the get method works
        String resultOfGet = test.getMethod(5);
        System.out.println("\ngetMethod()\n---------\n" +
                "I want to get the student that is at desk #5\n" +
                "So I use the desk number (key)\n" +
                "to access what the key's value is (student).\n" +
                "Feel free to change the key in the parameter.\n" +
                "In this case the value is:");
        test.displayMethod(resultOfGet);

        test.continueProgram();

        //*****************removeMethod***********************
        //This section of code shows how to remove the key-value
        //from the mapping
        System.out.println("\nremoveMethod\n-----------\n" +
                "In this method you can\n" +
                "use the remove method that we created in order \n" +
                "to remove a key-value from the HashMap");
        test.continueProgram();
        test.removeMethod();
        test.continueProgram();
        System.out.println("\nAs you can see to remove a certain key value\n" +
                "insert the key of the value you want to remove\n" +
                "Also, to remove the student and the desk from the classroom \n" +
                "you could use the .remove(key, value) to completely\n" +
                "remove a an item");
        test.continueProgram();

        //********************getClassroomSizeMethod***********************
        //This section of code shows the size of the HashMap
        int resultOfSize = test.getClassroomSize();
        System.out.println("\ngetClassroomSize() Method\n" +
                "------------\n" +
                "In this case I want to get the size\n" +
                "of the students in the classroom.\n" +
                "So I'll get my classroom size using my getSizeMethod\n" +
                "In this case the size is: ");
        test.displayMethod(resultOfSize);

        test.continueProgram();

        //*************clearClassroomMethod() getMappingMethod()*************
        //This section of code shows the cleared HashMap and also the
        // is empty method
        System.out.println("\ngetMappingMethod()\n----------\n" +
                "I want to check weather or not there\n" +
                "are students in a classroom.\n" +
                "If the classroom is empty the check would return true\n" +
                "else being false would mean the class is  not empty\n" +
                "In this case the result is: ");

        boolean resultOfEmpty = test.getMappingMethod();
        test.displayMethod(resultOfEmpty);
        test.continueProgram();
        System.out.println("clearClassroomMethod()\n----------\n" +
                "\nAfter a frustrating day I want to\n" +
                "remove all my students from the class\n" +
                "so I'll run the clearClassroomMethod to\n" +
                "remove all the students from the room\n" +
                "Let's run the getMappingMethod method again\n" +
                "to see if there are still students in the class\n" +
                "The result is: ");
        test.clearClassroomMethod();
        boolean resultOfEmpty2 = test.getMappingMethod();
        test.displayMethod(resultOfEmpty2);
    }

}
