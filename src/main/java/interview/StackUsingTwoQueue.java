package interview;

import java.util.LinkedList;
import java.util.Queue;

// Queue 2개로 Stack 만들기
public class StackUsingTwoQueue<E> {

    private Queue<E> main;
    private Queue<E> sub;

    public StackUsingTwoQueue() {
        main = new LinkedList<>();
        sub = new LinkedList<>();
    }

    public void push(E element) {
        main.add(element);
    }

    public E pop() {
        E pop;

        while (main.size() > 1) {
            sub.add(main.poll());
        }

        pop = main.poll();

        swapMainSub();

        return pop;
    }

    private void swapMainSub() {
        Queue<E> temp = main;
        main = sub;
        sub = temp;
    }

}
