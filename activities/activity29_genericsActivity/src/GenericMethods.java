public class GenericMethods {
    public <E> void printArrayList(E[] inputArray){
        for (E element : inputArray){
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}
