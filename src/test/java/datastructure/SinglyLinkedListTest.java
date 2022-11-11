package datastructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SinglyLinkedListTest {

    private static final String VALUE0 = "VALUE0";
    private static final String VALUE1 = "VALUE1";
    private static final String VALUE2 = "VALUE2";
    private static final String VALUE3 = "VALUE3";
    private static final String VALUE4 = "VALUE4";
    private static final String VALUE5 = "VALUE5";
    private static final String VALUE6 = "VALUE6";
    private static final String VALUE7 = "VALUE7";

    private SinglyLinkedList<String> linkedList;

    @BeforeEach
    public void beforeEach() {
        linkedList = new SinglyLinkedList<>();
        linkedList.add(VALUE0);
        linkedList.add(VALUE1);
        linkedList.add(VALUE2);
        linkedList.add(VALUE3);
        linkedList.add(VALUE4);
        linkedList.add(VALUE5);
        linkedList.add(VALUE6);
        linkedList.add(VALUE7);
    }

    @Test
    public void test1() {
        assertEquals(8, linkedList.size());
    }

    @Test
    public void test2() {
        assertEquals(VALUE2, linkedList.get(2));
    }

    @Test
    public void addFirstTest() {
        linkedList.add("INSERT", 0);
        assertEquals("INSERT", linkedList.get(0));
    }

    @Test
    public void addLastTest() {
        linkedList.add("INSERT", 8);

        assertEquals("INSERT", linkedList.get(8));
    }

    @Test
    public void addMidTest() {
        linkedList.add("INSERT", 5);

        assertEquals("INSERT", linkedList.get(5));
    }

    @Test
    public void removeFirstTest() {
        linkedList.remove(0);

        assertEquals(VALUE1, linkedList.get(0));
    }

    @Test
    public void removeLastTest() {
        linkedList.remove(7);
        assertEquals(7, linkedList.size());
        assertEquals(VALUE6, linkedList.get(6));
    }

    @Test
    public void removeMidTest() {
        linkedList.remove(3);

        assertEquals(VALUE4, linkedList.get(3));
    }

    @Test
    public void isEmptyTest() {
        assertEquals(false, linkedList.isEmpty());
    }

    @Test
    public void throwExceptionTest() {
        assertThrows(IllegalArgumentException.class, () -> linkedList.add(VALUE2, 100));
    }

}