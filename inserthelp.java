// return a root linked with new subtrees
private BSTNode<K,E> inserthelp(BSTNode<K,E> rt, K k, E e) {
	if (rt == null) return new BSTNode<K,E>(k, e);
	if (rt.key().compareTo(k) > 0)
		rt.setLeft(inserthelp(rt.left(), k, e)); //set root's left
	else
		rt.setRight(inserthelp(rt.right(), k, e)); //set root's right
	return rt;     //return is at the end
}
