public class GameManager {
	Player player;

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public void run(){
		
		if(player.getSpeed()<20)
			player.setStrategy(new SuperRunningPlaying());
			else
				player.setStrategy(new NormalPlaying());
				
		player.play();
                //player.getStrategy().Paly();
	}

	
	
	

}