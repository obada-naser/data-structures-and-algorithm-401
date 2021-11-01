package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<T> {

    Node root;

    ArrayList<T> preOrderList=new ArrayList<>();
    ArrayList<T> inOrderList=new ArrayList<>();
    ArrayList<T> postOrderList=new ArrayList<>();
    public ArrayList preOrder(Node<T> root){
        if(root!=null){
            this.preOrderList.add(root.value);

            preOrder(root.left);
            preOrder(root.right);
        }

        return this.preOrderList;


    }

    public ArrayList inOrder(Node<T> root){
        if(root!=null){
            inOrder(root.left);
            this.inOrderList.add(root.value);
            inOrder(root.right);
        }

    return this.inOrderList;
    }
    public ArrayList postOrder(Node<T> root){

        if(root !=null){
            postOrder(root.left);
            postOrder(root.right);

            this.postOrderList.add(root.value);
        }
    return this.postOrderList;
    }

    public int treeMax(){
        int max = 0;
        ArrayList<T> list = preOrder(this.root);
        for (T num : list) {
            if ((int) num> max) {
                max = (int) num;
            }
        }
        return max;

    }




}
