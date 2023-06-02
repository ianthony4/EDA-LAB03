public class Pila<T>{
  private Node<T> top;
  private int count;
  
  public Pila(){
    this.top = null;
    this.count = 0;
  }
  public boolean empty(){
    return this.count == 0;
  }
}
