package hashTable;

public class Node<T> {

    T value;
    Node next;

    public Node(T num) {
        this.value = num;
        this.next = null;
    }

}
