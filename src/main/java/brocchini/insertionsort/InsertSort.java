package brocchini.insertionsort;

/**
 * Created by mbrocchini on 3/7/2016.
 */
public final class InsertSort {

    private InsertSort() {
        throw new RuntimeException("Error, trying to instantiate an  utility class.");
    }

    private static void sortInternal(int[] input){
        for (int i=1;i<input.length;i++){
            int key = input[i];
            int j = i-1;
            while(j>=0 && key<input[j]){
                input[j+1] = input[j];
                j--;
            }
            input[j+1] = key;
        }
    }

    static class IntSorter implements  Sorter{
        @Override
        public  void sort(int[] input) {
            sortInternal(input);
        }
    }

    public static Sorter sorter(){ return new IntSorter(); }
}
