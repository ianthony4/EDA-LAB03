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
    if(empty())
      return null; // Si esta vacio se enviaria un error
    return this.top.getData(); 
    
  }
  public T pop(){
    if(empty())
      return null; // Si esta vacio se enviaria un error
    T temp = this.top.getData();
    this.top = this.top.getNextNode();
    return temp;

  }
  public T push(T item){
    // Para evitar que poner items sea complejo,
    // la estructura será la siguiente para nuevos items
    Node<T> temp = new Node<T>(item, this.top);
    if(empty())
      this.root = temp; // Si es el 1er item será root
    this.top = temp;
    // Segun los estandares de java se retorna el elemento
    return item;
  }
  public int search(Object o){ 
    Node<T> temp = this.top;
    int i;
    for(i = 1; temp != null && !temp.getData().equals(o); i++)
      temp = temp.getNextNode();
    if(temp == null) // si es null, significa que no lo hayamos
      i = -1;
    return i;
  }
  // Metodo getRoot - raiz nodo de la Pila
  public Node getRoot(){
    return this.root;
  }
  // Metodo toString
  public String toString(){
    String res = "{ ";
    for(Node<T> temp = this.top; temp != null; temp = temp.getNextNode())
      res += ", " + temp.toString();
    return res + " }";
  }
}
