package basic.ch17;

public class Hero {
	String name;
	int hp;

	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	void attack() {
		System.out.println("공격합니다.");
	}

} // end of class
