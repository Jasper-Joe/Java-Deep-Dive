import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class MergeSort extends RecursiveAction {
    static final int THRESHOLD = 2;
    protected int low;
    protected int high;
    protected int[] array;
    protected int[] tempAtt;
    MergeSort(int[] arr, int low, int high) {
        this.array = arr;
        this.low = low;
        this.high = high-1;
        tempAtt = new int[high];
    }

    protected void compute() {
        if(high - low<= THRESHOLD) {
            Arrays.sort(array,low,high+1);
        } else {
            int mid = low + (high - low) / 2;
            MergeSort left = new MergeSort(array,low, mid + 1);
            MergeSort right = new MergeSort(array,mid+1,high + 1);
            List<MergeSort> tasks = new ArrayList<>();
            tasks.add(left);
            tasks.add(right);
            invokeAll(tasks);
            mergeParts(low, mid, high);
        }
    }

    private void mergeParts(int low, int mid, int high) {
        for(int i = low; i <= high; i++) {
            tempAtt[i] = array[i];
        }
        int i = low;
        int j = mid + 1;
        int k = low;
        while(i <= mid && j <= high) {
            if(tempAtt[i] <= tempAtt[j]) {
                array[k] = tempAtt[i++];
            } else {
                array[k] = tempAtt[j++];
            }
            k++;
        }
        while(i <= mid) {
            array[k++] = tempAtt[i++];
        }
        while(j <= high) {
            array[k++] = tempAtt[j++];
        }
    }
}
