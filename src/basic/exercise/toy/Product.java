package basic.exercise.toy;

public class Product {
	
	private String name;
	private int value;
	private String oneGame;
	
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public void showInfo() {
		System.out.println("당첨 상품 : " + name);
		System.out.println("가치 :" + value);
	}
	
	
	
}
