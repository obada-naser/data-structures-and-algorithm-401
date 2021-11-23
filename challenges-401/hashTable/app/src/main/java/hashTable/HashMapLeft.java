package hashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapLeft {



    public List mapleft(HashMap hashMap1,HashMap hashMap2){

        ArrayList list=new ArrayList();

        hashMap1.forEach((key,value)->{
            if(hashMap2.containsKey(key)){
                list.add("[ "+key+" , "+value+" , "+hashMap2.get(key) + " ]"+"\n");

            }
            else{
                list.add("[ "+key+" , "+value+" , "+"NULL  ] \n" );

            }
        });
    return list;
    }
}
