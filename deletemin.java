private BSTNode<K,E> deletemin(BSTNode<K,E> rt) {
    if (rt.left() == null)
        return rt.right();
    else {
        rt.setLeft(deletemin(rt.left()));
        return rt; //the original root will be returned
    }
}
