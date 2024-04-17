package exercise;

public class Exercise1 {
	//코드의 시작점(main 함수)
	public static void main(String[] args) {
		
	int ten=10;  //변수에 선언과 동시에 초기화(값을 넣다)
	int hund=100;
	int hund2=100;
	
	
	System.out.println(ten);
	System.out.println(hund);
	System.out.println(hund2);
	
	
	int ageBox;
	ageBox = 20;	
	System.out.println(ageBox);
	
	
	
	
	
	
	int oldBox = ageBox;
	ageBox = 30;
	System.out.println("ageBox");
	//3. int a =1 ; int b 3;
	// 선언하고 a 와  b 에 담겨 있는 값을 서로 스위칭
	int a =1;
	int b =3;
	// 값이 사라지지 않게 하기 위해서는 메모리 상자를 하나 더 만들어서
	//넣어두면된다
	int temp = a;
	a = b;
	b = temp ; 
	
 
	System.out.println(a);
	System.out.println(b);
	
	
	
	


	
	}// end of main
	
}// end of class
