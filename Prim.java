// Prims's MST algorithm: priority queue version
static void Prim(Graph G, int s, int[] D, int[] V) {
   int v; // The current vertex
   
   DijkElem[] E = new DijkElem[G.e()]; // Array for edges
   E[0] = new DijkElem(s, 0); // Initialize distance for the source vertex
   MinHeap<DijkElem> H = new MinHeap<DijkElem>(E, 1, G.e()); // heap for edges
   
   // Initialize D
   for (int i=0; i<G.n(); i++) 
      D[i] = Integer.MAX VALUE; 
   D[s] = 0;
   
   // Process the weights n times
   for (int i=0; i<G.n(); i++) { 
      do { v = (H.removemin()).vertex(); // Get the smallest weight
      } while (G.getMark(v) == VISITED);
      G.setMark(v, VISITED);
      if (v != s) AddEdgetoMST(V[v], v); // Add edge to MST
      if (D[v] == Integer.MAX VALUE) return; // Unreachable v
      
      // Set distances, vertex #, and insert the connection in the heap for all adjacent vertices
      for (int w = G.first(v); w < G.n(); w = G.next(v, w)) {
         if (D[w] > G.weight(v, w)) { 
            D[w] = G.weight(v, w);
            V[w] = v; // Store the value of vertices
            H.insert(new DijkElem(w, D[w]));
         }
      }
   }
}
