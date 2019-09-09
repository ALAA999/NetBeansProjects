
 class HeapTree {
    HeapTreeNode root;
    int Size_rows;
    Object[][] My_Rows;
    int counter = 0;

    public HeapTree(int Size_rows) {
        this.Size_rows = Size_rows;
        this.My_Rows = new Object[Size_rows - 1][6];
    }

    public HeapTreeNode LevelWiseInsert(HeapTreeNode T, Employee E) {
        if (T == null) {
            HeapTreeNode P = new HeapTreeNode(E);
            return P;
        }
        int ID_Child = this.DoAction(T);
        switch (ID_Child) {
            case 0: {
                T.left = new HeapTreeNode(E);
                return T;
            }
            case 1: {
                T.right = new HeapTreeNode(E);
                return T;
            }
            case 2: {
                int LeftB = this.DoAction(T.left);
                int RightB = this.DoAction(T.right);
                if (LeftB == 0 || LeftB == 1) { 
                    this.LevelWiseInsert(T.left, E);
                } else if (RightB == 0 || RightB == 1) { 
                    this.LevelWiseInsert(T.right, E);
                } else {
                    this.LevelWiseInsert(T.left, E);
                }
                return T;
            }
        }
        return null;
    }

    public int DoAction(HeapTreeNode R) {
        if (R.left == null && R.right == null) {
            return 0;
        }
        if (R.right == null && R.left != null) {
            return 1;
        }
        if (R.left != null && R.left != null) {
            return 2;
        }
        return -1;
    }

    public Object[][] levelOrderTraversalQueue(HeapTreeNode startNode) {
        My_Rows = new Object[Size_rows][6];
        Queue Q = new Queue();
        Q.enqueue(startNode);
        int i = 1;
	int edit ;
        while (i < Size_rows) {
            HeapTreeNode tempNode = Q.dequeue();
            if (tempNode == null) continue;
	    edit = i - 1 ;
            My_Rows[edit][0] = tempNode.item.num;
            My_Rows[edit][1] = tempNode.item.firstName;
            My_Rows[edit][2] = tempNode.item.lastName;
            My_Rows[edit][3] = tempNode.item.maritalStatus;
            My_Rows[edit][4] = tempNode.item.salary;
            My_Rows[edit][5] = tempNode.item.totalSalary;
            ++i;
            Q.enqueue(tempNode.left);
            if (tempNode.right == null) continue;
            Q.enqueue(tempNode.right);
        }
        return My_Rows;
    }

    public Object[][] PreOrderTraversalStack(HeapTreeNode startNode) {
        My_Rows = new Object[Size_rows][6];
        Stack S = new Stack();
        S.push(startNode);
        int i = 1;
	int edit ;
        while (i < Size_rows) {
            HeapTreeNode tempNode = S.pop();
            if (tempNode == null) continue;
	    edit = i - 1 ;
            My_Rows[edit][0] = tempNode.item.num;
            My_Rows[edit][1] = tempNode.item.firstName;
            My_Rows[edit][2] = tempNode.item.lastName;
            My_Rows[edit][3] = tempNode.item.maritalStatus;
            My_Rows[edit][4] = tempNode.item.salary;
            My_Rows[edit][5] = tempNode.item.totalSalary;
            ++i;
            S.push(tempNode.right);
            S.push(tempNode.left);
        }
        return My_Rows;
    }

    public Object[][] PreOrderTraversal(HeapTreeNode T) {
        if (T != null) {
            this.Visit(T.item);
            this.PreOrderTraversal(T.left);
            this.PreOrderTraversal(T.right);
        }
        return this.My_Rows;
    }

    public Object[][] PostOrderTraversal(HeapTreeNode T) {
        if (T != null) {
            this.PostOrderTraversal(T.left);
            this.PostOrderTraversal(T.right);
            this.Visit(T.item);
        }
        return this.My_Rows;
    }

    public Object[][] InOrderTraversal(HeapTreeNode T) {
        if (T != null) {
            this.InOrderTraversal(T.left);
            this.Visit(T.item);
            this.InOrderTraversal(T.right);
        }
        return this.My_Rows;
    }

    public void Visit(Employee E) {
        this.My_Rows[counter][0] = E.num;
        this.My_Rows[counter][1] = E.firstName;
        this.My_Rows[counter][2] = E.lastName;
        this.My_Rows[counter][3] = E.maritalStatus;
        this.My_Rows[counter][4] = E.salary;
        this.My_Rows[counter][5] = E.totalSalary;
        ++counter;
    }
     public void cleaData(){
        counter = 0 ;
    }
}
