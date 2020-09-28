public void printTree()
{
	if (left != null)
		left.printTree();
	System.out.println (key);
	if (right != null)
		right.printTree();
}
