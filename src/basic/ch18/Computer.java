package basic.ch18;

public class Computer {

	private String name;
	private String manuFacturer;
	private int ver;
	private Cpu cpu;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManuFacturer() {
		return manuFacturer;
	}
	public void setManuFacturer(String manuFacturer) {
		this.manuFacturer = manuFacturer;
	}
	public int getVer() {
		return ver;
	}
	public void setVer(int ver) {
		this.ver = ver;
	}
	public Cpu getCpus() {
		return cpu;
	}
	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}
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
		
		
		
	}
}
