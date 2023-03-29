import java.util.Scanner;

public class BinarySearchTester {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        BinarySearch test1 = new BinarySearch();

        System.out.println(test1.list);
        System.out.println("Hello user, pick a number from the list or randomly for me to search for");

        int number = keyboard.nextInt();

        int index = test1.searchList(number);
        if (index == -1){
            System.out.println("The number you entered is not in the list");
        }
        else {
            System.out.printf("Your number %d is at index %d", number, index);
        }

    }
}
