public class Vertex {

    private String name;
    private List<Edge> adjacenciesList;
    private Vertex predecessor;
    private boolean visited;

    public Vertex(String name){
        this.name = name;
        this.adjacencyList = new Arraylist<>();
        visited = false;
    }
    public void addAdjacency(Vertex startVertex, Vertex targetVertex){
        this.adjacenciesList.add(new Edge(startVertex, targetVertex));

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Vertex getPredecessor(){
        return predecessor;
    }
    public void setPredecessor(Vertex predecessor){
        this.predecessor = predecessor;
    }
    public boolean isVisited(){
        return visited;
    }
    public void setVisited(boolean visited){
        this.visited = visited;
    }
    public String toString(){
        return this.name + "";
    }
}
