package hashTable;

import java.util.ArrayList;

public class TestingLinkeList<T> {

    Node<T> head;

    public TestingLinkeList() {
        this.head = null;
    }

    public void insert(T value){

        Node newNode=new Node<>(value);

        newNode.next=head;

        head=newNode;





    }
    public boolean includes(T value){
        Node current=head;
        while(current !=null){
            if (current.value==value){
                return true;
            }else{
                current=current.next;
            }
        }
        return false;
    }

    public int kvalue(int value){
        Node current=head;
        ArrayList<Object> arrayList=new ArrayList();
        while(current!=null){
            arrayList.add(current.value);
            current=current.next;

        }
        int x=0;
//        System.out.println(arrayList);
//        System.out.println(arrayList.contains(value));


           if(arrayList.contains(value)) {
               System.out.println(Math.abs(arrayList.indexOf(value)-arrayList.size()+1));
           }






        return x ;
    }

    public TestingLinkeList zipLists(TestingLinkeList list1, TestingLinkeList list2){
        Node current1= list1.head;
        Node current2= list2.head;

        TestingLinkeList testingLinkeList=new TestingLinkeList();
    while(true) {
        if (current1 != null) {
            testingLinkeList.insert(current1.value);
            current1 = current1.next;

        }
        if (current2 != null) {
            testingLinkeList.insert(current2.value);
            current2 = current2.next;


        }
       else{
            break;
        }
    }
    return testingLinkeList;
    }

    public void append(T value){

        Node current=head;

        while(current!=null){
            if(current.next==null){
                current.value=value;
                break;

            }
            current=current.next;
        }



    }
    public void insertBefore(T value,T newValue){

        Node current=head;
        Node temp=head;

        while(current!=null){
            if(current.next.value==value){
                Node newNode=new Node(newValue);
                newNode.next=current.next;
                current.next=newNode;

                break;

            }
            current=current.next;
        }



    }
    public void insertAfter(T value,T newValue){

        Node current=head;
        Node temp=head;

        while(current!=null){
            if(current.value==value){
                Node newNode=new Node(newValue);
                newNode.next=current.next;
                current.next=newNode;

                break;

            }
            current=current.next;
        }



    }
    public boolean hasCycle(Node head) {
        Node current=head;
        while(current!=null){
            if(current.next==null){
                return false;
            }
            current=current.next;
        }

        return true;
    }



    @Override
    public String toString() {
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
