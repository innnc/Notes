class Graphm implements Graph { // Graph: Adjacency matrix
	private int[][] matrix; // The edge matrix
	private int numEdge; // Number of edges
	public int[] Mark; // The mark array
	public Graphm() {}
	
    // Constructor
	public Graphm(int n) { 
		Init(n);
	}
	
	public void Init(int n) {
		Mark = new int[n];
		matrix = new int[n][n];
		numEdge = 0;
	}
	
    // # of vertices
	public int n() { return Mark.length; } 
	
    // # of edges
	public int e() { return numEdge; } 
	
    // Get v’s first neighbor
	public int first(int v) { 
		for (int i=0; i<Mark.length; i++)
			if (matrix[v][i] != 0) return i;
		return Mark.length; // No edge for this vertex
	}
	
    // Get v’s next edge
	public int next(int v, int w) { 
		for (int i=w+1; i<Mark.length; i++)
			if (matrix[v][i] != 0)
				return i;
		return Mark.length; // No next edge;
	}
	
    // Is (i, j) an edge?
	public boolean isEdge(int i, int j) 
		{ return matrix[i][j] != 0; }
	
	// Set edge weight
	public void setEdge(int i, int j, int wt) {
		assert wt!=0 : "Cannot set weight to 0";
		if (matrix[i][j] == 0) numEdge++;
		matrix[i][j] = wt;
	}
    
	// Delete edge (i, j)
	public void delEdge(int i, int j) { 
		if (matrix[i][j] != 0) {
			matrix[i][j] = 0;
			numEdge--;
		}
	}
    
	// Return edge weight
	public int weight(int i, int j) { 
		if (i == j) return 0;
		if (matrix[i][j] == 0) return Integer.MAX VALUE;
		return matrix[i][j];
	}
    
	// Get and set marks
	public void setMark(int v, int val) { Mark[v] = val; }
	public int getMark(int v) { return Mark[v]; }
}
