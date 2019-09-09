class person{
    public static void main(String[] args) {
   people p1 = new people("ALaa",12,1);
   people p2 = new people("abood",13,2);
   people p3 = new people("momen",14,3);
   p1.printdata(p1);
   p2.printdata(p2);
   p3.printdata(p3);
   p1.printmaxage(p1, p2, p3);
    }
}


class people{
    String name;
    int age;
    int num;
    people(String Name,int Age,int Num){
        this.name=Name;
        this.age=Age;
        this.num=Num;
    }
    people(){
        
    }
    public void printdata(people z){
        System.out.println(z.name+" his age is:"+z.age+" his number is: "+z.num);
    }
    public void setage(int Age){
        this.age=Age;
    }
    public int getage(int Age){
        return Age;
        
    }
    public void printmaxage(people z,people w,people t){
        if(z.age>w.age&&z.age>t.age)
            System.out.println(z.age+":is the oldest his name is: "+z.name);
        else if(w.age>z.age&&w.age>t.age)
           System.out.println(w.age+":is the oldest his name is: "+w.name);
        else 
            System.out.println(t.age+":is the oldest his name is: "+t.name);
    }
}