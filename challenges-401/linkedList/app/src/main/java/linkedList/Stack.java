package linkedList;

public class Stack <T> {
    Node<T> Top;


    public void push(T num){

        Node<T> newNode=new Node<>(num);

        newNode.next=Top;
        Top =newNode;



    }

    public Node pop(){
        Node currentNode = Top;
        if(isEmpty()){
            System.out.println("there is a null !");
        }
        else {

            Top = Top.next;
            currentNode.next = null;
            System.out.println(currentNode.value);

        }
        return currentNode;

    }

    public T peek(){
        if(isEmpty()){
            System.out.println("there is no value!");
        }
        return Top.value;

    }

    public boolean isEmpty(){
        return Top == null;
    }

    @Override
    public String toString() {
        Node currentNode=Top;
        String data="";
        while(currentNode!=null){
            data=data+"{"+currentNode.value+"}"+"=>";
            currentNode=currentNode.next;
        }
        data=data+"NULL!";
        return data;

    }
}
