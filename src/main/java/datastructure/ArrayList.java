package datastructure;

import java.util.Arrays;

public class ArrayList<E> {

    private final static int DEFAULT_CAPACITY = 10;
    private final static int NEXT_CAPACITY_MULTIPLICAND = 2;

    private Object[] elements;
    private int size;

    public ArrayList() {
        this.elements = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public void add(E element) {
        if (elements.length == size) {
            elements = grow();
        }
        this.elements[size++] = element;
    }

    private Object[] grow() {
        int oldCapacity = elements.length;
        int newCapacity = oldCapacity * NEXT_CAPACITY_MULTIPLICAND;

        return Arrays.copyOf(elements, newCapacity);
    }

    public E get(int index) {
        if (index >= size) throw new IllegalArgumentException();
        return (E) this.elements[index];
    }

    public int size() {
        return this.size;
    }
}
