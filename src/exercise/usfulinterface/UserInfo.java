package exercise.usfulinterface;

public class UserInfo {
	
	public static int SERIAL_NUM = 0;
	private int id; 
	private String userName;
	private String pw;
	
	public UserInfo(String userName, String pw ) {
		this.userName = userName;
		this.pw = pw;
	}
	
	public int getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	
	public String getUserName() {
		return userName; 
	}
	
	
	public String toString() {
		return id + " , " + userName + "," + pw;
	}
	
}
