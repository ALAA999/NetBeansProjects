 class HeapArray {
    Employee[] item = new Employee[1000];
    int Count_Heap = 1;

    public HeapArray() {
        this.item[0] = null;
    }
    
    public void newTrickle(int index) {
    	Count_Heap = 1 ;
    	for (int i = 0 ; i<1000 ; ++i) {
    		if (index!=0) {
    		
    		Count_Heap++ ;
    	}
    		else break ;

    	}
    		int m = Count_Heap ;
    		int i = m/2 ;
    		while (i!=0) {
    			trickle(i);
    			i+=-1;
    		
    	}
    }

    public boolean Insert(Employee value) {
        if (this.Count_Heap == this.item.length) {
            return false ;
        } else {
            this.item[this.Count_Heap] = value;
            this.bubble(this.Count_Heap);
			++this.Count_Heap;
                        return true;
        }
    }

    private void bubble(int Id_Elment) {
        if (Id_Elment != 0) {
            int parentIndex = Id_Elment / 2;
            if (parentIndex < 1) {
                return;
            }
            this.swap(parentIndex, Id_Elment);
            this.bubble(parentIndex);
        }
    }

    public void swap(int parentIndex, int Id_Elment) {
        if (this.item[parentIndex].compareTo(this.item[Id_Elment]) < 0) {
            Employee tmp = this.item[parentIndex];
            this.item[parentIndex] = this.item[Id_Elment];
            this.item[Id_Elment] = tmp;
        }
    }

    public Employee serve() {
        if (this.item.length == 1) {
            return null;
        }
        Employee ValueReturn = this.item[1];
        this.item[1] = this.item[this.Count_Heap - 1];
        --this.Count_Heap;
        this.trickle(1);
        return ValueReturn;
    }

    public void trickle(int x) {
        int Temper = x;
        Employee temp = this.item[Temper];
        while (Temper * 2 + 1 < this.Count_Heap) {
            int child1 = 2 * Temper;
            int child2 = 2 * Temper + 1;
            int BigChild = this.GetTheMax(child1, child2);
            if (BigChild == -1) {
                return;
            }
            if (this.item[BigChild].compareTo(temp) <= 0) break;
            this.item[Temper] = this.item[BigChild];
            Temper = BigChild;
        }
        this.item[Temper] = temp;
    }

    public int GetTheMax(int x, int y) {
        if (x < this.Count_Heap && y < this.Count_Heap) {
            if (this.item[x].compareTo(this.item[y]) > 0) {
                return x;
            }
            if (this.item[y].compareTo(this.item[x]) > 0) {
                return y;
            }
        }
        if (x > this.Count_Heap && y > this.Count_Heap) {
            return -1;
        }
        if (y > this.Count_Heap) {
            return x;
        }
        return -1;
    }

    public Object[][] Travrse() {
        if (this.Count_Heap == 1) {
            return null;
        }
        Object[][] MyRows = new Object[this.Count_Heap - 1][6];
        int edit ;
        for (int i = 1; i < this.Count_Heap; ++i) {
	    edit = i-1 ;
            MyRows[edit][0] = this.item[i].num;
            MyRows[edit][1] = this.item[i].firstName;
            MyRows[edit][2] = this.item[i].lastName;
            MyRows[edit][3] = this.item[i].maritalStatus;
            MyRows[edit][4] = this.item[i].salary;
            MyRows[edit][5] = this.item[i].totalSalary;
        }
        return MyRows;
    }
}
