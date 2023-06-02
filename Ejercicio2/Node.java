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

}
