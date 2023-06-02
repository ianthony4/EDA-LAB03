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
  public T push(T item){
    if(this.empty())
      this.top = new Node<T>(item);
    else{
      Node<T> temp = this.top;
      while(temp.getNextNode() != null)
        temp = temp.getNextNode();
      temp.setNextNode(new Node<T>(item));
      this.count++;
    }
    // Segun los estandares de java se retorna el elemento
    return item;
  }
}
