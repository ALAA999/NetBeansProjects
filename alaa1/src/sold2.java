class sold2{
    String name;
    int speed;
    int year;
    sold2(String a,int b,int c){
        name=a;
        speed=b;
        year=c;
    }
    private String name(String a){
       return a; 
        
    }
    
    void  Speed(sold2 t){
        if(speed>t.speed)
            System.out.println(name+" is faster."+speed+"the year is: "+year);
        else 
            System.out.println(t.name+"is faster."+t.speed+"the year is "+t.year);
        
    }
    int Year(int c){
        return c;
        
    }
    void print(sold2 m){
        System.out.println(m.Year(year));
        System.out.println(m.name(name));
        
        
    }
    
}