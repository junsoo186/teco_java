package basic.exercise.test02;

public class MainTest01  {

	public static void main(String[] args) {

		
		// 문제 1
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		
	
		
		// 내부에서 객체를 생성하지 않고 외부에서
		// 객체을 주입한후에 D 에 getName() 호출하시오
		System.out.println(a.b.c.d.getName()); 
		
		
		
	}  // end of main 


	
} // end of class
