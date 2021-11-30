package Graph;

public class TreeTest<T> extends TreeTraverse {


    Node<T> root;

    public void insert(T value){

        Node<T> newNode=new Node<T>(value);

        Node<T> temp=root;

        if(root==null){
            root=newNode;
        }else{
            while(true){
                if((int)newNode.value<(int)temp.value ){
                    if(temp.left==null){
                        temp.left=newNode;
                        break;
                    }
                    temp=temp.left;
                }
                else if((int)newNode.value>(int)temp.value){
                    if(temp.right==null){
                        temp=newNode;
                        break;
                    }
                    temp=temp.right;
                }


            }


        }
    }

    public boolean find(T value){
        Node<T> newNode=new Node<T>(value);
        Node<T> temp=root;

        while(temp.value!=newNode.value){
            if((int)newNode.value<(int)temp.value){
                temp=temp.left;
            }
            else if((int)newNode.value>(int)temp.value){
                temp=temp.right;

            }else{
                return false;
            }

        }
        return true;

    }

    @Override
    public String toString() {
        return "TreeTest{" +
                "root=" + root.value +
                '}';
    }
}
