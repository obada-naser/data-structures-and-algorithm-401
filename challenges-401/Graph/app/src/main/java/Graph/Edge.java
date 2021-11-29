package Graph;

public class Edge<T> {

    public int weight;
    public Vertex<T> vertex;

    public Edge() {}

    public Edge(Vertex<T> vertex){
        this.vertex = vertex;
    }

    public Edge(int weight, Vertex<T> vertex) {
        this.weight = weight;
        this.vertex = vertex;
    }

    @Override
    public String toString() {
        return ""+vertex;
    }

}
