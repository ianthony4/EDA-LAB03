public class Node<T> {
  private T data;
  private Node<T> nextNode;

  public Node(T data, Node<T> nextNode){
    this.data = data;
    this.nextNode = nextNode;
  }
  public Node(T data){
    this(data, null);
  }
  // Getters y Setters
  public T getData(){
    return this.data;
  }
  public void setData(T data){
    this.data = data;
  }
  public Node<T> getNextNode(){
    return this.nextNode;
  }
  public void setNextNode(Node<T> nextNode){
    this.nextNode = nextNode;
  }
  // Metodo toString
  public String toString(){
    return this.data.toString();
  }

}
