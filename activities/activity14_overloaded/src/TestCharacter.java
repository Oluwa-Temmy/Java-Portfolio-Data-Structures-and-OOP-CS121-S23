public class TestCharacter {
    public static void main(String[] args) {
        Character character1 = new Character();
        Character character2 = new Character("blue");
        Character character3 = new Character("Lonely", "black", 666);

        character1.displayCharacter();
        System.out.println();

        character2.setName("Nathan");
        character2.displayCharacter();
        System.out.println();
        character3.setAge(11);
        character3.setName("Delilah",character3.getAge());
        System.out.printf("setname with get age %s\n",character3.getName());
        System.out.println("getAge of character " + character3.getAge());
        character3.displayCharacter();
        System.out.println();


    }
}
