
import javax.swing.table.DefaultTableModel;

public class HeapTree {

    HeapTreeNode root;
    DefaultTableModel modeltemp = new DefaultTableModel();

    public void preOrederTraversing(HeapTreeNode T) {

    	if (T != null) {
            visit(T.item);
            preOrederTraversing(T.left);

            preOrederTraversing(T.right);
        }

    }

    public void postOrderTraversing(HeapTreeNode T) {

    	if (T != null) {
            postOrderTraversing(T.left);
            postOrderTraversing(T.right);
            visit(T.item);
        }
    }

    public void inOrderTraversing(HeapTreeNode T) {
 
        if (T != null) {
            inOrderTraversing(T.left);
            visit(T.item);

            inOrderTraversing(T.right);

        }
}

    public void visit(Employee item) {
       
    
       Main.area.append("\n"+item.toString());
   
    }

 public static HeapTreeNode levelWiseLevel(Employee[] input, int index){
    if(1<=index){
        Employee value = input[index-1];
        if(value!=null){
            HeapTreeNode t = new HeapTreeNode(value);
            t.left = levelWiseLevel(input, index*2);
            t.right = levelWiseLevel(input, index*2+1);
            return t;
        }
    }
    return null;
}

 static HeapTreeNode cnvrt(Employee[] ar,int pos,int index){
     if((pos>index)||(ar[pos]==null))
         return null;
     HeapTreeNode tmp = new HeapTreeNode();
     tmp.item=ar[pos];
     
     tmp.left = cnvrt(ar,2*pos,index);
     tmp.right = cnvrt(ar,2*pos+1,index);
     return tmp;
 }
  public void usingStack(HeapTreeNode T) {
	  Stack S=new Stack();
	  HeapTreeNode N;
	  S.push(T);
	  while(!S.isEmpty()) {
		  
		  N=(HeapTreeNode)S.pop();
		  System.out.print("GAZA");
	  
		  if(N!=null) {
		  System.out.print("GAZAqqq");
	      visit(N.item);
          S.push(N.right);
          S.push(N.left);			  
		  }
	  }
  }
public void usingQueue(HeapTreeNode T) {
	Queue Q=new Queue();
    HeapTreeNode N;	
	Q.enQueue(T);
    while(!Q.isEmpty()) {
		N=(HeapTreeNode)Q.deQueue();
		if(N!=null) {
			visit(N.item);
			Q.enQueue(N.left);
			Q.enQueue(N.right);
		}
	}
}


}