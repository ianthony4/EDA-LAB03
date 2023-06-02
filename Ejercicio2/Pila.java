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
    Node<T> temp = temp = this.top; 
    while(temp != null) 
      temp = temp.getNextNode();
    return temp.getData(); 
    
  }
  public T pop(){
    Node<T> temp = this.top;
  //  while(temp.getNextNode() != null)
  //    temp = temp.getNextNode();
    T data = temp.getData();
    temp = temp.getNextNode().getNextNode();
    return data;

  }
  public T push(T item){
    if(this.empty())
      this.top = new Node<T>(item);
    else{
      Node<T> temp = this.top;
      while(temp.getNextNode() != null)
        temp = temp.getNextNode();
      temp.setNextNode(new Node<T>(item));
    }
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
