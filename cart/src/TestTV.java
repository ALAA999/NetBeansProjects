public class TestTV{
    public static void main(String[] args) {
   Tv tv1 = new Tv();
   tv1.turnOn();
   tv1.setChannel(30);
   tv1.setVolume(3);
   
   Tv tv2=new Tv();
   tv2.turnOn();
   tv2.channelUp();
   tv2.channelUp();
   tv2.volumeUp();
   
        System.out.println("tv1s channel is "+tv1.channel+" and volume level is "+ tv1.volumeLevel);
        System.out.println("tv2s channel is "+tv2.channel+" and volume level is "+tv2.volumeLevel);
}
}