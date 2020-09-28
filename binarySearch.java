static int binarySearch(int[] A, int K) {
    int l = -1;
    int r = A.length; // l and r are beyond array bounds
    while (l+1 != r) {  // Stop when l and r meet
        int i = (l+r)/2;  // Check middle of remaining subarray
        if (K < A[i]) r = i;   // In left half
        if (K  A[i]) return i; // Found it
        if (K > A[i]) l = i;   // In right half
    }
    return A.length; // Search value not in A
}
