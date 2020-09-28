public static BinaryNode find(int searchKey, BinaryNode root)
{
	BinaryNode current = root;
	while (current != null && current.key != searchKey) {
		if (searchKey < current.key)
			current = current.left;
		else
			current = current.right;
	} 
	return current;
}
