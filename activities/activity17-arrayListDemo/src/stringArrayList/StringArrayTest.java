package stringArrayList;

public class StringArrayTest {
    public static void main(String[] args) {
        StringArrayList test1 = new StringArrayList();

        test1.addLocation("Chicago");
        test1.addLocation("California");
        test1.addLocation("China");
        test1.addLocation("Geneva");

        System.out.println("First Test Add(For Loop):\n-----------------");
        test1.displayForLocation();

        test1.removeLocation("China");
        System.out.println("\nSecond Test Remove(ForEach):\n----------------");
        test1.displayForEachLocation();

        System.out.println("\nSize of List: " + test1.getSizeOfList());

        System.out.println("\nElement at index 2: "+ test1.getLocation(2));

    }
}
