//Notice: the heap index must start from 1 for calculation
public void heapSort (int[] ar, int n)
{
	int arTemp;
	int parent, child;
	/* create a max-heap by the array*/
	for (int i=1; i<n; i++) {
		child = i+1;
		while (true) {
			parent = child / 2;
            //break if it's root or the parent is larger than its children
			if (child == 1 || ar[parent-1] >= ar[child-1])
			    break;
			// swap the child-1 and parent-1. because the array starts from 0
			arTemp = ar[parent-1];
			ar[parent-1] = ar[child-1];
			ar[child-1] = arTemp;
            //move to the parent
			child = parent;
		}
}

	/* remove elements from heap and place in array */
	for (int i=n-1; i>0; i--) {
		// put the max from heap to the last place of unsorted part
		arTemp = ar[0];
		ar[0] = ar[i];
		ar[i] = arTemp;
          
		parent = 1; //set parent as the root
		while (true) {
			child = 2 * parent;
			if (child > i) //reach the end
                  break;
			if (child < i && ar[child] > ar[child-1]) //select the larger child of a parent
				child++;
			if (ar[parent-1] >= ar[child-1]) // parent >= children
				break;
			//swap the parent and the child if not sorted
              arTemp = ar[parent-1];
			ar[parent-1] = ar[child-1];
			ar[child-1] = arTemp;
              
			parent = child; //move to the next
		}
	}
}
