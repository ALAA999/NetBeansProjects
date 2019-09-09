public class Application {

public static void main(String args[]){
	GameManager game= new GameManager();
	Player p= new Player(21,"Ali",null);
	game.setPlayer(p);

	game.run();
        
        PlayingStrategy k=new SuperRunningPlaying();
        k.Paly();
          PlayingStrategy k1=new NormalPlaying();
        k1.Paly();
        
	
	
}
}