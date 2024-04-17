package basic.ch10;

public class Hero {

	private String name;
	private int hp;
	private int power;
	private double defense;
	private boolean isDie;

	// getter, setter 메서드를 만들어 주세요

	public String getName() {
		return this.name;
	}

	public void setName(String inPutName) {
		this.name = inPutName;
	}

	public int getHp() {
		return this.hp;
	}

	public void setHp(int inPutHp) {
		if(this.hp >=0 ) {
			
			System.out.println("miss");
			
		}
		this.hp = inPutHp;
	}

	public int getPower() {
		return this.power;
	}

	public void setPower(int inPutPower) {
		this.power = inPutPower;
	}

	public double getDefense() {
		return this.defense;
	}

	public void setDefense(double inputDefense) {
		this.defense = inputDefense;
	}

	public boolean getIsDie() {
		return this.isDie;
	}

	public void setIsDie(boolean inPutIsDie) {
		this.isDie = inPutIsDie;
	}

}
