package graph;

/**
 * Created by Team Quetzal on 23/03/2016.
 */
public abstract class Edge {
    protected Vertex origin;
    protected Vertex destination;

    /**
    * @return boolean : indicates if the edge is directed 
    */
    public boolean isDirected(){

          return (this instanceOf DirectedEdge);
    }
}
