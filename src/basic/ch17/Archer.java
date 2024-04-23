package basic.ch17;

public class Archer extends Hero {

	public Archer(String name, int hp) {
		super(name, hp);
	}
	@Override
	void attack() {
		System.out.println("궁수가 공격합니다.");
	}
	
	void fireArrow() {
		System.out.println(name + " 샤프심을 던집니다. ");
	}

} // end of class
