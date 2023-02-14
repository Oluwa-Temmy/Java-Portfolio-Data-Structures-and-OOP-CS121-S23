import java.util.Arrays;
import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        String name;
        int hours;
        double payRate;
        double grossPay;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("what is your name?");
        name = keyboard.nextLine();

        System.out.print("how many hours do u work a week");
        hours = keyboard.nextLine();

        System.out.print("what is ur hourly rate");
        payRate = keyboard.nextLine();

    }
}
