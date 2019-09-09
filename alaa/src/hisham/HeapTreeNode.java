



 class HeapTreeNode {
    Employee item;
    HeapTreeNode left;
    HeapTreeNode right;

    public HeapTreeNode() {
    }

    public HeapTreeNode(Employee item) {
        this.item = item;
    }

    public HeapTreeNode(Employee item, HeapTreeNode left, HeapTreeNode right) {
        this.item = item;
        this.left = left;
        this.right = right;
    }
}
