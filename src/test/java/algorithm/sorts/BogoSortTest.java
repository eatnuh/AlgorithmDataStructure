package algorithm.sorts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BogoSortTest {

    @Test
    public void test() {
        int[] array = {34, 1, 56, 223, 44, 99, 66};

        new BogoSort().sort(array);

        assertArrayEquals(new int[]{1, 34, 44, 56, 66, 99, 223}, array);
    }
}