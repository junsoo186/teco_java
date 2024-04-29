package useful.ch03;

import java.util.Scanner;

public class NickNameTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		NickName nickName = new NickName();
		
		
		
		String inputNickName = sc.nextLine();
		
		
		try {
			nickName.setNickName(inputNickName);
			System.out.println(inputNickName +" 생성 완료 되었습니다.");
		}catch (NickNameException e) {
			System.out.println("닉네임 생성 규칙을 지켜주세요");
		}
		
		nickName.setNickName(inputNickName);
	
	}

}
