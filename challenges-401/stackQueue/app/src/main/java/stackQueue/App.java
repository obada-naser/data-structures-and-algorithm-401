/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stackQueue;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());


// *********************   STACK    ****************************

        System.out.println("***** Stack *******");

        Stack<Integer> stack=new Stack<>();

        stack.push(2);
        stack.push(6);
        stack.push(4);
        stack.push(7);
        System.out.println(stack.toString());

        System.out.println("****** pop");
        stack.pop();
        System.out.println("****");

        System.out.println(stack.toString());
        System.out.println("*****");
        System.out.println(stack.peek());
        System.out.println("*****");
        System.out.println(stack.isEmpty());

// *********************   Queue    ****************************
        System.out.println("******* Queue *******");


        Queue<Integer> queue=new Queue<>();
        queue.Enqueue(3);
        queue.Enqueue(6);
        queue.Enqueue(8);
        queue.Enqueue(15);

        System.out.println(queue.toString());
        queue.Dequeue();
        queue.Dequeue();
        System.out.println(queue.toString());
        queue.Enqueue(6);
        System.out.println(queue.toString());
        System.out.println(queue.peek());

 // *********************   PseudoQueue    ****************************

        System.out.println("******* PseudoQueue *******");

        PseudoQueue<Integer> pseudoQueue=new PseudoQueue<>();

        pseudoQueue.Enqueue(5);
        pseudoQueue.Enqueue(4);
        pseudoQueue.Enqueue(8);
        pseudoQueue.Enqueue(2);
        pseudoQueue.Enqueue(7);

        pseudoQueue.Dequeue();
        pseudoQueue.Dequeue();

        System.out.println(pseudoQueue.toString());

        // *********************   AnimalShelter    ****************************

        System.out.println("********** AnimalShelter  *********** ");

        AnimalShelter animal=new AnimalShelter();

        Animal cat=new Cat();
        Animal dog=new Dog();

//        cat.equals("cat");
//        dog.equals("dog");
;


        animal.enqueue(cat);
        animal.enqueue(dog);

        System.out.println(animal.toString());



        animal.dequeue("cat");
        System.out.println(animal.toString());
        System.out.println( animal.dequeue("cat"));
        System.out.println(animal.dequeue("cow"));




    }
}
