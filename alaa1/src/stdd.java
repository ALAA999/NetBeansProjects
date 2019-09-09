class stdd{
   String name;
    int avg;
    int num;
    stdd (String n,int a,int t){
      name = n;
      avg = a;
      num = t; 
    }
stdd(String n,int a){
   
    avg=a;
    System.out.println(n);
}
    
    String nameostudent(String n){
       return n; 
    }
    void  avarage(stdd w,stdd c){
        
        if(avg>w.avg&&avg>c.avg)
            System.out.println(name+avg+"is the largwat");
        else
            if(w.avg>c.avg&&w.avg>avg)
            System.out.println(w.name+w.avg+"is the largwat");  
        else 
                System.out.println(c.name+c.avg+"is the largwat");
            
        }
    int numberos(int t){
        return t;
    }
    }
