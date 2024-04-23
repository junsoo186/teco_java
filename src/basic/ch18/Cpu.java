package basic.ch18;

public class Cpu {
	
	private String name;
	private String manuFacturer;
	int ver;

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

	void start(){
		System.out.println("Cpu 가 돌아감~~");
	}
		
}
