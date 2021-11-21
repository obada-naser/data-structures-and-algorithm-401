/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashTable;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test void addingTest(){

        HashTable newHash=new HashTable(10);
        newHash.add("hello","this is hello");
        assertEquals(true,newHash.contains("hello"));

    }
    @Test void gettingTest(){

        HashTable newHash=new HashTable(10);
        newHash.add("hello","this is hello");
        assertEquals("this is hello",newHash.get("hello"));

    }
    @Test void nullTest(){

        HashTable newHash=new HashTable(10);

        assertEquals(null,newHash.get("wow"));

    }

    @Test void collisionTest(){

        HashTable newHash=new HashTable(10);
        newHash.add("a","first");
        newHash.add("W","second");


        assertEquals("first",newHash.nodes[7].value);
        assertEquals("second",newHash.nodes[7].next.value);

    }

    @Test void collisionGetTest(){

        HashTable newHash=new HashTable(10);
        newHash.add("a","first");
        newHash.add("W","second");


        assertEquals("first",newHash.get("a"));
        assertEquals("second",newHash.get("W"));


    }


    @Test void hashingTest(){

        HashTable newHash=new HashTable(10);


        assertEquals(7,newHash.hash("a"));



    }


}