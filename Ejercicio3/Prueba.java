package Ejercicio3;

public class Prueba {
   public static void main(String[] args) {
     Cola<Integer> queue = new Cola<>();
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);

    System.out.println(queue.peek()); 

    int item = queue.dequeue();
    System.out.println(item); 

    System.out.println(queue.isEmpty()); 

    queue.dequeue();
    queue.dequeue();

    System.out.println(queue.isEmpty());
   } 
   
}
