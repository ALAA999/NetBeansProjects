
 class HeapTreeNode {

    Employees item;
    HeapTreeNode left;
    HeapTreeNode right;

    public HeapTreeNode(Employees item, HeapTreeNode left, HeapTreeNode right) {
        this.item = item;
        this.left = left;
        this.right = right;
    }

    public HeapTreeNode(Employees item) {
        this(item, null, null);

    }

    public HeapTreeNode() {
        this(null, null, null);
    }

}
