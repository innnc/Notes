// Version 1
static void Prim(Graph G, int s, int[] D, int[] V) { // V stores the previously visited vertex that is closest to source
   // Initialize
   for (int i=0; i<G.n(); i++) 
      D[i] = Integer.MAX VALUE;
   D[s] = 0;
  
  // Process the vertices
  for (int i=0; i<G.n(); i++) { 
      int v = minVertex(G, D);
      G.setMark(v, VISITED);
      if (v != s) AddEdgetoMST(V[v], v); // add the minimal edge connected with v to MST
      if (D[v] == Integer.MAX VALUE) return; // v is unreachable
      
      //set the distances(weights) of adjacent vertices of v
      for (int w = G.first(v); w < G.n(); w = G.next(v, w))
      if (D[w] > G.weight(v, w)) {
         D[w] = G.weight(v, w);
         V[w] = v;
      }
   }
}
