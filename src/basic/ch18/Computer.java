package basic.ch18;

public class Computer {

	String name;
	String manuFacturer;
	int ver;
	Cpu cpu;

	public Computer(String name, String manuFacturer, int ver) {
		cpu = new Cpu();
		this.name = name;
		this.manuFacturer = manuFacturer;
		this.ver = ver;
	}
	void showInfo() {
		System.out.println(name);
		System.out.println(manuFacturer);
		System.out.println(ver);
		System.out.println(cpu.name);
		
		
	}
}
