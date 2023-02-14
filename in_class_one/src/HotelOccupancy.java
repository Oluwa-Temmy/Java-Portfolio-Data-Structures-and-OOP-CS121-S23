import java.util.Scanner;

public class HotelOccupancy {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int floors;
        int totalRooms = 0;
        int rooms;
        int totalOccupiedRooms = 0;
        int occupied;
        int vacantRooms;
        double occupancyRate;

        //initialize accumalator


        System.out.println("How many floors does the hotel have?");
        floors = keyboard.nextInt();

        while (floors<1)
        {
            System.out.println("Enter one or more");
            floors = keyboard.nextInt();
        }
        for(int i = 0 ; i < floors ; i++);
            System.out.println("How many rooms does the floor " + (i + 1) + "have?");
            rooms = keyboard.nextInt();


    }
}
