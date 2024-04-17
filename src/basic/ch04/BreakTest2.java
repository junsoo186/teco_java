package basic.ch04;

public class BreakTest2 {

	// 코드의 시작점
	public static void main(String[] args) {

		// for 문 대신에 --> while 변경해서 결과를 출력하시오
		
		int i = 1;
		while (i<11) {
			//단독 if 구문은 - 수행이 될 수도 있고 안될 수도 있다 
			if ((i % 7) == 0) {
			break;
			} // end of if
			System.out.println("i 의 값"+ i);
			++i;
		} // end of while

	} // end of main

} // end of class
