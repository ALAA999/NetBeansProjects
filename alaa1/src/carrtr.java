class carrtr{
    String name;
    String color;
    int speed;
    
    carrtr(String a,String b,int p){
        name = a;
        color = b;
        speed = p;
    }
    void Name(carrtr W,carrtr R,carrtr I){
        System.out.println("The name of the first car is: "+W.name);
        System.out.println("The name of the secound car is: "+R.name);
        System.out.println("The name of the third car is: "+I.name);
    }
    void Color(carrtr k,carrtr q,carrtr X){
        System.out.println("The color of the first car is: "+k.color);
        System.out.println("The color of the secound car is: "+q.color);
        System.out.println("The color of the third car is: "+X.color);
    }
    int Speed(carrtr E,carrtr U){
        if(speed>E.speed&&speed>U.speed)
            return speed;
        else
            if(E.speed>speed&&E.speed>U.speed)
                return E.speed;
        else
                return U.speed;
    }
}