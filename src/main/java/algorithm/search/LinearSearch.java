package algorithm.search;

import java.util.Arrays;

public class LinearSearch implements Search {

    @Override
    public boolean search(int[] array, int value) {
        for(int element : array) {
            if(element == value) return true;
        }
        return false;
    }
}
