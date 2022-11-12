package algorithm.sorts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BubbleSortTest {

    @Test
    public void test() {
        int[] array = {34, 1, 56, 223, 44, 2, 78, 15, 36};

        new BubbleSort().sort(array);

        assertArrayEquals(new int[]{1, 2, 15, 34, 36, 44,  56, 78, 223}, array);

    }

}