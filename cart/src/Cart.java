class carTest7 {
    public static void main(String[] args) {
   car c = new car ("new York A45 636", 123.435);
   
        System.out.println(c.getLicensePlate() + " is moving at "+ c.getSpeed()+ " Kilometers per houre.");
        
        for(int i=0; i<15; ++i) {
            c.accelerate(10.0);
            System.out.println(c.getLicensePlate() + " is moving at " + c.getSpeed() + " Kilometers per houer.");
            
        }}}