/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stackQueue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    // stack tests:

    @Test void pushTest(){
        Stack<Integer> stack=new Stack<>();

        stack.push(2);
        stack.push(6);
        stack.push(4);
        stack.push(7);

        assertEquals("{7}=>{4}=>{6}=>{2}=>NULL!",stack.toString(),"it should show this:{7}=>{4}=>{6}=>{2}=>NULL!");
    }
    @Test void popTest(){
        Stack<Integer> stack=new Stack<>();

        stack.push(2);
        stack.push(6);
        stack.push(4);
        stack.push(7);
        stack.pop();

        assertEquals("{4}=>{6}=>{2}=>NULL!",stack.toString(),"it should show this:{4}=>{6}=>{2}=>NULL!");
    }
    @Test void stackIsEmptyTest(){
        Stack<Integer> stack=new Stack<>();

        stack.push(2);
        stack.push(6);
        stack.push(4);

        stack.pop();
        stack.pop();
        stack.pop();

        assertTrue(stack.isEmpty());
    }

    @Test void stackPeek(){
        Stack<Integer> stack=new Stack<>();

        stack.push(2);
        stack.push(6);
        stack.push(4);
        stack.push(7);

        assertEquals(7,stack.peek(),"it should return the peak");
    }

    // Queue tests:

    @Test void EnqueueTest(){
        Queue<Integer> queue=new Queue<>();

        queue.Enqueue(3);
        queue.Enqueue(6);
        queue.Enqueue(8);
        queue.Enqueue(15);

        assertEquals("{3}=>{6}=>{8}=>{15}=>NULL!",queue.toString(),"it should show this:{3}=>{6}=>{8}=>{15}=>NULL!!");
    }

    @Test void dequeueTest(){
        Queue<Integer> queue=new Queue<>();

        queue.Enqueue(3);
        queue.Enqueue(6);
        queue.Enqueue(8);
        queue.Enqueue(15);

        queue.Dequeue();
        queue.Dequeue();

        assertEquals("{8}=>{15}=>NULL!",queue.toString(),"it should show this:{8}=>{15}=>NULL!");
    }

    @Test void  queueIsEmptyTest(){
        Queue<Integer> queue=new Queue<>();

        queue.Enqueue(3);
        queue.Enqueue(6);
        queue.Enqueue(8);
        queue.Enqueue(15);

        queue.Dequeue();
        queue.Dequeue();
        queue.Dequeue();
        queue.Dequeue();

        assertTrue(queue.isEmpty());
    }
    @Test void queuePeek(){
        Queue<Integer> queue=new Queue<>();

        queue.Enqueue(3);
        queue.Enqueue(6);
        queue.Enqueue(8);
        queue.Enqueue(15);


        assertEquals(3,queue.peek(),"it should return the peak");
    }

    @Test void pseudoQueueTest(){

        PseudoQueue<Integer> pseudoQueue=new PseudoQueue<>();

        pseudoQueue.Enqueue(5);
        pseudoQueue.Enqueue(4);
        pseudoQueue.Enqueue(8);
        pseudoQueue.Enqueue(2);
        pseudoQueue.Enqueue(7);

        pseudoQueue.Dequeue();
        pseudoQueue.Dequeue();

        assertEquals("PseudoQueue{stack1={8}=>{2}=>{7}=>NULL!, stack2=NULL!}",pseudoQueue.toString());
    }

    @Test void animalShelter(){

        AnimalShelter animal=new AnimalShelter();

        Animal cat=new Cat();
        Animal dog=new Dog();


        animal.enqueue(cat);
        animal.enqueue(dog);

        animal.dequeue("cat");

        assertEquals("AnimalShelter{dog={stackQueue.Dog@6fffcba5}=>NULL!, cat={stackQueue.Cat@34340fab}=>NULL!, otherAnimals=NULL!}",animal.toString());


    }

    @Test void stackQueueBracketsTest(){
        StackQueueBrackets brackets=new StackQueueBrackets();



        assertTrue( brackets.stackQueueBrackets("{}"),"this should return true");
        assertTrue( brackets.stackQueueBrackets("{}(){}"),"this should return true");
        assertFalse(brackets.stackQueueBrackets("[({}]"),"this should return false");

        assertFalse(brackets.stackQueueBrackets("(]("),"this should return false");

    }



}
