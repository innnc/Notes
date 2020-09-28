public void preorder(BinNode rt) 
{
	if (rt == null) return; // Empty subtree
	visit(rt); //Output
	preorder(rt.left());
	preorder(rt.right());
}
