package basic.ch22;

public class Televsion extends HomeAppliances implements RemoteController{

	@Override
	public void turnOn() {
		System.out.println("TV켰어~");
	}

	@Override
	public void turnOff() {
		System.out.println("널 너무나 사랑해서~ 난 TV를 껏어");
	}

	
}
