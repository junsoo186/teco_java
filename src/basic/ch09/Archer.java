package basic.ch09;

public class Archer {
	String aName;
	String aGender;
	int aLevel;
	int aHp;
	int aDamge;
	int aDefense;
	
	public Archer(String name){
		aName = name;
		
	}
	public void beAttacked(int wdamge) {
		if(aHp <= 0) {
		System.out.println("이미 죽었습니다.");
		return;
		}
		aHp = aHp - wdamge;
	}
	public void attackWarrior(Warrior warrior) {
	 warrior.beAttacked(this.aDamge);
	}
	

	
	public void showInfo() {
		System.out.println("캐릭터 이름 : " + aName);
		System.out.println("레벨 : " + aLevel);
		System.out.println("체력 : "+ aHp);
		System.out.println("공격력 : "+ aDamge);
		System.out.println("방어력 : "+ aDefense);
		
	}
	
	
	
	
} // end of class
