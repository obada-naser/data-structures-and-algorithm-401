package stackQueue;

public class DuckDuckGoose {

                public static String duckDuckGoose(String [] letterString, int n ){
        Queue queue = new Queue();

        String dif = "";
        int size = 0;

        if (letterString.length==0){
            return "the array is empty";
        }else{
            for (int i = 0; i<letterString.length; i++){
                queue.Enqueue(letterString[i]);
                size++;

            }
        }
        while (size != 1){
            for (int i = 0; i<n-1; i++){
                dif=queue.Dequeue();
                queue.Enqueue(dif);
            }
            size--;
        }
        return (String) queue.Dequeue();
    }
}
