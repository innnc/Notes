// Version 1
public static void sort(char[] a, int from, int to) {
	if (from >= to) {return;}
	int p = partition(a, from, to);
	sort(a, from, p);
	sort(a, p+1, to);
}
public static int partition(char[] a, int from, int to) {
	char pivot = a[from];
	int i = from - 1;
	int j = to + 1;
	while (i<j) {
		i++;
		while (a[i]<pivot) {i++;}
		j--;
		while (a[j]>pivot) {j--;}
		// swap these two characters
		if (i<j) {
			char hold = a[i];
			a[i] = a[j];
			a[j] = hold;                
		}
	}
	return j;
}

// Version 2
public void quicksort (int[] ar, int left, int right)
{
	int i;
	if (left < right) {
		i = partition (ar, left, right);
		quicksort (ar, left, i-1);
		quicksort (ar, i+1, right);
	}
}

public int partition (int[] ar, int left, int right)
{
	int pivot, arTemp, i, j;
	pivot = ar[right];
	i = left;
	j = right-1;
	while (true) {
		while (i <= right && ar[i] < pivot)
			i++;
		while (j >= left && pivot < ar[j])
			j--;
		if (i >= j) break;
		//swap ar[i] and ar[j]
        arTemp = ar[i];
		ar[i] = ar[j];
		ar[j] = arTemp;
	}
	ar[right] = ar[i];
	ar[i] = pivot;
	return i;
}
