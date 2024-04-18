package basic.ch11;

public class PersonTest {

	public static void main(String[] args) {

		// 주석 - .....
		Person person1 = new Person("홍길동", 100);
		Person personBox = person1;
		Person person2 = person1.getPerson();
		Person personLee = new Person("이순신", 101);
		System.out.println("------------------------");
		// 위 코드 까지는 HEAP 메모리 영역애 객체가 2개 생성된 상태 이다.
		// 지역 변수인 person1, personBox,person2 는 같은 객체를 가리킨다.
		
		person1.setName("티모");
		person1.showInfo();
		// 연습 문제 -
		//setName  메서드를 만들어 주세요
	} // end of main

} // end of class
