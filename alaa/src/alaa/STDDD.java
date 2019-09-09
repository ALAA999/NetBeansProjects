class STDDD{
    String fname;
    String lname;
    int stdnum;
    int avg;

STDDD(String a,String b,int c,int d){
fname = a;
lname = b;
stdnum = c;
avg = d;
}
/*public static void print(STDDD W){
    for(int i=0;i<6;++i){
    System.out.println(" studen number"+(i+1)+ "name is: "+W.fname);
    System.out.println(" studen number"+(i+1)+" name is: "+W.lname);
     System.out.println("studen numeber"+(i+1)+"name is: "+W.stdnum);
      System.out.println("studen number"+(i+1)+" avarage is: "+W.avg);}
}*/
public static void max(STDDD w){
  int maximam=w.avg;
    for(int i=0;i<3;++i){
       if(w.avg>w.avg&&w.avg>w.avg)
        maximam=w.avg; }
    System.out.println("The best avg is: "+maximam);
}
}

  
