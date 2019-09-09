
 class StackQueueNode {
    HeapTreeNode item;
    StackQueueNode link;

    public StackQueueNode(HeapTreeNode item, StackQueueNode link) {
        this.item = item;
        this.link = link;
    }

    public StackQueueNode(HeapTreeNode item) {
        this.item = item;
    }

    public StackQueueNode() {
    }
}
