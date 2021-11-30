/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Graph;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");


    }

    @Test void addingToGraphTest(){
        Graphs<String> graphs=new Graphs<String>();

        assertEquals(graphs.addVertex("O"),graphs.graph.containsKey(graphs.addVertex("O")));

    }

    @Test void addingEdgeTest(){
        Graphs<String> graphs =new Graphs<String>();
        Vertex<String> vertexOne=new Vertex<String>("O");
        Vertex<String> vertexTwo=new Vertex<String>("N");

        graphs.addEdge(vertexOne,vertexTwo ,true);


        assertEquals(vertexTwo , graphs.getNeighbors(vertexOne).get(0));


    }

    @Test void addingNeighborsTest(){
        Set<Vertex<String>> result = new HashSet<>();
        Vertex<String> vertexOne=new Vertex<String>("O");
        Vertex<String> vertexTwo=new Vertex<String>("N");
        result.add(vertexOne);
        result.add(vertexTwo);
        Graphs<String> graphs =new Graphs<String>();

        assertEquals(result, graphs.getNodes());




    }
    @Test void sizeTest(){

        Graphs<String> graphs =new Graphs<String>();
        Vertex<String> vertexOne=new Vertex<String>("O");
        Vertex<String> vertexTwo=new Vertex<String>("N");

        graphs.addEdge(vertexOne,vertexTwo ,true);

        assertEquals(2, graphs.getSize());

    }

    @Test void oneNodeTest(){
        Graphs<String> graphs = new Graphs<String>();
        Vertex<String> vertex = graphs.addVertex("A");

        Set<Vertex<String>> result5 = new HashSet<>();
        result5.add(vertex);


        assertEquals(result5, graphs.getNodes());



//        An empty graph properly returns null
        Graphs<String> emptyGraphs = new Graphs<String>();

        assertNull(emptyGraphs.getNodes());
    }

    @Test void BreadthFirstTest(){
        Graphs<String> graphs = new Graphs<String>();
        Vertex a = graphs.addVertex("O");
        Vertex b =  graphs.addVertex("B");
        Vertex c = graphs.addVertex("A");
        Vertex d = graphs.addVertex("D");
        Vertex A = graphs.addVertex("A");

        graphs.addEdge(a,b,true);
        graphs.addEdge(a,c,true);
        graphs.addEdge(c,d,true);
        graphs.addEdge(b,d,true);
        graphs.addEdge(A,d,true);

        assertEquals("O    B    A    D    A ", graphs.breadthFirst(a));
        assertNotNull(graphs.breadthFirst(a));

    }

    @Test void validTripTest(){
        Graphs<String> graphs = new Graphs<String>();
        Vertex a = graphs.addVertex("O");
        Vertex b =  graphs.addVertex("B");
        Vertex c = graphs.addVertex("A");
        Vertex d = graphs.addVertex("D");
        Vertex A = graphs.addVertex("A");

        Vertex[] trip2 = new Vertex[] {a,b};
        Vertex[] trip3 = new Vertex[] {c,d,A};
        assertEquals("true, $82" , graphs.businessTrip(graphs,trip2));
        assertEquals("true, $204" , graphs.businessTrip(graphs,trip3));

    }

    @Test void invalidTripTest(){
        Graphs<String> graphs = new Graphs<String>();
        Vertex a = graphs.addVertex("O");
        Vertex b =  graphs.addVertex("B");
        Vertex c = graphs.addVertex("A");
        Vertex d = graphs.addVertex("D");
        Vertex A = graphs.addVertex("A");

        Vertex[] trip2 = new Vertex[] {a,c};

        assertEquals("true, $82" , graphs.businessTrip(graphs,trip2));


    }

    @Test void roundTripTest(){
        Graphs<String> graphs = new Graphs<String>();
        Vertex a = graphs.addVertex("O");
        Vertex b =  graphs.addVertex("B");
        Vertex c = graphs.addVertex("A");
        Vertex d = graphs.addVertex("D");
        Vertex A = graphs.addVertex("A");

        Vertex[] trip2 = new Vertex[] {a,b,c,d};

        assertEquals("true, $82" , graphs.businessTrip(graphs,trip2));


    }

    @Test void depthFirst(){

        Graphs<String> graphs = new Graphs<String>();
        Vertex a = graphs.addVertex("O");
        Vertex b =  graphs.addVertex("B");
        Vertex c = graphs.addVertex("A");
        Vertex d = graphs.addVertex("D");
        Vertex A = graphs.addVertex("A");

        graphs.addEdge(a,b,true);
        graphs.addEdge(a,c,true);
        graphs.addEdge(c,d,true);
        graphs.addEdge(b,d,true);
        graphs.addEdge(A,d,true);

        List<Vertex<String>> result = new ArrayList<>();
        result.add(a);
        result.add(b);
        result.add(c);
        result.add(d);
        result.add(A);

        assertEquals(result , graphs.depthFirst(a));
        assertNotNull(graphs.depthFirst(a));


    }

}
