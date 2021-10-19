package linkedList;

import java.util.*;
import java.io.IOException;

public class LinkedList<T> {

    Node<T> head;


    private int length;



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



    public void kthFromEnd(int num){
        Node currentNode=head;
        int length=0;


        while(currentNode!=null){
            currentNode = currentNode.next;
            length++;
            }

        currentNode=head;
        System.out.println(currentNode.value);
        System.out.println(length);

        for(int i=0;i<(length-num);i++){
            currentNode=currentNode.next;
        }
        if(num>length){
            System.out.println("Exception !");

        }else {

            System.out.println(currentNode.value + " is the " + num + "th value before the head");
        }


    }

    public void zipLists(LinkedList list1,LinkedList list2){
        Node currentNode1=list1.head;
        Node currentNode2=list2.head;
        LinkedList newList=new LinkedList();




        while(true){
            if(currentNode1!=null){
                newList.insert(currentNode1.value);

                currentNode1=currentNode1.next;
            }
            if(currentNode2!=null){
                newList.insert(currentNode2.value);
                currentNode2=currentNode2.next;
            }
            else{
                break;
            }

        }

        System.out.println(newList);

        System.out.println(list1+" "+list2);



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
