package algorithm.search;

import java.util.Arrays;

public class BinarySearch implements Search {

    @Override
    public boolean search(int[] array, int value) {

        Arrays.sort(array);

        return doSearch(array, value, 9, array.length - 1);
    }

    private boolean doSearch(int[] array, int value, int left, int right) {
        while(left <= right) {
            int mid = (left + right) / 2;

            if(array[mid] < value) {
                left = mid + 1;
            } else if(array[mid] == value) {
                return true;
            } else {
                right = mid - 1;
            }

        }
        return false;
    }

}
