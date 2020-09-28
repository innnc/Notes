boolean checkBST(BSTNode<Integer,Integer> root, Integer low, Integer high) {
	if (root == null) return true; // Empty subtree
	Integer rootkey = root.key();
	if ((rootkey < low) || (rootkey > high))
		return false; // Out of range
	if (!checkBST(root.left(), low, rootkey))
		return false; // Left side failed
	return checkBST(root.right(), rootkey, high);
}
