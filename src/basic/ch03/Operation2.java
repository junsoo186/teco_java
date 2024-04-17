package basic.ch03;

public class Operation2 {

	public static void main(String[] args) {
		
		
		int result1 = 5 + 3;
		int result2 = 5 - 3;
		int result3 = 5 * 3;
		//double result4 = 5/ 3;
		double result4 = 5.0 / 3;
		//고민해 볼 사항
		int result5 = 5 % 3;
		
		System.out.println("result1 "  +  result1);
		System.out.println("result2 "  +  result2);
		System.out.println("result3 "  +  result3);
		System.out.println("result4 "  +  result4);
		System.out.println("result5 "  +  result5);
	
		
		//문제
		//1. (12+3)/3 값을 화면에 출력해 보세요
		//변수명, 데이터 유형 스스로 결정하고 식을 만들어 보세요
		
		//2. ( 25%2) 값을 화면에 출력해 보세요
		//어떤 수를 2로 나누었을 때 나머지가 0이면 짝수 1이면 홀수
		
		//3. 15 를 4로 나눈 후, 그 결과의 절대값을 출력 하세요.
		
		
		
		int pLus=(12+3)/3;
		System.out.println("(12+3)/3="+pLus);
		
		int pEr=25%2;
				
			System.out.println(pEr);
			
			boolean aNs;
			
			
			
			
		//-------------------------------
			
			
			int fIf=(15/4);
			
			System.out.println(Math.abs(fIf) );
		
		
		
		
		
	}//end of main

}// end of class
