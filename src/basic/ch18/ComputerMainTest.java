package basic.ch18;

public class ComputerMainTest {

	public static void main(String[] args) {

		Computer com1 = new Computer("맥", "애플", 1);
		com1.getCpus().setName("인텔");
		com1.getCpus().setVer(1); 
		
		com1.showInfo();
		
	} // end of main

} // end of class
