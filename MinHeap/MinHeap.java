public class MinHeap {
    private int cap;
    private int[] arr;
    public int curSize;

    MinHeap(int size) {
        this.cap = size;
        arr = new int[size];
    }

    MinHeap(int[] arr) {
        this.arr = arr;
        this.cap = arr.length;
    }

    int[] heapify() {
        for(int i = 0; i < curSize / 2; i++) {
            percolateDown(i);
        }
        return arr;
    }

    void insert(int val) {
        if(curSize == cap) {
            return;
        }
        int idx = curSize;
        arr[idx] = val;
        curSize++;
        percolateUp(idx);

    }

    int top() {
        return arr[0];
    }

    int pop() {
        int ans = arr[0];
        int last = curSize - 1;
        swap(arr,0,last);
        curSize--;
        percolateDown(0);
        return ans;
    }

    void percolateUp(int idx) {
        while(idx > 0) {
            int parent = idx / 2;
            if(arr[parent] > arr[idx]) {
                swap(arr,idx,parent);
                idx = idx / 2;
            } else {
                break;
            }
        }
    }

    int update(int idx, int val) {
        int res = arr[idx];
        arr[idx] = val;
        if(val < res) {
            percolateUp(idx);
        } else {
            percolateDown(idx);
        }
        return res;
    }

    boolean isEmpty() {
        return curSize == 0;
    }

    void percolateDown(int idx) {
        while(idx < curSize) {
            int leftChild = idx * 2 + 1;
            int rightChild = idx * 2 + 2;
            if(rightChild < curSize) { // both valid
                int smaller = Math.min(arr[leftChild], arr[rightChild]);
                if(smaller < arr[idx]) { // can swap
                    if(arr[leftChild] == smaller) {
                        swap(arr,leftChild, idx);
                        idx = leftChild;
                    } else {
                        swap(arr,rightChild, idx);
                        idx = rightChild;
                    }
                } else {
                    break;
                }
            } else { // no right child
                if(leftChild < curSize && arr[leftChild] < arr[idx]) {
                    swap(arr, leftChild, idx);
                    idx = leftChild;
                } else {
                    break;
                }
            }

        }
    }

    void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
