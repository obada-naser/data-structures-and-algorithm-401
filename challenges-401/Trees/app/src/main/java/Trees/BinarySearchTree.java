package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree<T> extends BinaryTree<T> {


    public void addingValue(T value){
        Node<T> newNode=new Node<>(value);

        Node<T> tempRoot=root;

        System.out.println(root.left.value);
        if(root==null){
            root=newNode;
            System.out.println(root);

        }else{
            while(true){
                if(tempRoot.left!=null && (int)newNode.value<(int)tempRoot.value){
                    tempRoot=tempRoot.left;
                }else if(tempRoot.right!=null && (int)newNode.value>(int)tempRoot.value){
                    tempRoot=tempRoot.right;
                }
                else{
                    break;
                }
            }

                if ((int)root.value>=(int)newNode.value){
                    newNode.left=tempRoot.left;
                    tempRoot.left=newNode;

                }else{
                    newNode.right=tempRoot.right;
                    tempRoot.right=newNode;
                }
        }



    }
    public boolean containsValue(T num){



        if(root.value==num){
            return true;
        }
        else {
            for (int i=0;i<preOrderList.size();i++){
                if(preOrderList.get(i)==num){
                    return true;
                }
            }
            for (int i=0;i<inOrderList.size();i++){
                if(inOrderList.get(i)==num){
                    return true;
                }
            }
            for (int i=0;i<postOrderList.size();i++){
                if(postOrderList.get(i)==num){
                    return true;
                }
            }

        }
        return false;



    }
    public ArrayList<Integer> breadthFirst(BinaryTree<Integer> tree) {
        ArrayList<Integer> nums =new ArrayList<Integer>();
        Queue<Node> queue = new LinkedList<>();
        if (tree.root != null) {
            queue.add(tree.root);
            while (!queue.isEmpty()) {
                Node newNode = queue.remove();
                nums.add((Integer)newNode.value);
                if (newNode.left != null) {
                    queue.add(newNode.left);
                }
                if (newNode.right != null) {
                    queue.add(newNode.right);
                }
            }
        }
        return nums;
    }

    public boolean isEmpty() {
        return root == null;
    }





}
