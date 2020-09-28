// Version 2 - priority queue version
static void Dijkstra(Graph G, int s, int[] D) {
	int v; // The current vertex
	// use a container for vertices and weight
	DijkElem[] E = new DijkElem[G.e()]; 
	// Initial the source vertex, initialize minHeap
	E[0] = new DijkElem(s, 0); 
	MinHeap<DijkElem> H = new MinHeap<DijkElem>(E, 1, G.e());
	for (int i=0; i<G.n(); i++) // Initialize distance
		D[i] = Integer.MAX VALUE;
	D[s] = 0;
	//loop n times
	for (int i=0; i<G.n(); i++) {
		// Get the position # of 
		do { 
			v = (H.removemin()).vertex(); 
		} while (G.getMark(v) == VISITED);
		G.setMark(v, VISITED);
		if (D[v] == Integer.MAX VALUE) return; // Unreachable
		for (int w = G.first(v); w < G.n(); w = G.next(v, w)) {
			if (D[w] > (D[v] + G.weight(v, w))) { // Update D
				D[w] = D[v] + G.weight(v, w);
				H.insert(new DijkElem(w, D[w]));
			}
		}
	}
}

//DijkElem class
import java.lang.Comparable;
class DijkElem implements Comparable<DijkElem> {
	private int vertex;
	private int weight;
	public DijkElem(int inv, int inw)
		{ vertex = inv; weight = inw; }
	public DijkElem() {vertex = 0; weight = 0; }
	public int key() { return weight; }
	public int vertex() { return vertex; }
	public int compareTo(DijkElem that) {
		if (weight < that.key()) return -1;
		else if (weight == that.key()) return 0;
		else return 1;
	}
}
