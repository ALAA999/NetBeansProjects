
public class BinarySearchTree {
	TreeNode root;
	int size;
	public BinarySearchTree() {
	size=0;
	root=null;
	}
	public boolean isEmpty() {
		return root==null;
		}	
	public boolean isFull() {return !isEmpty();}
	public TreeNode insertNode(TreeNode newNode,TreeNode B) {
		if(B==null) {
			B=newNode;
			size++;
			return B;
			
		}else if(B.info>newNode.info) {
			B.left=insertNode(newNode, B.left);
			size++;
			return B;
		}else if(B.info<newNode.info) {
			B.right=insertNode(newNode,B.right);
			size++;
			return B;
		}else {
			
			System.out.println("Fall");
			size++;
			return null;
		
		}
		
}
	public void visit(TreeNode temp) {
		
		System.out.print("\t"+temp.info);
		
	}
    public void preOrder(TreeNode T) {
    	if(T!=null) {
    		visit(T);
    		preOrder(T.left);

    		preOrder(T.right);
    		
    	}
    }
    public TreeNode Search(TreeNode Node,TreeNode B) {
		if(B.info==Node.info) {
            System.out.print("\nI HAVE IT ....\n");
			return B;
			
		}else if(B.info>Node.info) {
			B.left=Search(Node, B.left);
			
			return B;
		}else if(B.info<Node.info) {
			B.right=Search(Node,B.right);
			return B;
		}else {
			
			System.out.println("Fall");
			return null;
		}
}
    public TreeNode insertNew(TreeNode newNode,TreeNode T) {
    	if(T==null) {
    		T=newNode;
    		return T;
    	}else if(T.info>newNode.info)
    	{
    		T.left=insertNew(newNode,T.left);
    		return T;
    	}else if(T.info<newNode.info)
    	{
    		T.right=insertNew(newNode,T.right);
    	return T;
    	}else {
    		System.out.println("UNSecssuful");
    		return null;
    	}
    	
    	
    }
    public TreeNode deleteNode(int a,TreeNode T) {
    	if(T==null) {
    		System.out.print("Not Found ");
    	return null;}
    	
    	
    	else if(T.info>a) {
    		T.left=deleteNode(a, T.left);    	
        	
    		return T; 
    	}else if(T.info<a)
    	{  	 T.right=deleteNode(a,T.right);
    	return T;
    	}else{
    		TreeNode q=T;
    		TreeNode s=T;
    		if(q.right==null)
    			T=q.left;
    		else if(q.left==null)
    			T=q.right;
    		else {
    			TreeNode p=q.right;
    			while(p.left!=null) {
    				s=p;
    				p=p.left;
    			}
    			T=p;
    			T.left=q.left;
    			s.left=p.right;
    			if(q.right==p)
    				T.right=p.right;
    			else {
    				T.right=q.right;
    			
    			}
    		}
    			
    		
    		
    		
    	}
    	return T;
		
    }
    public TreeNode inserT(TreeNode newNode,TreeNode T) {
    	if(T==null)
    		return newNode;
    	else {
    		if(T.info>newNode.info)
    			{T.left=inserT(newNode, T.left);    		
    			return T;
    			}
    		if(T.info<newNode.info)
    		{T.right=inserT(newNode,T.right);
    		return T;
    			
    		}
    	}
    	
    	System.out.print("Can't Do It");
   return null; 	
    }
    public TreeNode delete(TreeNode item,TreeNode T) {
	if(T==null)
		return null;
	else {
		if(T.info>item.info)
		{T.left=delete(item,T.left);
		return T;
		}
		else {
			if(T.info<item.info)
			{
				T.right=delete(item,T.right);
				return T;
			}
		}
}
	TreeNode P=T,S=null,Q=T;
	if(Q.right==null)
		return Q.left;
	if(Q.left==null)
		return Q.right;
	P=Q.right;
	while(P==null) {
		S=P;
		P=P.left;
	}
	T=P;
	T.left=Q.left;
	S.right=P.right;
	T.right=Q.right;
return T;	
}

}