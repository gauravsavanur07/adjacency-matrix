import java.util.ArrayList;
public class ListToMatrix{
    ArrayList<Vertex>  vertices;
public  ListToMatrix(ArrayList<Vetices> vertices){
    this.vertices = vertices;
}

public String convertMatrix(){
    int verticesAmount = vertices.size();
    int adjacencyMatrix[][] = new int[verticesAmount][verticesAmount];

    for(int i =0; i< vertices.size(); i++){
        adjacencyMatrix[i][i] = 0;
        for(int j = 0; j< vertices.get(i).getAdjacentList().size(); i++){
            adjacentMatrix[i]vertices.indexOf(vertices.get(i).getAdjacentList().get{j}.getTargetVertex()){

            }
        }
        for(int i =0; i<adjacencyMatrix.length; i++){
            for(int j=0; j< adjacencyMatrix[0].length;j++){
                System.out.println(adjacencyMatrix[i][j] + " ");

            }
            System.out.println();
        }
        return buildMatrix(adjacencyMatrix);
    }

public String buildMatrix(int matrix[][]){
    String adjacencyMatrix = "";
    for(int i=0; i< matrix.length; i++){
        for(int j = 0; j<matrix[0].length; j++){
            adjacencyMatrix+=matrix[i][j] + "";

        }
        adjacencyMatrix+="\n";
    }
    return adjacencyMatrix;
}
}

}
