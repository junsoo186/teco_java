package basic.ch02;

public class DiscountCalculatory {
	public static void main(String[] args) {
		
		// 상수 선언 - 원가,할인율
		
		//할인된 가격 계산 하기 (비지니스 로직)
		
		//최종된 가격을 정수형으로  형변환 
		
		//할인된 가격 = 원가 × (1 − 할인율)
		
		final double iPhone = 59.99;
		final double dIs =0.3;// 30% 할인
		
		 double eVent = iPhone*(1-dIs);
		 
		 
		 int eVent2= (int)eVent;
		 
		 System.out.println("최종가격:"+eVent2 );
		 System.out.println("최종가격(소수점):"+eVent );
		 
		
		
	}
}
