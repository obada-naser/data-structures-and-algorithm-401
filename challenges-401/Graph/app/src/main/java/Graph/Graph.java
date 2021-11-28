package Graph;

import java.util.*;

public class Graph<T> {

    Map<Vertex<T>,   ArrayList<Vertex<T>>> graph=new HashMap();


    public Vertex addVertex(T value){

        Vertex<T> newVertex=new Vertex(value);

        graph.put(newVertex,new  ArrayList<>());


        return newVertex;
    }

    public void addEdge(Vertex<T> source, Vertex<T>  destination, boolean unDirected){

        graph.get(source).add(destination);

        if (unDirected==true){
            graph.get(destination).add(source);
        }
    }

    public Set<Vertex<T>> getNodes(){

        Set<Vertex<T>> visited=new HashSet<>();
        if(!graph.isEmpty()){
            graph.forEach((key,values)->{
                visited.add(key);

            });
            System.out.println(visited.toString());
            return visited;

        }
        else{
            return null;
        }

    }

    public List<Vertex<T>> getNeighbors(Vertex<T> vertex){
       return graph.get(vertex);
    }

    public int getSize(){
        return graph.size();
    }

//    @Override
//    public String toString()
//    {
//        StringBuilder builder = new StringBuilder();
////foreach loop that iterates over the keys
//        for (Vertex<T> v : graph.keySet())
//        {
//            builder.append(v.toString() + ": ");
////foreach loop for getting the vertices
//            for (Vertex<T> w : graph.get(v))
//            {
//                builder.append(w.toString() + " ");
//            }
//            builder.append("\n");
//        }
//        return (builder.toString());
//    }

    public List<Vertex<T>> breadthFirst(Vertex<T> root){
        List<Vertex<T>> list = new ArrayList<>();
        Set<Vertex<T>> visited = new HashSet<>();
        List<Vertex<T>> queue = new ArrayList<>();

        queue.add(root);
        visited.add(root);

        while(!queue.isEmpty()){
            Vertex<T> front = queue.get(0);
            queue.remove(0);
            list.add(front);

            for (int i = 0; i < graph.get(front).size(); i++) {
                if (! visited.contains(graph.get(front).get(i))){
                    visited.add(graph.get(front).get(i));
                    queue.add(graph.get(front).get(i));
                }
            }

        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).value+"    ");
        }
        return list;
    }










}
