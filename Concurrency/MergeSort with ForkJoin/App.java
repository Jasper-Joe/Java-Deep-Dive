import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class App {
    public static void main(String[] args) {
        int[] arr = new int[]{4,3,9,10,21,55,6,3,4,5,1,2,33,12,123,22,333};
        int len = arr.length;
        MergeSort action = new MergeSort(arr,0,len);
        ForkJoinPool commonPool = ForkJoinPool.commonPool();
        commonPool.invoke(action);
        commonPool.shutdown();
        for(int x : action.array) {
            System.out.println(x);
        }
    }
}
