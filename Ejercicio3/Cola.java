package Ejercicio3;

import java.util.LinkedList;
import java.util.Queue;

public class Cola <T>{
    private Queue<T> elements;

    public Cola() {
        elements = new LinkedList<>();
    }

    public boolean enqueue(T item) {
        return elements.offer(item);
    }

    public T dequeue() {
        return elements.poll();
    }

    public T peek() {
        return elements.peek();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int size() {
        return elements.size();
    }
}
