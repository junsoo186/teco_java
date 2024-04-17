package basic.ch01;
/**
 * 문자 데이터 타입
 * char 자료형의 크기는 2byte 입니다.
 */
public class DataType2 {
	
	
	public static void main(String[] args) {
		
		//기본 자료형 중 -문자 타입 (사실은 정수형)
		//문자를 저장하기 위한 변수를 선언할 때 사용.
		//char 타입은 단, 하나의 문자만을 저장할 수 있다.
		
		char charBox;
		charBox = 'B'; // char 는 홑 따옴표를 사용한다.
		System.out.println(charBox);
 		
		// charBox ='가나';// 대입불가
		// 참고! 두개 이상에 문자가 연속된 형태를 (string) 문자열 --> "안녕 반가워"
		System.out.println("---------------------------------");
		System.out.println( (int)charBox );
		
		char aBox;
		aBox = 'a';
		
		char bBox;
		bBox ='b';
		
		char cBox;
		cBox = 'c';
		System.out.println( (int)aBox );
		System.out.println( (int)bBox );
		System.out.println( (int)cBox );
		System.out.println("A=" +(int)aBox );
	
	}//end of main
	
}// end  of class
