package basic.ch07;

public class MagicMainTest {

	public static void main(String[] args) {
		Magic magic1 = new Magic();
		magic1.magicName = "파이어볼";
		magic1.magicFormal = "화";
		magic1.magicPower = 10;
		magic1.magicUsedM = -30;
		magic1.magicInfo();

		Magic magic2 = new Magic();
		magic2.magicName = "쉴드";
		magic2.magicFormal = "성";
		magic2.magicPower = 0;
		magic2.magicUsedM = -30;
		magic2.magicInfo();

	} // end of main

} // end of class
