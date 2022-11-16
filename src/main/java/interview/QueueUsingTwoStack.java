package interview;

import java.util.Stack;

// Stack 2개를 이용해서 큐만들기
public class QueueUsingTwoStack<E> {

    private final Stack<E> addStack;
    private final Stack<E> pollStack;

    public QueueUsingTwoStack() {
        addStack = new Stack<>();
        pollStack = new Stack<>();
    }

    public E poll() {
        if (pollStack.isEmpty()) move();
        return pollStack.pop();
    }

    private void move() {
        while (!addStack.isEmpty()) pollStack.push(addStack.pop());
    }

    public void add(E element) {
        addStack.push(element);
    }

}
