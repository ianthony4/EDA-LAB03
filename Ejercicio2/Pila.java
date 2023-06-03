public class Pila<T> {
  private Node<T> top;
  private Node<T> root;
  
  public Pila(){
    this.top = null;
    this.root = null;
  }
  public boolean empty(){
    return this.top == null;
  }
  public T peek(){
    return this.top.getData(); 
    
  }
  public T pop(){
    T temp = this.top.getData();
    this.top = this.top.getNextNode();
    return temp;

  }
  public T push(T item){
    // Para evitar que poner items sea complejo,
    // la estructura será la siguiente para nuevos items
    this.top = new Node<T>(item, this.top);
    // Segun los estandares de java se retorna el elemento
    return item;
  }
  // Metodo toString
  public String toString(){
    String res = "{ ";
    for(Node<T> temp = this.top; temp != null; temp = temp.getNextNode())
      res += ", " + temp.toString();
    return res + " }";
  }
}
