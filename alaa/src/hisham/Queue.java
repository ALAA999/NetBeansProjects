
public class Queue {
    StackQueueNode front;
    StackQueueNode rear;
    int length;

    public void enqueue(HeapTreeNode H) {
        StackQueueNode temp = new StackQueueNode(H);
        if (this.rear == null) {
            this.front = this.rear = temp;
        } else {
            this.rear.link = temp;
            this.rear = temp;
        }
        ++this.length;
    }

    public HeapTreeNode dequeue() {
        if (this.length == 0) {
            return null;
        }
        HeapTreeNode temp = this.front.item;
        this.front = this.front.link;
        if (this.front == null) {
            this.rear = null;
        }
        --this.length;
        return temp;
    }
}
