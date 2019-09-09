
public class HeapArray {

    Employees list[] = new Employees[1000];
    int index = 0;

    public HeapArray() {
    }

    public void serve() {//What is the job of this mehtod
        Employees Node;
        if (isEmpty()) {
            //not
        } else {

            Node = list[1];
            swap(1, index);//Why 1
            if (index == 1) {
                index = 0;
            } else {
                index--;
                trickle(1, index);//Why 1
            }
        }
        System.out.println("/////////////////Serve//////");
        for (int i = 0; i < index; i++) {

            System.out.println(list[i].toString());
        }
    }

    public void swap(int i, int j) {
        Employees temp;
        temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    public void insert(Employees newNode) {
        int k = index;
        list[k + 1] = newNode;
        bubblingUp(k + 1);
        index++;
    }

    public void bubblingUp(int indexTemp) {

        int i = indexTemp;//Son
        int j = indexTemp / 2;//Father

        int x = list[i].empid, y = 10000;//it is 1000 not 10000
        if (j != 0) {
            y = list[j].empid;
        }
        if (y < x) {
            swap(i, j);
            bubblingUp(indexTemp / 2);
        }
    }

    public boolean isFull() {

        return index == 1000;
    }

    public boolean isEmpty() {
        return index != 1000;
    }

    public void trickle(int k, int l) {
        int i = k;
        int x = list[i].empid;//father
        while (i <= l / 2) {
            if (2 * i == l) {
                int y = list[l].empid;
                if (y > x) {
                    swap(i, 2 * i);
                    i = l;
                }
            } else {
                int y = list[2 * i].empid;
                int z = list[2 * i + 1].empid;
                if (x < y && y > z) {
                    swap(i, 2 * i);
                    i = 2 * i;
                } else if (x < y && y < z) {
                    swap(i, 2 * i + 1);
                    i = 2 * i + 1;
                } else {
                    i = l;
                }

            }
        }
    }

    public void newTrickle(int indextemp) {
        int i, x, y;
        int l = indextemp + 1;
        Employees temp, top;
        i = indextemp;
        top = list[i];
        while (2 * i <= l) {
            if (2 * i == l) {
                list[i] = list[l];
                i = l;
            } else {
                x = list[2 * i].empid;
                y = list[2 * i + 1].empid;
                if (x >= y) {
                    list[i] = list[2 * i];
                    i = 2 * i;
                } else if (x < y) {
                    list[i] = list[2 * i + 1];
                    i = 2 * i + 1;
                }
            }
        }

        list[i] = top;
        while ((int) i / 2 >= 1) {
            if (list[i].empid > list[i / 2].empid) {
                swap(i, i / 2);
            }
            i = i / 2;
        }

    }

    public void traverse() {
        /*   for(int i=0;i<index;i++){
         String ar[]= {(addFrame.heapTest.list[i+1].empid+""),(addFrame.heapTest.list[i+1].firstName+addFrame.heapTest.list[i+1].lastName),(addFrame.heapTest.list[i+1].maritalStatus),(addFrame.heapTest.list[i+1].basicSalary+""),(addFrame.heapTest.list[i+1].getToSalary()+"")};
         Tester.model.addRow(ar);
         }
         */

    }

    public Employees[] getList() {
        return list;
    }

    public void heapArray(int indextemp) {
        for (int i = 1; i <= indextemp; i++) {
            Mains.area.append("\n" + list[i].toString());
        }

    }

    public void setList(Employees[] list) {
        this.list = list;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

}
