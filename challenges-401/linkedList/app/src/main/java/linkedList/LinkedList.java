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

    public boolean includes(T num){
        Node currentNode=new Node<>(num);
        currentNode=head;
        while(currentNode !=null){
            if(currentNode.value.equals(num))
                return true;
            else {
                currentNode = currentNode.next;
            }
        }
        return false;
    }


    public String Stringing(){
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
