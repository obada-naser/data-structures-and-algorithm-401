package linkedList;

public class Queue<T> {

    Node<T> Front;
    Node<T> Back;



    public void Enqueue(T num){
        Node<T> newNode=new Node<>(num);
        if(isEmpty()){
            Front=newNode;
        }
        else{
            Back.next=newNode;
        }
        Back=newNode;

    }
    public Node Dequeue(){
        Node temp =Front;
            if(isEmpty()){
                System.out.println("Exception");
            }else {

                Front=Front.next;
                temp.next=null;

                System.out.println(temp.value);
            }
            return temp;
            }


    public T peek(){
        if(isEmpty()){
            System.out.println("there is no value!");
        }
        return Front.value;

    }


    public boolean isEmpty(){
        return Front==null;
    }

    @Override
    public String toString() {
        Node currentNode=Front;
        String data="";
        while(currentNode!=null){
            data=data+"{"+currentNode.value+"}"+"=>";
            currentNode=currentNode.next;
        }
        data=data+"NULL!";
        return data;

    }
}
