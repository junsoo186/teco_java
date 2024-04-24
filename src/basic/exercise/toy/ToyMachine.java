package basic.exercise.toy;

import java.util.Random;

// 클래스 - 인형뽑기
// 상품들이 존재 가능
// 사자인형, 곰인형, 에어팟
// 요구 조건
// 배열을 활용해서 객체들을 담아 주세요
public class ToyMachine {

	private String name;
	private int coin;
	Product product;
	

	public ToyMachine(String name, int coin) {
		this.name = name;
		this.coin = coin;
	}

	public static void insertCoin() {
		System.out.println("동전을 넣었습니다.");
		
	}
	
	
	
	public void  success() {
		System.out.println( product.getName() +"뽑았습니다");
	}
	
	public void fail() {
		System.out.println("놓쳤습니다");
	}
	
	public static int gotCha() {
		Random r = new Random();
		int result = r.nextInt(2);
		return result;
	}
	
}
