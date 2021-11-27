package hashTable;

import java.util.ArrayList;
import java.util.HashMap;

public class UniqueChar {
    public boolean unique(String stringWord){
        HashMap<Character,Integer> hashMap=new HashMap();

        for(Character charCount: stringWord.toCharArray()){
                if(hashMap.containsKey(charCount)){
                    return false;
                }else{
                    hashMap.put(charCount,1);
                }
        }
        return true;



    }
}
