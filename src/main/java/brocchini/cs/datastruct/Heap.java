package brocchini.cs.datastruct;

import java.util.List;

/**
 * Created by mozart on 3/14/2016.
 */
public class Heap<T> {

    void maxHeapify(List<T> input, int i) {
        final int lPos = left(i);
        final int rPos = right(i);
        final int largest = biggest(input, i, lPos, rPos);
        if (largest != i) {
            exchange(input, i, largest);
            maxHeapify(input, largest);
        }
    }

    int biggest(List<T> input, int i, int lPos, int rPos) {
        int largest = (lPos < input.size() && gt(input, lPos, i)) ? lPos : i;
        return (rPos < input.size() && gt(input, rPos, largest)) ? rPos : largest;
    }

    boolean gt(List<T> input, int a, int b) { return ((Comparable<T>) input.get(a)).compareTo(input.get(b)) > 0;}

    boolean lt(List<T> input, int a, int b) {
        return ((Comparable<T>) input.get(a)).compareTo(input.get(b)) < 0;
    }

    boolean eq(List<T> input, int a, int b) {
        return ((Comparable<T>) input.get(a)).compareTo(input.get(b)) == 0;
    }

    public void buildMaxHeap(List<T> input) {
        final int len = input.size();
        for (int i = (len / 2); i >= 0; i--) {
            maxHeapify(input, i);
        }
    }

    void exchange(List<T> input, int i, int largest) {
        final T iEl = input.get(i);
        input.set(i, input.get(largest));
        input.set(largest, iEl);
    }

    static int left(int i) {
        return 2 * i + 1;
    }

    static int right(int i) {
        return left(i) + 1;
    }

    static int parent(int i) {
        return (i - 1) / 2;
    }
}
