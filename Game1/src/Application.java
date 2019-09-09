
public class Application {

public static void main(String args[]){
	GameManager game= new GameManager();
	Player p= new Player(19,"Ali",null);
	game.setPlayer(p);

	game.run();
	
	
}
}
