package basic.ch02;

public class RectangleAreaCalculator {
	
	public static void main(String[] args) {
	
		final int RECTH = 10;
		final int RECTW = 10;
		
		int area= RECTH*RECTW; 
		
		
		System.out.println("사각형의 면적"+ area);
		//문자열은 특별한 녀석이다. 연산을 사용할수있습니다.
		// 문자열 + 정수,  문자열 + 실수 .... 
		// 위 연산에 결과 값은 ---> 문자열 리턴 된다. 
		
	}

}
