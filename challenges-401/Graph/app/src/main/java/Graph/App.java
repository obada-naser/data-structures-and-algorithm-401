/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Graph;

import org.w3c.dom.Node;

import java.util.Arrays;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

//        Graph<String> graph=new Graph<String>();


        Graph<String> graph = new Graph<String>();
        Vertex a = graph.addVertex("O");
       Vertex b =  graph.addVertex("B");
        Vertex c = graph.addVertex("A");
        Vertex d = graph.addVertex("D");
        Vertex A = graph.addVertex("A");

        graph.addEdge(a,b,true);
        graph.addEdge(a,c,true);
        graph.addEdge(c,d,true);
        graph.addEdge(b,d,true);
        graph.addEdge(A,d,true);





//
//        graph.addEdge(graph.addVertex("O"), graph.addVertex("B"),true);
//        graph.addEdge(graph.addVertex("O"), graph.addVertex("A"),true);
//        graph.addEdge( graph.addVertex("D"),graph.addVertex("A"),true);


//        System.out.println(graph.toString());

        graph.breadthFirst(a);





    }

}
