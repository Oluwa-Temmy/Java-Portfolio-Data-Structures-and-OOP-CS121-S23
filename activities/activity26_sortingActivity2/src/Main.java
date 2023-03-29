import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Sorting test1 = new Sorting();
        ArrayList<Integer> list = test1.getArray();
        System.out.println("This is what you put in the list: \n" + list);

        ArrayList<Integer> new_list = test1.sortArray(list);
        System.out.println("This is the new list: \n" + new_list);
    }
}
