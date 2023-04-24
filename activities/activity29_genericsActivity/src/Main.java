

public class Main {
    public static void main(String[] args) {
        GenericMethods test = new GenericMethods();
        Integer [] intArray = {11,4,5,9};
        String [] stringArray = {"get", "out","me", "car"};
        Character [] charArray = {'a','b','c','d'};
        Double [] doubleArray = {5.5,1.2,0.1,9.0};

        System.out.println("Integer Array: ");
        test.printArrayList(intArray);

        System.out.println("\nString Array: ");
        test.printArrayList(stringArray);

        System.out.println("\nCharacter Array: ");
        test.printArrayList(charArray);

        System.out.println("\nDouble Array: ");
        test.printArrayList(doubleArray);

    }
}
