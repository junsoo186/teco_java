package basic.ch16;

public class Run {

	int now = 10;
	
	
	public int step(int left, int right) {
		return now = now +left + right;
	}
	
	public int step(int left, int right, int left2) {
		return now = now + left + right + left2; 
	}
	
	public int step(int left, int right, int left2, int right2) {
		return now = now +left + right + left2 + right2; 
	}

	public int backStep(int bLeft, int  bRight) {
		return  now = now - bLeft - bRight;
	}
	
}
