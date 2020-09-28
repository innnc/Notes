/** Remove element at specified position */
public E remove(int pos) {
    assert (pos >= 0) && (pos < n) : "Illegal heap position";
    DSutil.swap(Heap, pos, --n); // Swap with last value
    while (Heap[pos].compareTo(Heap[parent(pos)]) > 0) {
    	DSutil.swap(Heap, pos, parent(pos));
    	pos = parent(pos);
    }
    if (n != 0) siftdown(pos); // Push down
    return Heap[n];
}
