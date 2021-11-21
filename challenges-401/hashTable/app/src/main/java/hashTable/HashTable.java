package hashTable;

import java.util.Arrays;
import java.util.Objects;

public class HashTable {


    HashNode[] nodes;
    int numBuckets;
    int bucketSize;

    public HashTable(int bucketSize){
        this.bucketSize=bucketSize;
        this.nodes=new HashNode[this.bucketSize];

        for(HashNode node:nodes){
            node=new HashNode();
            this.numBuckets=this.numBuckets+1;

        }

    }

    public int hash(String key){

        int hashing= Objects.hashCode(key);


        int index=hashing%numBuckets;



        return index;

    }

    public void add(String key,String value){

        int index=hash(key);

        HashNode hashNode=new HashNode(key,value);
        if(nodes[index]==null){
            nodes[index]=hashNode;

        }else if (nodes[index].next==null){
            nodes[index].next=hashNode;

        }else {
            hashNode.next=nodes[index].next;
            nodes[index].next=hashNode;
        }
    }

    public String get(String key){

        int index=hash(key);
        String value=null;
        if(nodes[index]==null){
            value=null;
        }else{
            HashNode currentNode=nodes[index];
            while(currentNode!=null){
                if(currentNode.key==key){
                    value=currentNode.value;
                    break;

                }else{
                    currentNode=currentNode.next;
                }
            }
        }
        return value;
    }

    public boolean contains(String key){

        int index=hash(key);
        boolean value=false;
        if(nodes[index]==null){
            value=false;
        }else{
            HashNode currentNode=nodes[index];
            while(currentNode!=null){
                if(currentNode.key==key){
                    value=true;
                    break;

                }else{
                    currentNode=currentNode.next;

                }
            }
        }
        return value;
    }









}
