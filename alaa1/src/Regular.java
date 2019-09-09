import java.util.*;
class R{
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
   String [] y  = "A#dsfgs#saf#".split("#");
       String s1="Welcome";
   String s2 = "  Welcome To java";
   String s3 = "a+b$#c".replaceAll("[$+#]","NNN");
   String s4 = "Welcome";
   int o = 4;
  char u= 'e';
  String t = input.next();
if(t.matches("[a-z]{4}\\d{4}"))
       System.out.println(t);
       else 
       System.out.println("The pass is wrong");
      System.out.println(s1.charAt(3));
        System.out.println(s1.indexOf('m'));
        System.out.println(s1.indexOf('m', 5));
        System.out.println(s1.indexOf('m', 6));
        System.out.println(s2.substring(4,9)); 
        System.out.println(s2.trim()); 
        System.out.println(s2.replace('o','E'));
        System.out.println(s2.replaceFirst("o","s"));
        System.out.println(s2.replaceAll("a","j"));
        System.out.println("Java".equalsIgnoreCase("java"));
        System.out.println("Java".matches("Java"));
        System.out.println(Character.isLetter(u));
        System.out.println(Character.isUpperCase(u));
        System.out.println(Character.isLowerCase(u));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.compareTo(s4));
        System.out.println(s1.concat(s2));
       
        System.out.println(s1.startsWith("Wel"));
        System.out.println(s2.endsWith("java"));
        for(int i=0;i<4;++i){
            System.out.println(y[i]);
}  


   }
}