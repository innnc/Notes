// Version 1 - source vertex s, store the distances in D
static void Dijkstra(Graph G, int s, int[] D) {
	// Initialize
	for (int i=0; i<G.n(); i++) 
		D[i] = Integer.MAX VALUE;
	D[s] = 0;
	
	for (int i=0; i<G.n(); i++) { 
		// Find the closest vertex v among all unvisited vertices, mark it as visited
		int v = minVertex(G, D); 
		G.setMark(v, VISITED);
		// If the vertex v is unreachable, return
		if (D[v] == Integer.MAX VALUE) return; 
		// Set distances for every vertices connected to v
		for (int w = G.first(v); w < G.n(); w = G.next(v, w)) {
			if (D[w] > (D[v] + G.weight(v, w)))
				D[w] = D[v] + G.weight(v, w);
		}
	}
}

// minVertex - scan every adjecent vertices, return the vertex with shortest distance in D, depending on the values in D
static int minVertex(Graph G, int[] D) {
	// start from the first unvisited vertex v;
	int v = 0; 
	for (int i=0; i<G.n(); i++)
		if (G.getMark(i) == UNVISITED) { v = i; break; }
	// check every unvisited vertex in D, return the vertex with the smallest distance
	for (int i=0; i<G.n(); i++) {
		if ((G.getMark(i) == UNVISITED) && (D[i] < D[v]))
			v = i;
	}
	return v;
}
