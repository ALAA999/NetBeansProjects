
public class HeapTreeNode {
    Employee item;
 HeapTreeNode left;
 HeapTreeNode right;

    public HeapTreeNode(Employee item, HeapTreeNode left, HeapTreeNode right) {
        this.item = item;
        this.left = left;
        this.right = right;
    }
   public HeapTreeNode(Employee item){
       this(item,null,null);
       
   }
   public HeapTreeNode(){this(null,null,null);}
    
}
