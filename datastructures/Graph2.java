import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

//Adjacent List + Undirected graph
class Graph2{
  private Map<V, E> MapAdj;
  private int numEdges;
  
  Graph2(){
      MapAdj = new HashMap<>();
      numEdges = 0;
  }

  void addVert(V vertex) {
      if(!MapAdj.containsKey(vertex)) {
          MapAdj.put(vertex, new E());
      }
  }
  
  void removeVert(V vertex) {
      if(MapAdj.containsKey(vertex)) {
          MapAdj.remove(vertex);
          for(Entry<V, E> entry : MapAdj.entrySet()) {
              if(entry.getValue().getEdge().contains(vertex)) {
                  entry.getValue().getEdge().remove(vertex);
              }
          }
      }
  }
  
  void addEdge(V v1, V v2) {
      if(MapAdj.containsKey(v1) && MapAdj.containsKey(v2)) {
          if(!MapAdj.get(v1).getEdge().contains(v2)) {
              MapAdj.get(v1).getEdge().add(v2);
          }
      }else {
          addVert(v1);
          addVert(v2);
          MapAdj.get(v1).getEdge().add(v2);
      }
      numEdges++;
  }
  
  void removeEdge(V v1, V v2) {
      if(MapAdj.containsKey(v1) && MapAdj.containsKey(v2)) {
          if(!MapAdj.get(v1).getEdge().contains(v2)) {
              MapAdj.get(v1).getEdge().remove(v2);
              numEdges--;
          }
      }
  }
  
  boolean isAdj(V v1, V v2) {
      if(MapAdj.containsKey(v1) && MapAdj.containsKey(v2)) {
          if(!MapAdj.get(v1).getEdge().contains(v2)) {
              return true;
          }
      }
      return false;
  }
  
  Set<V> getNeighbors(V v){
      if(MapAdj.containsKey(v)){
          return MapAdj.get(v).getEdge();
      }else {
          return null;
      }
  }

}

class V{
    private int w;
    
    public V() {
        
    }
    public V(int w) {
        this.w = w;
    }
    public int getW() {
        return w;
    }
    public void setW(int w) {
        this.w = w;
    }
}

class E{
    private Set<V> Edge;
    
    E(){
        Edge = new HashSet<>();
    }
    
    void setEdge(V...vs) {
        for(V v: vs) {
            Edge.add(v);
        }
    }
    
    Set<V> getEdge(){
        return Edge;
    }
    
}