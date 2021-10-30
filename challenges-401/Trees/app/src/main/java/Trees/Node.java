package Trees;

public class Node<T> {
    
    T value;
    Node<T> right;
    Node<T> left;

    public Node(T num){
        this.value=num;
        this.right=null;
        this.left=null;

    }
}
