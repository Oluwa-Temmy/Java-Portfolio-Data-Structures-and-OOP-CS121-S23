public class ArrayDemo3 {
    public static void main(String[] args) {
        String[][] dim2 = {{"Jake","Temmy","Precious"},{"Lucy","Oliver","Uber"}};

        for (String[] people : dim2){
            for (String names : people){
                System.out.printf("Look at the peeps: %s\n", names);
            }

        }
    }
}
