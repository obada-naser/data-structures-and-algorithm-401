package stackQueue;

public class Stack <T> {
    Node<T> Top;


    public void push(T num){

        Node<T> newNode=new Node<>(num);

        newNode.next=Top;
        Top =newNode;



    }

    public T pop(){
        T temp = null;
        try {
            temp = Top.value;
            Top = Top.next;
        }catch (NullPointerException e){
            e.printStackTrace();
        }
        return temp;

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

