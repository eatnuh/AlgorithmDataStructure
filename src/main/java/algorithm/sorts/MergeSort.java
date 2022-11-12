package algorithm.sorts;

public class MergeSort implements Sortable {
    @Override
    public void sort(int[] array) {
        doSort(array, 0, array.length - 1);
    }

    private void doSort(int[] array, int left, int right) {
        if(left < right) {
            int mid = (left + right) / 2;
            doSort(array, left, mid);
            doSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }

    }

    private void merge(int[] array, int left, int mid, int right) {
        int len = right - left + 1;
        int[] temp = new int[len];

        int i = left, j = mid + 1, k = 0;

        while(i <= mid && j <= right) {
            if(array[i] < array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }

        while(i <= mid) {
            temp[k++] = array[i++];
        }

        while(j <= right) {
            temp[k++] = array[j++];
        }

        System.arraycopy(temp, 0, array, left, len);
    }

}
