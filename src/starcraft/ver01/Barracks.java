package starcraft.ver01;

public class Barracks {
	private int barracksNumber;
	private int count;
	
	
	public Barracks(int barrcksNumber) {
		this.barracksNumber = barrcksNumber;
		count = 0;
	}
	
	public int getCount() {
		return count;
	}
	
	public int getBarracksNumber() {
		return barracksNumber;
	}
	
	public Marine createMarine(String name) {
		count++;
		return new Marine(name);
	}
	
}
