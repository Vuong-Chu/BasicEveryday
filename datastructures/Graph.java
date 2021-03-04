class Graph{
    //Adjacent Matrix
    private int[][] matrix;
    private int numEdge;
    private int[] Mark;
    
    
    public Graph() {
        
    }
    
    public Graph(int n) {
        Init(n);
    }
    
    public void Init(int n) {
        Mark = new int[n];
        matrix = new int[n][n];
        numEdge = 0;
    }
    
    public int n() {
        return Mark.length;
    }
    
    public int e() {
        return numEdge;
    }
    
    public int first (int v) {
        for(int i=0; i<Mark.length; i++) {
            if(matrix[v][i]!=0) {
                return i;
            }
        }
        return Mark.length;
    }
    
    public int next(int v, int w) {
        for(int i=w+1; i<Mark.length; i++) {
            if(matrix[v][i]!=0) {
                return i;
            }
        }
        return Mark.length;
    }
    
    public void setEdge(int i, int j, int wt) {
        assert wt!=0: "Cannot set weight to 0.";
        if(matrix[i][j]==0) {
            numEdge++;
        }
        matrix[i][j] = wt;
    }
    
    public void delEdge(int i, int j) {
        if(matrix[i][j]!=0) {
            numEdge--;
        }
        matrix[i][j]=0;
    }
    
    public boolean isEdge(int i, int j) {
        return matrix[i][j] != 0;
    }
    
    public int weight(int i, int j) {
        return matrix[i][j];
    }
    
    public void setMark(int v, int val) {
        Mark[v] = val;
    }
    public int getMark(int v) {
        return Mark[v];
    }
}