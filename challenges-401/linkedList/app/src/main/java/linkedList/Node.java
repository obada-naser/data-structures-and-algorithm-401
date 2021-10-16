package linkedList;


public class Node<T> {

    Node next;

    T value;
    public Node(T num){
        this.value=num;
        this.next=null;
    }

}
