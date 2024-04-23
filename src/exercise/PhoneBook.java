package exercise;

import java.util.Scanner;

public class PhoneBook {
	static int LAST_INDEX_NUMBER = 0;

	

	// 속성
	// 기능
	private String name;
	private String phoneNumber;

	public PhoneBook(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;

	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("연락처 : " + phoneNumber);
	}

	public static void savePhone(Scanner sc, PhoneBook[] phonebooks) {
		System.out.println("삐빅 - 저장하기~!@@");
		System.out.println("이름을 입력해주세요");
		String userName = sc.nextLine();
		System.out.println("번호를 입력해주세요");
		String userPhoneNumber = sc.nextLine();
		PhoneBook PhoneBook = new PhoneBook(userName, userPhoneNumber);
		if (LAST_INDEX_NUMBER >= 100) {
			System.out.println("%$@ 남은 저장 공간이 없어요!");
			return;

		}
		for (int i = 0; i < phonebooks.length; i++) {
			if (phonebooks[i] == null) {
				phonebooks[i] = PhoneBook;
				LAST_INDEX_NUMBER++;
				break;
			}
		}
		System.out.println("연락처가 저장되었습니다!");
	}

	public static void readAll(PhoneBook[] phonebooks) {
		System.out.println("!@~ 조회를 시작합니다.");
		for (int i = 0; i < phonebooks.length; i++) {
			if (phonebooks[i] != null) {
				System.out.println("이름 : " + phonebooks[i].name + "번호 : " + phonebooks[i].phoneNumber);
			}
		}

	} // end of readAll

	public static void uLoad(Scanner sc, PhoneBook[] phonebooks) {
		System.out.println("삐빅~! 번호를 수정합니다.");
		System.out.println(" 수정할 번호를 선택하세욧!.");
		String loadname = sc.nextLine();
		boolean isFine = false;
		for (int i = 0; i < phonebooks.length; i++) {
			if (phonebooks[i] != null) {
				if (phonebooks[i].getName().equals(loadname)) {
					System.out.println("이름 : " + phonebooks[i].name + "번호 : " + phonebooks[i].phoneNumber);
					isFine = true;
					
					System.out.println("수정하실 이름을 입력하세욧!");
					String chName = sc.nextLine();
					phonebooks[i].setName(chName);
					System.out.println("수정하실 번호를 입력하세욧!");
					String chNum = sc.nextLine();
					phonebooks[i].setPhoneNumber(chNum);
					break;
				}
			}
		}
		
		if(isFine == false) {
			System.out.println("ㅌㅌㅌ 없음");
			}
	}

	public static void selectSer(Scanner sc, PhoneBook[] phonebooks) {
		System.out.println("삐빅~!선택하여 찾습니다.");
		System.out.println(" 찾으실분 성함을 입력해 주세욧!.");
		String selectname = sc.nextLine();
		boolean isVine = false;
		for (int i = 0; i < phonebooks.length; i++) {
			// phonebooks[i] --> new Phone();
			// phonebooks[i].getName().equ
			if (phonebooks[i] != null) {
				if (phonebooks[i].getName().equals(selectname)) {
					System.out.println("이름 : " + phonebooks[i].name + "번호 : " + phonebooks[i].phoneNumber);
					isVine = true;
					break;
				}
			}
		}
		if(isVine == false) {
			System.out.println("ㅌㅌㅌ 없음");
			}

	}
	
	public static void deletER(Scanner sc,  PhoneBook[] phoneBooks) {
		System.out.println("삐리릭~! 삭제를 선택하셨습니다.");
		for(int i = 0;  i < phoneBooks.length; i++) {
			phoneBooks[i] = null;
		}
	}
	

} // end of class
