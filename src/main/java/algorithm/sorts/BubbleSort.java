package algorithm.sorts;

public class BubbleSort implements Sortable {

    @Override
    public void sort(int[] array) {
        int i, j;
        for (i = array.length - 1; i > 0; i--) {
            for (j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    private void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

}
