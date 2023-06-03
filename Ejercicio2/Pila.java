public class Pila<T> {
  private Node<T> top;
  private int count;
  
  public Pila(){
    this.top = null;
    this.count = 0;
  }
  public boolean empty(){
    return this.count == 0;
  }
  public T peek(){
    return this.top.getData(); 
    
  }
  public T pop(){
    Node<T> temp = this.top;
    while(temp.getNextNode().getNextNode() != null)
      temp = temp.getNextNode();
    T data = temp.getNextNode().getData();
    temp.setNextNode(null);
    return data;

  }
  public T push(T item){
    // Para evitar que la Pila sea más compleja,
    // la estructura será la siguiente para nuevos items
    this.top = new Node<T>(item, this.top);
    this.count++;
    // Segun los estandares de java se retorna el elemento
    return item;
  }
  // Metodo toString
  public String toString(){
    String res = "{ ";
    for(Node<T> temp = this.top; temp != null; temp = temp.getNextNode())
      res += temp.toString() + ", ";
    return res + " }";
  }
}
