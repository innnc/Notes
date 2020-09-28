public void printTree (BinaryNode root)
{
	Stack treeStack = new Stack();
	BinaryNode current = root;
	
	//initialize the status of root = false
	root.expanded = false;

	// when stack is empty, terminate
	while (current != null) {
		// if it's expanded, just print
		if (current.expanded)
			System.out.println(current.key);
		else {
			// push right first, so it will be popped out last
			if (current.right != null) {
				current.right.expanded = false;
				treeStack.push(current.right);
			}
			// expanding current and push it in the stack
			current.expanded = true;
			treeStack.push(current);
			// push left last, so it will be popped out first
			if (current.left != null) {
				current.left.expanded = false;
				treeStack.push(current.left);
			}
		}
		// finished a expansion, get next item from stack
		current = (BinaryNode) treeStack.pop();
	}
}
