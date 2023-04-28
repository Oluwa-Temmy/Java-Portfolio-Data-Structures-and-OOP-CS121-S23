import java.util.Scanner;

public class restaurantSelector {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String vegetarian_bool;
        String vegan_bool;
        String gluten_bool;

        System.out.println("Welcome to restaurant selector.\n Please Answer these questions so that I can find the best place for you to eat.\n\n");
        System.out.println("Is anyone in your party vegetarian?");
        vegetarian_bool = keyboard.nextLine().toLowerCase();

        System.out.println("Is anyone in your party vegan?");
        vegan_bool = keyboard.nextLine().toLowerCase();

        System.out.println("Is anybody in your party gluten-free?");
        gluten_bool = keyboard.nextLine().toLowerCase();


        if (vegetarian_bool.equals("no") && vegan_bool.equals("no") && gluten_bool.equals("no")){
            System.out.println("Joe's Gourmet burger");
        }

        if (vegetarian_bool.equals("yes") && vegan_bool.equals("no") && gluten_bool.equals("yes")) {
            System.out.println("Main Street Pizza Company");
        }
        if (vegetarian_bool.equals("yes") && vegan_bool.equals("no") && gluten_bool.equals("no")){
            System.out.println("Mama's Fine Italian");
        }
        System.out.println("The Chef's Kitchen\nCorner Cafe");

    }
}
