class plane{
    double speed;
    int numof;
    String r;
    double poweroe;
    double numop;
    String nameofplane;
    
    plane (String nameoplane, int numof, double poweroe, double numop, double speed){
      this.nameofplane = nameoplane;
      this.numof = numof;
      this.poweroe = poweroe;
      this.numop = numop;
      this.speed = speed;
      
    }
      String Speed(){
     if(this.speed > 400)
      r ="accepted";
     else
      r="not accepted";
     return r;
    }
    int getnumberofflight(){
        return this.numof;
    }
    double numofpassengers(){
        return this.numop;
    }
    void powerofengien(){
        if(this.poweroe < 1000)
            System.out.println("The enigen is weak!");
        else
            System.out.println("The engien is good!");
    }
    String nameofflight(){
        return this.nameofplane;
    }
}