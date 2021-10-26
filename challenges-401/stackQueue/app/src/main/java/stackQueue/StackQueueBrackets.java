package stackQueue;

public class StackQueueBrackets {

    public Boolean stackQueueBrackets(String Brackets){
        Stack<Character> stackBrackets =new Stack();


        if(Brackets.length()==0){
            return false;
        }
        int size=0;


        for(int i=0;i<Brackets.length();i++){
            if(Brackets.charAt(i)=='{' || Brackets.charAt(i)=='(' || Brackets.charAt(i)=='['){
                stackBrackets.push(Brackets.charAt(i));


            }
            else if( Brackets.charAt(i)=='}' && stackBrackets.peek()=='{'  ){
                stackBrackets.pop();


            }
            else if(Brackets.charAt(i)==')' && stackBrackets.peek()=='('){
                stackBrackets.pop();

            }
            else if(Brackets.charAt(i)==']' && stackBrackets.peek()=='['){
                stackBrackets.pop();

            }



        }
        return stackBrackets.isEmpty();





    }
}
