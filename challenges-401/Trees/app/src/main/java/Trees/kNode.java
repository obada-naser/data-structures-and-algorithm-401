package Trees;

import java.util.ArrayList;
import java.util.List;

public class kNode<T>{

    T value;

    List<kNode<T>> children=new ArrayList<>();


    public kNode(T value) {
        this.value = value;
    }

    public void addChild(kNode<T> newNode){
        this.children.add(newNode);
    }


}
