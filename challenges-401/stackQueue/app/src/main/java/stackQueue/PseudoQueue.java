package stackQueue;

public class PseudoQueue<T> {

    Stack<T> stack1=new Stack();
    Stack<T> stack2=new Stack();




    public void Enqueue(T num){


        while(!stack1.isEmpty()){

            stack2.push(stack1.pop());


        }

        stack1.push(num);
        while(!stack2.isEmpty()){


            stack1.push(stack2.pop());


        }



    }

    public T Dequeue(){

        T returnValue= null;
        if(! stack1.isEmpty()){
            returnValue = stack1.Top.value;
            stack1.pop();
        }
        return returnValue;
    }

    @Override
    public String toString() {
        return "PseudoQueue{" +
                "stack1=" + stack1 +
                ", stack2=" + stack2 +
                '}';
    }
}
