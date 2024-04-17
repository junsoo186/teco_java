package basic.ch07;

public class Magic {
	
	String magicName;
	String magicFormal;
	int magicPower;
	int magicUsedM;
	
	public void magicAtack() {
		System.out.println(magicName+"로 공격합니다.");
	}
	public void magicUser() {
		System.out.println(magicName+"로"+magicPower+"데미지 성공");
	}
	
	public void magicInfo() {
		System.out.println("-----------마법 정보---------------");
		System.out.println("마법이름:"+ magicName);
		System.out.println("마법속성:"+ magicFormal);
		System.out.println("마법데미지:"+ magicPower);
		System.out.println("마법소모MP:"+ magicUsedM);
		
	}
	
	
} // end of  magic class 
