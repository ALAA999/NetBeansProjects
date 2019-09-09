
public class Stack {
StackQueueNode top;
int size=0;
public boolean isEmpty() {return size==0;}

public boolean isFull() {return size!=0;}
public void push(HeapTreeNode newNode) {
	StackQueueNode T=new StackQueueNode();
T.item=newNode;
	if(top==null)
	top=T;
else {
	T.link=top;
	top.link=T;
}
size++;	
}
public HeapTreeNode pop() {
	if(top==null)
		return null;
	else {
		StackQueueNode temp=top;
		top=top.link;
		size--;	

		return temp.item;
	}
}



}
