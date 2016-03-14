package brocchini.cs.sort.sort;

/**
 * Created by mozart on 3/10/16.
 */
public class MergeSorter implements Sorter {
    @Override
    public void sort(int[] input) {
        int[] sorted = sortInt(input);
        mutateInputJustToReuseTests(input, sorted);

    }

    private void mutateInputJustToReuseTests(int[] input, int[] sorted) {
        int i = 0;
        for (int item : sorted) {
            input[i++]=item;
        }
    }

    public int[] sortInt(int[] input){
        if(input.length==1){
            return input;
        }
        final int[][]halves = split(input);
        return merge(sortInt(halves[0]), sortInt(halves[1]));
    }

    private int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length+right.length];
        int l = 0;
        int r = 0;
        int i = 0;
        while(i<result.length){
            if (l==left.length){
                result[i] = right[r];
                r++;
            } else if (r==right.length){
                result[i]=left[l];
                l++;
            }else if (left[l]<right[r]){
                result[i]=left[l];
                l++;
            }else {
                result[i]=right[r];
                r++;
            }
            i++;
        }

        return result;
    }

    private int[][] split(int[] input) {
        int leftSize = input.length / 2;
        int rightSize = input.length - leftSize;

        int[] left = new int[leftSize];
        for (int i=0;i<leftSize; i++){ left[i] = input[i]; } //For efficiency use System.arraycopy(input, 0, left, 0, leftSize);

        int[] right = new int[rightSize];
        for (int i=0;i<rightSize; i++){ right[i] = input[i+leftSize]; }// For efficiency use System.arraycopy(input, 0 + leftSize, right, 0, rightSize);

        return new int[][]{left,right};
    }


}
