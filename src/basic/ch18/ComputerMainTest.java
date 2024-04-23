package basic.ch18;

public class ComputerMainTest {

	public static void main(String[] args) {

		Computer com1 = new Computer("맥", "애플", 1);
		com1.cpu.name = "intel";
		com1.cpu.ver = 1 ;
		
		com1.showInfo();
		
	} // end of main

} // end of class
