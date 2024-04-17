package basic.ch09;

public class Warrior {
	
		String wName;
		String wGender;
		int wLevel;
		int wHp;
		int wDamge;
		int wDefense;
		
		public Warrior(String name){
			wName = name;
			
		}
		public void beAttacked(int adamge) {
			if(wHp <= 0) {
			System.out.println("이미 죽었습니다.");
			return;
			}
			wHp = wHp - adamge;
		}
		public void attackWarrior(Archer archer) {
		
		}
		
		public void showInfo() {
			System.out.println("캐릭터 이름 : " + wName);
			System.out.println("레벨 : " + wLevel);
			System.out.println("체력 : "+ wHp);
			System.out.println("공격력 : "+ wDamge);
			System.out.println("방어력 : "+ wDefense);
			
		}
		

}
