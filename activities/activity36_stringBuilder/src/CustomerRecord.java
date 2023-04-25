import java.util.ArrayList;
import java.util.Scanner;

public class CustomerRecord {
    private ArrayList<Customer> customerArrayList = new ArrayList<>();
    private Scanner keyboard = new Scanner(System.in);

    //*****************addCustomers******************
    //This adds a customer object from the customer
    //class into the Array.
    //It uses a while loop to ask for user input
    //then takes the users input and creates an
    //object with it
    //***********************************************
    public ArrayList<Customer> addCustomers(){
        int customer_count = 0;
        System.out.println("Enter customers information");
        while (true){
            System.out.println("Press 'q' to quit, Press any other key to create a customer");
            String input = keyboard.nextLine();
            if (input.equals("q")){
                return customerArrayList;
            }
            System.out.println("What is the customers first name?");
            String fname = keyboard.nextLine();

            System.out.println("What is the customers last name?");
            String lname = keyboard.nextLine();

            System.out.println("What is the customers phone number");
            String phone_num = keyboard.nextLine();

            System.out.println("What is the customers email?");
            String email = keyboard.nextLine();

            System.out.println("What is the customers license?");
            String license = keyboard.nextLine();

            System.out.println("What is the customers age?");
            int age = Integer.parseInt(keyboard.nextLine());

            Customer new_customer = new Customer(fname,lname,phone_num,email,license,age);

            customerArrayList.add(new_customer);
            customer_count++;
            System.out.printf("Customers created count: %d\n", customer_count);
        }
    }
    //************getAllCustomers*************
    //This loops through the customerArrayList
    //that stores the customer objects, it
    //then loops through the items in the object
    //
    //A new string is created to store each
    //all of the formatted objects
    //
    //the customer class attribute
    //getCustomerInfo is used to order the
    //format the values nicely
    //***************************************
    public String getAllCustomers(){
        String allcustomers = "";
        for (Customer customer : customerArrayList) {
            allcustomers += customer.getCustomerInfo();
        }
        return allcustomers;
    }

}
