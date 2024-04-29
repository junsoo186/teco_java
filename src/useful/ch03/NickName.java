package useful.ch03;

public class NickName {
	
	private String nickName;
	


	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		if(nickName == null) {
			throw new NickNameException ("닉네임은 null 값일 수 없습니다");
		}
		
		if( nickName.length() < 5) {
			throw new NickNameException("닉네임은 5자 이상이어야 합니다.");
		}
		
		if(nickName.matches("[a-zA-Z]+")) {
			throw new NickNameException(" 닉네임은 숫자나 특수문자를 포함해야 합니다.");
		}
		
		
		
	}
	
	
	

}
