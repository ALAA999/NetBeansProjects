
class Tree {

    public TreeNode root;

    public TreeNode insertNew(int a, TreeNode T) {
        TreeNode p;
        if (T == null) {
            p = new TreeNode();
            p.info = a;
            p.left = null;
            p.right = null;
            return p;
        } else if (a < T.info) {
            T.left = insertNew(a, T.left);
            return T;
        } else if (a > T.info) {
            T.right = insertNew(a, T.right);
            return T;
        } else {
            System.out.println(a + "already presents");
            return null;
        }
    }

    public void insert(int a) {
        root = insertNew(a, root);
    }

    public TreeNode deleteElement(int a, TreeNode T) {
        TreeNode p, q, s;
        if (T == null) {
            System.out.println(a + "Not found");
            return T;
        } else if (a < T.info) {
            T.left = deleteElement(a, T.left);
            return T;
        } else if (a > T.info) {
            T.right = deleteElement(a, T.right);
            return T;
        } else {
            q = T;
            s = T;
            if (q.right == null) {
                T = q.left;
            } else if (q.left == null) {
                T = q.right;
            } else {
                p = q.right;
                while (p.left != null) {
                    s = p;
                    p = p.left;
                }
                T = p;
                T.left = q.left;
                s.left = p.left;
                if (q.right == p) {
                    T.right = p.right;
                } else {
                    T.right = q.right;
                }
            }
            return T;
        }

    }

    public void delete(int a) {
        root = deleteElement(a, root);
    }

    public void visit(int a) {
        System.out.println(a);
    }

    public void preOrder(TreeNode T) {
        if (T != null) {
            visit(T.info);
            preOrder(T.left);
            preOrder(T.right);
        }
    }

    public void inOrder(TreeNode T) {
        if (T != null) {
            inOrder(T.left);
            visit(T.info);
            inOrder(T.right);
        }
    }

    public void postOrder(TreeNode T) {
        if (T != null) {
            postOrder(T.left);
            postOrder(T.right);
            visit(T.info);
        }
    }
}
