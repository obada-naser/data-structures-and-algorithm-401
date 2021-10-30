package Trees;

import java.util.ArrayList;

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


}
