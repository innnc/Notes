public static IntLink deleteLink
(int searchKey, IntLink head)
{
	// Special case - Target is first node
	if (head.key == searchKey)
		return head.next;
	// Initialization for Traversal
	IntLink prev = head;
	IntLink toDelete = head.next;
	// Traverse
	while (toDelete != null && toDelete.key != searchKey) 
	{
		prev = toDelete;
		toDelete = toDelete.next;
	}
	// Remove node – update links
	if (toDelete != null)
		prev.next = toDelete.next;
	return head;
}
