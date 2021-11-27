package hashTable;

import java.util.Arrays;
import java.util.HashMap;

public class HashMapWords {

    public  String  repeatWord(String words){
        HashMap<String,Integer> wordsList = new HashMap<>();
        String result = null;

        String[] split = words.split(" ");

        for (int i = 0; i < split.length; i++) {

            if (split[i].contains(",")){
                split[i] = deletingComa(split[i]);
//                System.out.println(deletingComa(split[i]));
            }


            if (wordsList.containsKey(split[i].toLowerCase())){
                result = split[i];
                break;
            }else{
                wordsList.put(split[i].toLowerCase(),i);
            }
        }
        return result;
    }




    public  String deletingComa(String str){
        str = str.substring(0, str.length() - 1);
//        System.out.println(str);
        return str;
    }

}
