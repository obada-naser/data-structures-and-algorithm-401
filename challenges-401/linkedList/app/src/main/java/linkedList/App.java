/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedList;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        LinkedList<Integer> list=new LinkedList<>();

        list.insert(4);
        list.insert(8);
        list.insert(7);
        list.insert(9);
        list.insert(10);
        System.out.println(list.Stringing());
        System.out.println(list.includes(5));
    }
}
