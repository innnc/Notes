public class MergeSorter 
{
	public void mergesort(int[] ar, int left, int right) {
		if (left >= right) {return;}
		middle = (left + right) / 2;
		mergesort(ar, left, middle);
		mergesort(ar, middle+1, right);
		merge(ar, left, middle, right);
	}

	private void merge(int[] ar, int left, int mid, int right)
	{
		int[] arTemp = new int[right-left+1];
		int pt1 = left;    //the element in the left sublist
		int pt2 = mid + 1;    //the element in right sublist
		for (int pt3=0; pt3<right-left+1; pt3++) { //pt3 is the assigned element in arTemp
			if (pt1<mid+1 && (pt2>right || ar[pt1]<ar[pt2]))
				arTemp[pt3] = ar[pt1++];
			else
				arTemp[pt3] = ar[pt2++];
		}
		int ptr = 0;
		for (int pt3 = left; pt3 <= right; pt3++)
			ar[pt3] = arTemp[ptr++];
	}
}
