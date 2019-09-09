
class Table {

   synchronized void printtable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyYhread1 extends Thread{
    Table t;
    MyYhread1(Table t){
        this.t = t;
    }
    public void run(){
        t.printtable(5);
    }
}
class MyYhread2 extends Thread{
    Table t;
    MyYhread2(Table t){
        this.t = t;
    }
    public void run(){
        t.printtable(100);
    }
}

class MAI{
    public static void main(String[] args) {
        Table obj = new Table();
        MyYhread1 t1 = new MyYhread1(obj);
        MyYhread2 t2 = new MyYhread2(obj);
        t1.start();
        t2.start();
    }
}