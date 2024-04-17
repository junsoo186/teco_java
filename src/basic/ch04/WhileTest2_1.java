package basic.ch04;


public class WhileTest2_1 {

	// 코드의 시작점
	
	public static void main(String[] args) {
		
		int start = 1;
		int end = 10 ;
		int sum = 0;
		boolean flag = true;
		
		while(flag){
			if( start == end) {
			flag = false;
			}
			sum = sum +start;
			System.out.println("sum("+start +")" +sum);
			start++; 
		
	}// end of  while
		
	} // end of main
	

} // end of class
