package Graph;

public class Vertex<T> {

  T value;
  int weight;

  public Vertex(T value) {
    this.value = value;
  }

  public Vertex(T value, int weight)  {
    this.value = value;
    this.weight = weight;
  }
}
