package Ejercicio3;

import java.util.*;

public class Cola <T>{
    private Node<T> elementos;

   
    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            elementos = newNode;
        } else {
            Node<T> currentNode = elementos;
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
        T data = elementos.getData();
        elementos = elementos.getNextNode();
        return data;
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola esta vacia");
        }
        return elementos.getData();
    }

    public boolean isEmpty() {
        return elementos == null;
    }

    
}
