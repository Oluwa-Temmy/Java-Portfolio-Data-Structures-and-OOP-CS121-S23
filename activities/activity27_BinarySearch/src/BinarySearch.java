import java.util.ArrayList;
import java.util.Arrays;


public class BinarySearch {
    public ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,3,5,7,8,10,23,26,36));

    int left = 0;
    int right = list.size()-1;
    int mid = (left+right)/2;
    int count = 1;

    public int searchList(int num) {
        while (left < right){

            if (num == list.get(mid)){
                return mid;
            }
            if (num > list.get(mid)){
                left = mid+1;
            }
            if (num < list.get(mid)) {
                right = mid-1;
            }
            System.out.printf("Number of splits: %d\n", count);
            mid = (left + right)/2;
            count++;
        }
        return -1;
    }
    public ArrayList<Integer> changeElement(int index, int element){
        list.set(index,element);
        return list;
    }
}
