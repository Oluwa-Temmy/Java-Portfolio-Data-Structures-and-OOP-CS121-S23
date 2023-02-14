import java.util.Arrays;


public class TypeCasting {
    public static void main(String[] args) {
        int int1 = 18;
        int int2 = 5;

        int int3 = int1/int2;
        System.out.println("int3 = " + int3);

        double d0 = int1 / int2;
        System.out.println("making a float out of a number: " + d0);

        double d4 = (double)(int1 / int2);
        System.out.println("cast quotient of int division %.2f" + d4);

        double d1 = (double)int1 / int2;
        System.out.println("divide double by int %.2f " + d1);

        double d2 = int1 / (double)int2;
        System.out.println("divide int by double %.2f " + d2);

        double d3 = (double)int1 / (double)int2;
        System.out.println("divie double by double %.2f " + d3);


        //---------------------------------------------

    }
}
