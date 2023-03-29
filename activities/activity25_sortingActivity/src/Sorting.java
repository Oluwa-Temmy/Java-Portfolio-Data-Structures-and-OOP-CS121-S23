import java.util.Scanner;

public class Sorting {
    int [] unsorted;
    Scanner keyboard = new Scanner(System.in);
    public int [] getArray(){
        System.out.println("Hey user! Pick 5 numbers and I will arrange them in order\n");
        for (int i = 0; i<5; i++){
            System.out.printf("%d. Pick your number", i);
            int num = keyboard.nextInt();
            keyboard.nextLine();
            unsorted[i] = num; //add num to list
        }
        return unsorted;
    }

    public int[] sortArray(int [] unsortedList) {
        for (int i =0; i<unsortedList.length;++i)
            for(int j = 1; j<unsortedList.length - i;++j){
                if (unsortedList[j]<unsortedList[j-1]){
                    int temp = unsortedList[j];
                    unsortedList[j]=unsortedList[j-1];
                    unsortedList[j-1]=temp;
                }
            }
        return unsortedList;
    }
}
