class CLASSQUIZ{
    String fname;
    String lname;
    int stdnum;
    int avg;

CLASSQUIZ(String a,String b,int c,int d){
fname = a;
lname = b;
stdnum = c;
avg = d;
}
public static void print(CLASSQUIZ z,CLASSQUIZ Y,CLASSQUIZ T){
    System.out.println("The first studen name is: "+z.fname);
    System.out.println("The first studen last name is: "+z.lname);
     System.out.println("The first studen numeber is: "+z.stdnum);
      System.out.println("The first studen avarage is: "+z.avg);
       System.out.println("The secound studen name is: "+Y.fname);
    System.out.println("The secound studen last name is: "+Y.lname);
     System.out.println("The secound studen numeber is: "+Y.stdnum);
      System.out.println("The secound studen avarage is: "+Y.avg);
       System.out.println("The third studen name is: "+T.fname);
    System.out.println("The third studen last name is: "+T.lname);
     System.out.println("The third studen numeber is: "+T.stdnum);
      System.out.println("The third studen avarage is: "+T.avg);
}
public static void max(CLASSQUIZ z,CLASSQUIZ Y,CLASSQUIZ T){{
    if(z.avg>Y.avg&&z.avg>T.avg)
        System.out.println("The max is: "+z.avg+(" his name is: "+z.fname+" his number is: "+z.stdnum));
    else  
    if(Y.avg>z.avg&&Y.avg>T.avg)
        System.out.println("The max is: "+Y.avg+(" his name is: "+Y.fname+" his number is: "+Y.stdnum));
    else 
        System.out.println("The max is: "+T.avg+(" his name is: "+T.fname+" his number is: "+T.stdnum));
}
}
}