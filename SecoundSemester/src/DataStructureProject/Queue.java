
public class Queue {

    StackQueueNode front;
    StackQueueNode rear;
    int size;

    public boolean isEmpty() {
        return size == 0;
    }

    public void enQueue(HeapTreeNode newItem) {
        StackQueueNode temp = new StackQueueNode();
        temp.item = newItem;
        temp.link = null;
        if (rear == null) {
            front = rear = temp;
        } else {
            rear.link = temp;
            rear = temp;
        }
        size++;
    }

    public HeapTreeNode deQueue() {
        HeapTreeNode tempItem;
        if (size == 0) {
            return null;
        } else {
            tempItem = front.item;
            front = front.link;
            if (front == null) {
                rear = null;
            }
        }
        size--;
        return tempItem;
    }

}
