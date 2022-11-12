package algorithm.sorts;

public class QuickSort implements Sortable{

    @Override
    public void sort(int[] array) {
        doSort(array, 0, array.length - 1);
    }

    private void doSort(int[] array, int left, int right) {
        if(left < right) {
            int pi = partition(array, left, right);
            doSort(array, left, pi - 1);
            doSort(array, pi + 1, right);
        }
    }

    private int partition(int[] array, int left, int right) {
        int pivot = array[left];
        int i = left, j = right;

        while(i < j) {
            while(pivot < array[j]) {
                j--;
            }
            while(i < j && pivot >= array[i]) {
                i++;
            }

            swap(array, i, j);
        }

        array[left] = array[i];
        array[i] = pivot;

        return i;

    }

    private void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
