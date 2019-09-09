 class Busrevision {
     static int avalableseats = 5;
    public synchronized static void run(){
        pasengers p = (pasengers)Thread.currentThread();
        System.out.println("Welcome "+Thread.currentThread().getName()+"  seats avalable are "+avalableseats);
        if(avalableseats >= p.getseatsneeded()){
            System.out.println(Thread.currentThread().getName()+" you have booked "+p.getseatsneeded());
            avalableseats = avalableseats-p.getseatsneeded();
        }else
            System.out.println("Sorry,"+Thread.currentThread().getName()+" We have only "+avalableseats+" seats avalable!");
    }
}

class MAin10{
    public static void main(String[] args) {
        pasengers c1 = new pasengers("Alaa",2);
        pasengers c2 = new pasengers("Momen",4);
        c1.setName("Alaa");
        c2.setName("Momen");
        c1.start();
        c2.start();
    }
}
class pasengers extends Thread{
    int seatneeded;
    pasengers(String name,int seatsneeded){
        this.seatneeded = seatsneeded;
    }
    public int getseatsneeded(){
        return seatneeded;
    }
    public void run(){
        Busrevision.run();
    }
}
