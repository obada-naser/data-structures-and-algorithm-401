package hashTable;

import com.sun.source.tree.Tree;
import org.checkerframework.checker.units.qual.K;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TreeIntersection {

    HashMap hashMap=new HashMap();
    TreeNode root;
    public HashMap preOrder(TreeNode root) {
        if (root != null) {
            this.hashMap.put(root.value, root.value);


            preOrder(root.left);


            preOrder(root.right);
        }
        return this.hashMap;

    }

    public List treeInsertion(TreeNode tree1, TreeNode tree2) {
        List list = new ArrayList();
        preOrder(tree1.root);

        traverse(tree2.root, list);
        return list;
    }

    public void traverse(TreeNode root, List list) {
        if (root != null) {
            if (hashMap.containsValue( root.value)) {
                list.add(root.value);
            }
            if (root.left != null) {
                traverse(root.left, list);
            }
            if (root.right != null) {
                traverse(root.right, list);
            }
        }
    }
}
