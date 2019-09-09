import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class currenttime {
    public static void main(String[] args) {
 /*  long s = System.currentTimeMillis();
        System.out.println(s);
        for(int i=0;i<1000000000;++i){
            int g=0;
        }
        System.out.println(System.currentTimeMillis());*/
       /* Scanner i = new Scanner(System.in);
        System.out.println("Enter email: ");
        String s = i.nextLine();*/
      /*  boolean v = Pattern.matches("[\\w%2]+","alaa%3");
        System.out.println(v);*/
        /*boolean v = Pattern.matches("[a-zA-Z0-9]{1,8}",s);
        System.out.println(v);
        if(Pattern.matches("[a-zA-Z0-9]{4,8}",s))
            System.out.println("Your password is good! ");
        else if(Pattern.matches("[a-zA-Z0-9]{0,4}",s))
            System.out.println("Your password is weak! ");
        else 
            if(Pattern.matches("[a-zA-Z0-9]{8,}",s))
            System.out.println("Your password is long!");*/ /*لو قلت [hotmail] كانك بتقله احد احرف هذي الكلمة*/
      /*  boolean v = Pattern.matches("([a-zA-Z0-9]{1,9})([@])(hotmail.com).{1,25}",s);*/ /*مش شغالة ليش .{1,25}*/
       /*  System.out.println(v);*/
        /*boolean v = Pattern.matches("[hotmail]",s);
        System.out.println(v);*/
       /* boolean v = Pattern.matches("^(.+)@(.+)$", "alaa@yahoo.com");   */ /*   ^لازم يبدا  
        $لازم ينتهيب
        + تعني اقبل اكثر من حرف او شئ
        */
       /* System.out.println(v);*/
       boolean v1 = Pattern.matches("(\\d{3})\\.(\\d{3})\\.(\\d{1})\\.(\\d{1})","192.168.0.1");
        System.out.println(v1); 
       /* String s = "my name 21 is  5 my alaa my";
        String s2 = "my";   /*جربand \\s and \\d+   \\w+   */
     /*   Pattern p = Pattern.compile(s2);
        Matcher m = p.matcher(s); /*تتحقق هل s2 موجود في s*/
     /*  System.out.println(m);*/
      /*  if(m.find()){
            System.out.println("founded");}*/
      /* int i=0;
        while (m.find()) {        /*لما تجد اللي انا ابحث عنه*/       
          /*  System.out.println(m.start()+"     "+m.end());
            System.out.println(m.group());
            ++i;
        }
        System.out.println(i);*/
        
}
    
}
