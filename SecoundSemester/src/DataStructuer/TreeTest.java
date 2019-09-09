
import javax.swing.JOptionPane;

 class TreeTest {
   public static void main(String[] args) {
   TreeNode T1 = new TreeNode(50, null, null);
   Tree Z = new Tree();
   Z.root=T1;
   String insertM = JOptionPane.showInputDialog("-1 to exit\n1 to insert\n2 to delete\n3 to traverse");
   int n,m,in;
   String c,insertNameElement,deleteNameElement;
   n=Integer.parseInt(insertM);
       while (n!=-1) {           
           if(n==1){
               insertNameElement = JOptionPane.showInputDialog("Enter new element to insert");
               in=Integer.parseInt(insertNameElement);
               Z.insert(in);
           }else if(n==2){
              deleteNameElement = JOptionPane.showInputDialog("Enter new element to delete");
               in=Integer.parseInt(deleteNameElement);
               Z.delete(in); 
           }
           else if (n==3){
               c=JOptionPane.showInputDialog("1 for PREORDER\n2 for INORDER\n3 for POSTORDER\n");
               m=Integer.parseInt(c);
               if(m==1)
                   Z.preOrder(Z.root);
               else if (m==2)
                   Z.inOrder(Z.root);
               else
                   Z.postOrder(Z.root);
                   insertM=JOptionPane.showInputDialog("-1 to exit\n1 to insert\n2to delete\n3 tp traverse");
                   n=Integer.parseInt(insertM);
           }
       }
}
 
}
