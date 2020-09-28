static LinkedList<Node> output = new LinkedList<Node>();
static void levelOrder(Node root){
      //Write your code here
    if (root != null) {
        output.add(root);
        while (!output.isEmpty()) {
            Node tree = output.poll();
            if (tree.left != null) {
                output.add(tree.left);
            }
            if (tree.right != null) {
                output.add(tree.right);
            }
            System.out.print(tree.data + " ");
        }
    }
}