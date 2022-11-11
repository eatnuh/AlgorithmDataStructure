package datastructure;

public class SinglyLinkedList<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public SinglyLinkedList() {
        this.size = 0;
    }

    public E get(int index) {
        return getNode(index).element;
    }

    public void add(E element) {
        add(element, size);
    }

    public void add(E element, int index) {
        if (index > size || index < 0) throw new IllegalArgumentException();

        Node<E> newNode = new Node<>(element);

        if (index == 0) {
            newNode.next = head;
            head = newNode;
            tail = tail == null? head : tail;
        } else {
            Node<E> prev = getNode(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
            tail = tail.next == null? tail : tail.next;
        }

        size++;
    }

    public void remove(int index) {
        if (index >= size || index < 0) throw new IllegalArgumentException();

        if (index == 0) {
            head = head.next;
            tail = head == null? null : tail;
        } else {
            Node<E> prev = getNode(index - 1);
            prev.next = prev.next.next;
            tail = prev.next == null? prev : tail;
        }

        size--;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private Node<E> getNode(int index) {
        // use cache
        if (index == 0) return head;
        if (index == size - 1) return tail;

        Node<E> node = head;
        for (int cnt = 0; cnt < index; cnt++) {
            node = node.next;
        }

        return node;
    }

    private static class Node<E> {

        private final E element;
        private Node<E> next;

        public Node(E element) {
            this.element = element;
        }

    }
}
