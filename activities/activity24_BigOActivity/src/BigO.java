public class BigO {
    public void printOnce(int num){
        System.out.printf("O(1) time complexity: %d\n\n", num);
    }
    public void printNTimes(int n){
        System.out.println("O(n) time complexity: ");
        for (int i=0;i<n;++i){
            System.out.println(n + 1);
        }
    }
    public void printNSquaredTimes(int n){
        for (int i = 0; i<n;++i){
            System.out.printf("\n\nSchool: %d    \n", i);
            for (int j=0;j<n;++j){
                System.out.printf("Student: %d  ", j);
            }
        }
    }
}
