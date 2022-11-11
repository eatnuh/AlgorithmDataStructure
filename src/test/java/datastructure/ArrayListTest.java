package datastructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArrayListTest {
    private ArrayList<String> arrayList;

    private static final String VALUE0 = "VALUE0";
    private static final String VALUE1 = "VALUE1";
    private static final String VALUE2 = "VALUE2";
    private static final String VALUE3 = "VALUE3";
    private static final String VALUE4 = "VALUE4";
    private static final String VALUE5 = "VALUE5";
    private static final String VALUE6 = "VALUE6";
    private static final String VALUE7 = "VALUE7";

    @BeforeEach
    void beforeEach() {
        arrayList = new ArrayList<>();
        arrayList.add(VALUE0);
        arrayList.add(VALUE1);
        arrayList.add(VALUE2);
        arrayList.add(VALUE3);
        arrayList.add(VALUE4);
        arrayList.add(VALUE5);
        arrayList.add(VALUE6);
        arrayList.add(VALUE7);
    }


    @Test
    void test() {
        assertEquals(8, arrayList.size());
        assertEquals(arrayList.get(0), VALUE0);
    }

    @Test
    void addTest() {
        arrayList.add("BOB");
        assertEquals(9, arrayList.size());
        assertEquals("BOB", arrayList.get(8));
    }

    @Test
    void throwExceptionTest() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("VALUE1");
        assertThrows(IllegalArgumentException.class, () -> arrayList.get(10));
    }

}