package basic.ch02;

public class TraingleAreaCalculator {
	public static void main(String[] args) {
		
		//삼각형에 밑변 BASE , 단 상수로 선언
		final int BASE = 15;
		//삼각형에 높이 HIHGT, 단 상수로 선언
		final int HIGHT = 6;
		// 결과 값을 area 변수에 저장
		double area = (BASE*HIGHT)/2;
		//결과 출력 하기
		System.out.println("삼각형의 면적:"+area);
		
		//String result = " 삼각형의 면적: " = area;
		
	}// end of main
}// end of class
