package basic.ch20;

public class AnimalTest {
	public static void main(String[] args) {
		// 업캐스팅의 상황
		Animal animal = new Animal();
		animal.move();
		animal.eating();
		System.out.println("-----------------");

		Animal 주소2 = new Tiger();
		주소2.move();
		주소2.eating();
		System.out.println("-----------------");

		Animal 주소3 = new Human();
		주소3.move();
		주소3.eating();
		((Human)주소3).readBook();
		System.out.println("------------------");
	} // end of main
}
