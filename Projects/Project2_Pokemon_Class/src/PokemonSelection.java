import java.util.Scanner;

public class PokemonSelection {
    private Scanner keyboard = new Scanner(System.in);
    private int count = 1;

    private Object createPokemon(){
        System.out.println("Name of Pokemon?");
        String name = keyboard.nextLine();

        System.out.println("How many Hit Points");
        int hit_points = Integer.parseInt(keyboard.nextLine());

        System.out.println("What move would you like to use?");
        String move = keyboard.nextLine();

        System.out.println("What is the move's power");
        int movePower = Integer.parseInt(keyboard.nextLine());

        System.out.println("What is the attack speed");
        int attackSpeed = Integer.parseInt(keyboard.nextLine());

        Pokemon pokemon = new Pokemon(name,hit_points,move,movePower,attackSpeed);
        return pokemon;

    }
    public void assignPokemon(){
        System.out.printf("Hello player %d, Select a Pokemon and enter its stats",count);
        Object pokemon = createPokemon();
        System.out.printf("Player %d Pokemon\n", count);
        pokemon.displayPokemonStats();
        keyboard.close();
        count++;
    }
}
