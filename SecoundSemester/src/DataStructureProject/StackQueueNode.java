
public class StackQueueNode {

    HeapTreeNode item;
    StackQueueNode link;

    public StackQueueNode() {
        this(null, null);
    }

    StackQueueNode(HeapTreeNode item, StackQueueNode link) {
        this.item = item;
        this.link = link;
    }

}
