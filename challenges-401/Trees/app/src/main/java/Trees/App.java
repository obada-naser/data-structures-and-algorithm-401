/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        BinarySearchTree<Integer> binaryTree=new BinarySearchTree();




        binaryTree.root=new Node(23);

        binaryTree.root.left=new Node(8);
        binaryTree.root.left.right=new Node(16);
        binaryTree.root.left.left=new Node(4);
        binaryTree.root.right=new Node(42);
        binaryTree.root.right.left=new Node(27);



//        BreadthFirst<Integer> breadthFirst1=new BreadthFirst<>();
//
        BinaryTree<Integer> tree=new BinaryTree<>();
//
//
//
//        System.out.println( breadthFirst1.breadthFirst(binaryTree));


        System.out.println(binaryTree.containsValue(65));



        binaryTree.addingValue(65);




        System.out.println( binaryTree.preOrder(binaryTree.root));
        System.out.println(binaryTree.inOrder(binaryTree.root));
        System.out.println(binaryTree.postOrder(binaryTree.root));







//        System.out.println(binaryTree.preOrderList);
        System.out.println(binaryTree.containsValue(65));
        System.out.println("************* max number *********");
        System.out.println(binaryTree.treeMax());

        System.out.println(binaryTree.isEmpty());


        System.out.println("*********** Breadth First ************");

        System.out.println(binaryTree.breadthFirst(binaryTree));



        System.out.println("*********** K-ary tree ************");

        KaryTree<Integer> kTree = new KaryTree<>(9);
        kTree.add(3);
        kTree.add(6);
        kTree.add(9);


        System.out.println(kTree.fizzBuzzTree(kTree).root.value);

        System.out.println("*********** Sum odd tree ************");

        System.out.println(binaryTree.oddSum());













    }



}
