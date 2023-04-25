import java.util.ArrayList;

public class GenericMethods {
    //********************************
    //Takes a parameter of any ArrayList type(<E>)
    //Then iterates through the items in the list
    //And prints them out
    //********************************
    public <E> void printArrayList(ArrayList<E> inputArray){
        for (E element : inputArray){
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}
