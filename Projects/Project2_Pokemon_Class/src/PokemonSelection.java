import java.util.Scanner;

public class PokemonSelection {
    private Scanner keyboard = new Scanner(System.in);


    private Pokemon createPokemon(){

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

        return new Pokemon(name,hit_points,move,movePower,attackSpeed);
    }
    public void assignPokemon(){
        System.out.println("Hello, Welcome to pokemon selection\n");
        System.out.println("How many players will be playing?\n");
        int num_players = Integer.parseInt(keyboard.nextLine());
        for(int i = 0;i<num_players;i++){
            System.out.printf("\n\n\nCreate your pokemon player %d\n", i+1);
            Pokemon pokemon = createPokemon();
            System.out.printf("Player %d Pokemon\n------------------\n", i+1);
            pokemon.displayPokemonStats();
        }
        keyboard.close();

    }
}
