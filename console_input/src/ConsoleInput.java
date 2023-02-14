import java.util.Scanner;

public class ConsoleInput {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("First name");
        String firstname = console.nextLine();
        System.out.println("Lastname");
        String lastname = console.nextLine();

        System.out.printf("Fullname: %s %s", firstname, lastname);
        console.close();

    }
}
