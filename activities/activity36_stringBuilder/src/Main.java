//*********************************************************
//         Activity 36: String Builder
//          Submission: 4/25/2023
//******************************************************
//Description: This program lets you create and display
//as many customers into the terminal as you want.
//********************************************************
public class Main {
    public static void main(String[] args) {
        CustomerRecord test = new CustomerRecord();
        test.addCustomers();
        System.out.println(test.getAllCustomers() + "\n");
    }
}
