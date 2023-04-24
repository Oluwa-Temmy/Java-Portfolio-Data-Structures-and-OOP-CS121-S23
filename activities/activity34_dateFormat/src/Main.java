import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TotalCalories test = new TotalCalories();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = keyboard.nextLine();

        System.out.printf("Hello %s,How many calories do you eat a day?", name);
        int calories_per_day = Integer.parseInt(keyboard.nextLine());

        System.out.println("When is your start date in mm/dd/yyyy format?");
        String start_date = keyboard.nextLine();

        System.out.println("When is your end date in mm/dd/yyyy format?");
        String end_date = keyboard.nextLine();

        double test_result = test.calculateCalories(calories_per_day,start_date,end_date);
        System.out.printf("If you ate %d calories per day, this is the amount of calories you would have eaten\nbetween your start date and end date: " + test_result, calories_per_day);
    }
}
