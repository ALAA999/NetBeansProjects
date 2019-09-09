
class ListNode {

    String name;
    ListNode link;

    public ListNode(String name, ListNode link) {
        this.name = name;
        this.link = link;
    }

    public ListNode() {
        this(null, null);
    }
}

class maine {

    public static void main(String[] args) {
//        ListNode x = new ListNode();
//        ListNode y = new ListNode("Ali", null);
//        ListNode z = new ListNode("sami", null);
//        ListNode y1 = new ListNode("Ali", null);
//        ListNode z1 = new ListNode("sami", null);
//        firstNode e = new firstNode(new ListNode("Osama", null));
//        x.name = "Allosh";
//        System.out.println(x.name + "\n" + x.link);
//        x.link = y;
//        System.out.println(x.link.name);
//        y.link = z;
//        System.out.println(y.link.name);
//        x.link.link = z;
//        System.out.println(x.link.link.name);                   /*look at photo number 125 in java capteres*/
//
//        x.link.link.name = "Khaled";
//        System.out.println(x.link.link.name);
//        ListNode m = new ListNode("momen", null);
//        m.link = new ListNode("mohammed", null);
//        m.link.link = new ListNode("essa", null);
//        System.out.println(m.link.link.name + "\n\n----------------------------------------\nFirstNode!<e>");
//        //System.out.println(e.firstNode.name);
//        e.print();
//        System.out.println("\n-----------------FirstNode <f>");
//        firstNode f = new firstNode(x);
//        f.print();
//        ListNode M = f.serchforSTD("Ali");
//        System.out.println(M.name);
//        f.insertSecoundNewNode(new ListNode("Ahmed", null));
//        System.out.println(x.link.name);/*هنا ما كانش احمد مضيوف في ال اكس لكن بعد هادي الجمله انضاف وطبعناه*/
//
//        f.insertLast("kalel");
//        f.print();
//        System.out.println("---------------------------------------------------------------\n");
//        f.deleteLast();
//        f.print();
//        System.out.println("---------------------------------------------------------------\n");
//        firstNode w = new firstNode(x);
//        w.print_Recursion(x);
//        System.out.println("---------------------------------------------------------------\n");
//        ListNode x2 = firstNode.concat(y1, z1);
//        firstNode xx = new firstNode(x2);
//        xx.print();
//        xx.print_Recursion(x2);
        System.out.println("---------------------- Stack & queue\n");
        Stack s = new Stack();
        s.push("alaa");
        s.push("momen");
        s.print();
        System.out.println("------------------------------");
        //Object r = s.pop();
        //System.out.println(r);
        System.out.println("------------------------------");
        s.print();
    }
}

class firstNode {

    ListNode firstNode;
    ListNode tmp;

    public firstNode(ListNode firstNode) {
        this.firstNode = firstNode;
    }

    public void print() {
        tmp = firstNode;
        if (tmp == null) {
            System.out.println("The node is empty!");
        }
        while (tmp != null) {
            System.out.println(tmp.name);
            tmp = tmp.link;
        }
    }
    
////////////////////////////////////////////////////////////////////////////////

    public ListNode serchforSTD(String name) {
        ListNode tmp;
        tmp = firstNode;
        while (tmp != null) {
            if (name.equalsIgnoreCase(tmp.name)) {
                return tmp;
            } else {
                tmp = tmp.link;
            }
        }
        return tmp;
    }

    ////////////////////////////////////////////////////////////////////////////
    
    public void insertSecoundNewNode(ListNode node) {
        if (firstNode == null) {
            System.out.println("The List Node is Empty!");
        } else {
            node.link = firstNode.link;
            firstNode.link = node;
        }
    }

    ////////////////////////////////////////////////////////////////////////////
    
    public void insertLast(String name) {
        ListNode n = new ListNode();
        n.name = name;
        n.link = null;
        if (firstNode == null) {
            firstNode = n;
        } else {
            ListNode p = firstNode;
            while (p.link != null) {
                p = p.link;
            }
            p.link = n;
        }
    }

    ////////////////////////////////////////////////////////////////////////////
    
    public void deleteLast() {
        ListNode prev = null, current;
        if (firstNode != null) {
            if (firstNode.link == null) {
                firstNode = null;
            }
        } else {
            prev = firstNode;
        }
        current = firstNode.link;
        while (current.link != null) {
            prev = current;
            current = current.link;
        }
        prev.link = null;
    }

    ////////////////////////////////////////////////////////////////////////////
  
    public ListNode print_Recursion(ListNode l) {
        tmp = firstNode;
        if (l != null) {
            System.out.println(l.name);
            return print_Recursion(l.link);
        } else {
            return null;
        }
    }

    ////////////////////////////////////////////////////////////////////////////

    public static ListNode concat(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else {
            l1.link = concat(l1.link, l2);
            return l1;
        }
    }
}

////////////////////////////////////////////////////////////////////////////
//(Stack & queue)

class StackNode {

    Object item;
    StackNode Link;

    public StackNode() {
    }

    public StackNode(Object item, StackNode Link) {
        this.item = item;
        this.Link = Link;
    }
}

class Stack {

    StackNode topNode, tmp;
    int size = 0;

    boolean emty() {
        return (topNode == null);
    }

    public void push(Object item) {  //insert at head
        StackNode newNode = new StackNode();
        newNode.item = item;
        newNode.Link = topNode;
        topNode = newNode;
        ++size;
    }

    public Object pop() {  // delete from head
        /*if (topNode == null) {
         return null;
         } else {
         StackNode tempNode;
         tempNode = topNode;
         topNode = topNode.Link;
         --size;
         return tempNode.item;
         }*/

        StackNode tmp = new StackNode();
        tmp = topNode;
        topNode = tmp.Link;
        return tmp.item;
    }

    public void print() {
        /*tmp = topNode;
         if (tmp == null) {
         System.out.println("The node is empty!");
         }
         while (tmp != null) {
         System.out.println(tmp.item);
         tmp = tmp.Link;
         }*/

        StackNode tmp;
        tmp = topNode;
        while (tmp != null) {
            System.out.println(tmp.item);
            tmp = tmp.Link;
        }
    }
}
