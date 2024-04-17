package exercise;

public class OrderMainTest {

	public static void main(String[] args) {

		Order orderBox1 = new Order();
		Order orderBox2 = new Order();

		orderBox1.food = "갈비찜";
		orderBox1.name = "홍길동";
		orderBox1.adress = "서면";
		orderBox1.spicyLevel = 3;

		orderBox2.food = "엽떡";
		orderBox2.name = "전우치";
		orderBox2.adress = "조선";
		orderBox2.spicyLevel = 8;

		System.out.println(orderBox1.food);
		System.out.println(orderBox1.name);
		System.out.println(orderBox1.adress);
		System.out.println(orderBox1.spicyLevel);
		
		System.out.println("--------------------------");
		
		System.out.println(orderBox2.food);
		System.out.println(orderBox2.name);
		System.out.println(orderBox2.adress);
		System.out.println(orderBox2.spicyLevel);

	} // end of main
} // end of class
