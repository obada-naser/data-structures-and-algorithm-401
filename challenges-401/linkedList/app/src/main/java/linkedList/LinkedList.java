package linkedList;


public class LinkedList<T> {

    Node<T> head;
    public LinkedList(){
        this.head=null;
    }

    public void insert(T num){
        Node<T> newNode=new Node<>(num);
        if(head!=null){
            newNode.next=head;

        }
        head=newNode;





    }
    public void appendValue(T num){


        Node<T> newNode=new Node<>(num);

        Node currentNode=head;

        while(currentNode.next!=null){

                currentNode = currentNode.next;

        }
        currentNode.next=newNode;

    }

    public void insertBefore(T num,T newNum){

        Node currentNode=head;
        while(currentNode.next!=null){
            if(currentNode.next.value==num){
                Node<T> newNode=new Node<>(newNum);
                newNode.next=currentNode.next;
                currentNode.next=newNode;

                break;
            }

                currentNode = currentNode.next;

        }

    }

    public void insertAfter(T num,T newNum){
        Node currentNode=head;

        while(currentNode.next!=null){
            if(currentNode.value==num){
                Node<T> newNode=new Node<>(newNum);
                newNode.next=currentNode.next;
                currentNode.next=newNode;
                break;

            }
            currentNode = currentNode.next;
        }
    }

    public boolean includes(T num){
        Node currentNode=head;

        while(currentNode !=null){
            if(currentNode.value.equals(num))
                return true;
            else {
                currentNode = currentNode.next;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        Node currentNode=head;
        String allData="";

        while(currentNode !=null){
            allData=allData+"{"+currentNode.value+"}"+"=>";
            currentNode = currentNode.next;

        }
        allData=allData+"NULL!";
        return allData;
    }







}
