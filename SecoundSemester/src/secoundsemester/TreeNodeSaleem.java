
import javax.swing.JOptionPane;


public class TreeNodeSaleem {

    String names;
    TreeNodeSaleem right;
    TreeNodeSaleem left;

    public TreeNodeSaleem(String names, TreeNodeSaleem right, TreeNodeSaleem left) {
        this.names = names;
        this.right = right;
        this.left = left;
    }
}

class InsertingData {

    static TreeNodeSaleem saleem;

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,
                "gggggggggggggggg\n<html> Website : <a href=\"\">http://www.facebook.com</a></html>");
        saleem = new TreeNodeSaleem("Alaa", null, null);
        saleem.left = new TreeNodeSaleem("Khaled", null, null);
        saleem.right = new TreeNodeSaleem("Khaled", null, null);
        insertLevelWise("Ala", "momo");
        System.out.println(saleem.left.names);
        System.out.println(saleem.right.names);
        System.out.println(saleem.left.left.names);
        System.out.println(saleem.right.names);
    }

    public static void insertLevelWise(String name1, String name2) {//This methode will insert 2 names from left to right!
        TreeNodeSaleem tns = saleem;
        TreeNodeSaleem tns2 = saleem;
        while (tns.left != null) {
            tns = tns.left;
        }
        tns.left = new TreeNodeSaleem(name1, null, null);
        //Right Side of the tree!
        while (tns2.right != null) {
            tns2 = tns2.right;
        }
        tns2.right = new TreeNodeSaleem(name2, null, null);
    }
}
