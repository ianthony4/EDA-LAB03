package Ejercicio3;

import java.util.*;

public class Cola <T>{
    private Node<T> root;

    public Cola() {
        this.root = null;
    }
    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node<T> currentNode = root;
            while (currentNode.getNextNode() != null) {
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(newNode);
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola esta vacia");
        }
        T data = root.getData();
        root = root.getNextNode();
        return data;
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola esta vacia");
        }
        return root.getData();
    }

    public boolean isEmpty() {
        return root == null;
    }
    
    
}
