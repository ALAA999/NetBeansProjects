
public class Tester {

	public static void main(String[] args) {

		BinarySearchTree T=new BinarySearchTree();
		
		T.root=T.inserT(new TreeNode(15), T.root);
		T.root=T.inserT(new TreeNode(30), T.root);
		T.root=T.inserT(new TreeNode(21), T.root);
		T.root=T.inserT(new TreeNode(12), T.root);
		T.root=T.inserT(new TreeNode(13), T.root);
		T.root=T.inserT(new TreeNode(24), T.root);
	    System.out.println("Gaza");
	    T.root=T.delete(new TreeNode(21), T.root);
        T.preOrder(T.root);
		//	15	12	13	30	21	24
	}

}
