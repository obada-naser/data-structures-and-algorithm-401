package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class KaryTree<T> {

    kNode<T> root;
    int num;

    public KaryTree(int num) {
    }


    public void add(T value){
        kNode<T> newNode = new kNode<>(value);
        if(this.root == null){
            this.root = newNode;
            return;
        }

        Queue<kNode<T>> queues = new LinkedList<>();
        queues.add(root);
        while(!queues.isEmpty()){
            kNode<T> current = queues.poll();
            if(current.children.size() < this.num){
                current.addChild(newNode);
                return;
            }
            else {
                queues.addAll(current.children);
            }
        }
    }

    public KaryTree<String> fizzBuzzTree(KaryTree<Integer> tree){
        KaryTree<String> newTree = new KaryTree<>(tree.num);
        Queue<kNode<Integer>> queue = new LinkedList<>();
        if(tree.root != null){
            queue.add(tree.root);
            while(!queue.isEmpty()){
                kNode<Integer> currentNode = queue.poll();
                String currentValue;
                if(currentNode.value % 3 == 0 && currentNode.value % 5 == 0)
                    currentValue = "FizzBuzz";
                else if((int)currentNode.value % 3 == 0){
                    currentValue="Fizz";
                }
                else if((int)currentNode.value % 5 == 0){
                    currentValue="Buzz";
                }
                else{
                    currentValue=currentNode.value.toString();
                }
                newTree.add(currentValue);
                if(! currentNode.children.isEmpty()){
                    queue.addAll(currentNode.children);
                }
            }
        }
        return newTree;
    }
}




