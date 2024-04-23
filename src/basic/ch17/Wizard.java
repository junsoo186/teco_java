package basic.ch17;

public class Wizard extends Hero {

	public Wizard(String name, int hp) {
				super(name, hp);
			}
	@Override
	void attack() {
		System.out.println("마법사가 공격합니다");
	}
		
	public void freezing() {
		System.out.println(" 겨울에 얼음을 먹입니다. ");
	}

} // end of class