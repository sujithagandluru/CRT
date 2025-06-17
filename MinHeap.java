import java.util.*;
public class MinHeap {
    private ArrayList<Integer> heap;
    public MinHeap() {
        heap = new ArrayList<>();
    }
    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
    public void insert(int val) {
        heap.add(val);
        int i = heap.size() - 1;
        heapifyUp(i);
    }
    private void heapifyUp(int i) {
        while (i > 0) {
            int parent = (i - 1) / 2;
            if (heap.get(i) < heap.get(parent)) {
                swap(i, parent);
                i = parent;
            } else {
                break;
            }
        }
    }
    public int removeMin() {
        if (heap.isEmpty()) {
            throw new NoSuchElementException("Heap is empty");
        }
        int min = heap.get(0);
        int last = heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            heap.set(0, last);
            heapifyDown(0);
        }
        return min;
    }
    private void heapifyDown(int i) {
        int size = heap.size();
        while (i < size) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int smallest = i;
            if (left < size && heap.get(left) < heap.get(smallest)) {
                smallest = left;
            }
            if (right < size && heap.get(right) < heap.get(smallest)) {
                smallest = right;
            }
            if (smallest != i) {
                swap(i, smallest);
                i = smallest;
            } else {
                break;
            }
        }
    }
    public int getMin() {
        if (heap.isEmpty()) {
            throw new NoSuchElementException("Heap is empty");
        }
        return heap.get(0);
    }
    public void printHeap() {
        System.out.println(heap);
    }
    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();
        int[] values = {10, 4, 15, 20, 0, 3};
        for (int val : values) {
            minHeap.insert(val);
        }
        System.out.print("Min-Heap: ");
        minHeap.printHeap();
        System.out.println("Minimum Element: " + minHeap.getMin());
        System.out.println("Removing elements:");
        while (true) {
            try {
                System.out.print(minHeap.removeMin() + " ");
            } catch (NoSuchElementException e) {
                break;
            }
        }
    }
}
