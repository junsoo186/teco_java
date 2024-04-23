package basic.ch17;


 public class Warrior extends Hero {

	public Warrior(String name, int hp) {
		super(name, hp);
	}
	 @Override
	void attack() {
		super.attack();
	}
		
	void comboAttack() {
		System.out.println(" 두번 뺨을 때립니다.");
	}
	
} // end of  class