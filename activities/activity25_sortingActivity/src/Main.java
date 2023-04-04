import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sorting test = new Sorting();
        int [] list_input = test.getArray();
        System.out.println("\nHere is your unsorted list " + Arrays.toString(list_input));
        int [] new_list = test.sortArray(list_input);

        System.out.println("\nHere is your sorted list " + Arrays.toString(new_list));
    }
}
