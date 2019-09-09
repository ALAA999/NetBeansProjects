class car{
    
   String licensePlate;
   double Speed;
   double MaxSpeed;
   car(String licensePlate , double maxSpeed){
       
       this.licensePlate = licensePlate;
       this.Speed = 0.0;
       if (MaxSpeed > 0) this.MaxSpeed = MaxSpeed;
       else this.MaxSpeed=0.0;
       
       String getLicensePlate() {
       return this.licensePlate;
   }
       
       double getMaxSpeed() {
       return this.MaxSpeed; 
       
       double getSpeed () {
           return this.getSpeed;
       }
       
       void floorIt() {
           this.Speed = this.MaxSpeed; }
       
       void accelerate(double deltaV){
           this.Speed = this.Speed + deltaV;
           if(this.Speed > this.MaxSpeed){
           this.Speed = this.MaxSpeed;
       }
           if(this.Speed < 0.0){
               this.Speed = 0.0;
               
       }
       }
   }
   