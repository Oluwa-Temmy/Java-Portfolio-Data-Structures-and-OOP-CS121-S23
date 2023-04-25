package interfaces;

public class interfaceTest {
    public static void main(String[] args) {
        Freshman mike = new Freshman("mike", 1);
        Senior evelyn = new Senior("evelyn", 1);
        System.out.printf("Is %s an honors student?\n Answer: %s\n\n", mike.getName(),mike.isHonors());
        System.out.printf("Is %s an honors student?\n Answer: %s\n\n\n", evelyn.getName(),evelyn.isHonors());
    }
}
