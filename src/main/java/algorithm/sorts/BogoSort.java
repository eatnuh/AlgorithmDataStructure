package algorithm.sorts;

import java.util.Random;

public class BogoSort implements Sortable {

    private static final int SWAP_CNT = 5;
    private final Random random = new Random();

    @Override
    public void sort(int[] array) {

        while (!checkSorted(array)) {
            int i, temp;

            for (i = 0; i < SWAP_CNT; i++) {
                int index1 = random.nextInt(0, array.length);
                int index2 = random.nextInt(0, array.length);

                swap(array, index1, index2);
            }
        }

    }

    private boolean checkSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) return false;
        }
        return true;
    }

    private void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
