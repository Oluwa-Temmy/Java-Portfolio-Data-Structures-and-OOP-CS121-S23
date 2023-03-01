public class ArrayDemo1 {
    public static void main(String[] args) {
        int[][][][] dim1 = {
                {
                        {
                                {1,2,3},{4,7,6}
                        }
                }
        };
        for ( int i = 0; i < 1;i++){
            for (int j=0; j<1; j++){
                for (int k = 0; k<2;k++){
                    for (int b=0; b<3;b++){
                        System.out.printf("dimension 1: %d\n",dim1[i][j][k][b]);
                    }
                }
            }
        }
    }
}
