class tank{
    String name;
    int rang;
    int wheight;
    tank(String a,int b,int c){
        name = a;
        rang = b;
        wheight = c;
    }
    void Name(tank j,tank w,tank d){
        System.out.println("The name of first Tank is: "+j.name);
        System.out.println("The name of secound Tank is: "+w.name);
        System.out.println("The name of third Tank is: "+d.name);
    }
    void Rang(tank e,tank q,tank v){
        if(e.rang > q.rang&&e.rang>v.rang)
            System.out.println("The strongest tank is: "+e.name+" and its rang is: "+e.rang+" and the wheight is: "+e.wheight);
            else
            if(q.rang > e.rang&&q.rang>v.rang)
            System.out.println("The strongest tank is: "+q.name+" and its rang is: "+q.rang+" and the wheight is: "+q.wheight);
            else
            System.out.println("The strongest tank is: "+v.name+" and its rang is: "+v.rang+" and the wheight is: "+v.wheight); 
    }
    
}