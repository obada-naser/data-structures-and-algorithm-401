package Graph;

public class Node <T>{

    Node right;
    Node left;
    T value;

    public Node(T value){
        this.value=value;
    }

    public Node(Node right, Node left, T value) {
        this.right = right;
        this.left = left;
        this.value = value;
    }
}
