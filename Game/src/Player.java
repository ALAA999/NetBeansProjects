
public class Player {
	private int speed;
	private String name;
	private PlayingStrategy strategy;
	public Player(int speed, String name, PlayingStrategy strategy) {
		super();
		this.speed = speed;
		this.name = name;
		this.strategy = strategy;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PlayingStrategy getStrategy() {
		return strategy;
	}
	public void setStrategy(PlayingStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void play(){
		strategy.Paly();
		
	}
	
	

}
