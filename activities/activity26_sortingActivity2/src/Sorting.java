import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Sorting {
    private Scanner keyboard = new Scanner(System.in);
    private ArrayList<Integer> unsorted = new ArrayList<Integer>();
    private int num;


    public ArrayList<Integer> getArray(){
        System.out.println("You will pick five random numbers");
        for (int i =0; i<5;++i){
            System.out.println("What's your random numbers");
            num = keyboard.nextInt();
            keyboard.nextLine();
            unsorted.add(num);
        }
        return unsorted;
    }
    public ArrayList<Integer> sortArray(ArrayList<Integer> unsorted){

        for (int i=0; i<unsorted.size()-1;++i){
            int min = i;
            for (int j=i+1; j<unsorted.size();++j){
                if (unsorted.get(j) < unsorted.get(min)){
                    min = j;
                }
                System.out.println("J is now " + j);

            }
            int temp = unsorted.get(i);
            System.out.println("Temp is now i\n");
            unsorted.set(i, unsorted.get(min));
            System.out.println("J is now j-1\n");
            unsorted.set(min, temp);
            System.out.println("j-1 is now temp\n\n");
        }
        return unsorted;
    }
}
