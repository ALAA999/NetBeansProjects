 class Stack {
    StackQueueNode topNode;

    public void push(HeapTreeNode j) {
        StackQueueNode newNode = new StackQueueNode();
        newNode.item = j;
        newNode.link = this.topNode;
        this.topNode = newNode;
    }

    public HeapTreeNode pop() {
        if (this.topNode == null) {
            return null;
        }
        StackQueueNode tempNode = this.topNode;
        this.topNode = this.topNode.link;
        return tempNode.item;
    }

    public HeapTreeNode peek() {
        return this.topNode.item;
    }

    public boolean isEmpty() {
        return this.topNode == null;
    }
}
