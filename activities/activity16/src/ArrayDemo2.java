public class ArrayDemo2 {
    public static void main(String[] args) {
        int[][][][] dim2 = new int[3][3][3][3];
        dim2[0][1][1][0] = 1;
        dim2[1][0][0][0] = 2;
        dim2[0][1][0][0] = 3;
        dim2[0][0][1][0] = 4;
        dim2[0][0][0][1] = 5;

        dim2[1][1][0][0] = 6;
        dim2[0][0][1][1] = 13;
        dim2[2][2][1][2] = 73;
        dim2[0][2][1][2] = 69;
        dim2[1][2][2][1] = 21;
        dim2[2][2][2][2] = 99;

        for (int[][][] inner1 : dim2){
            for (int[][] inner2 : inner1){
                for (int[] inner3 : inner2){
                    for (int inner4 : inner3){
                        System.out.printf("Here are the nums: %d\n", inner4);
                    }
                }
            }
        }
    }
}
