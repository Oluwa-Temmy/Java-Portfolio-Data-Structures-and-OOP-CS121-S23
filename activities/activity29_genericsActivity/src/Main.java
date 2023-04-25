
//*********************************************************
//         Activity 29: Generics Methods
//          Submission: 4/24/2023
//******************************************************
//This program is meant to see how Generic Methods work
// prints an Array list
//********************************************************
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GenericMethods test = new GenericMethods();
        ArrayList <String> stringArray = new ArrayList<>();
        ArrayList <Integer> intArray = new ArrayList<>();
        ArrayList <Character> charArray = new ArrayList<>();
        ArrayList <Double> doubleArray = new ArrayList<>();

        Integer [] iArray = {11,4,5,9};
        String [] sArray = {"get", "out","me", "car"};
        Character [] cArray = {'a','b','c','d'};
        Double [] dArray = {5.5,1.2,0.1,9.0};

        for (int i = 0; i<4; i++){
            stringArray.add(sArray[i]);
            intArray.add(iArray[i]);
            charArray.add(cArray[i]);
            doubleArray.add(dArray[i]);
        }

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
