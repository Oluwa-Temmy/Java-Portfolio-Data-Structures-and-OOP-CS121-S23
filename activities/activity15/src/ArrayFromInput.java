import java.util.Scanner;

public class ArrayFromInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String[] species = new String[4];
        int[] population = new int[4];
        String[] habitat = new String[4];

        for (int i = 0; i<4; i++){
            System.out.println("\nWhat is the species?");
            species[i] = keyboard.nextLine();

            System.out.println("What is the species population?");
            population[i] = Integer.parseInt(keyboard.nextLine());

            System.out.println("Where do they live?");
            habitat[i] = keyboard.nextLine();
        }
        System.out.println("Animal Kingdom\n-------------");
        for (int i = 0; i<species.length;i++){
            System.out.printf("Species: %s\nPopulation: %d\nHabitat: %s\n\n", species[i], population[i], habitat[i]);
        }
    }
}
