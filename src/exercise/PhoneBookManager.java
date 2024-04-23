package exercise;

import java.util.Scanner;

public class PhoneBookManager {

	public static void main(String[] args) {

		// 스캐너 사용
		// 배열 선언 100개
		// while()
		Scanner sc = new Scanner(System.in);
		PhoneBook[] phoneBook = new PhoneBook[100];

		phoneBook[0] = new PhoneBook("호랑이", "010-6666-6666");
		phoneBook[1] = new PhoneBook("김사자", "010-7777-4444");
		phoneBook[2] = new PhoneBook("고끼리", "010-7777-4554");

		final String SAVE = "1";
		final String SEARCH = "2";
		final String ULOAD = "3";
		final String DELETE = "4";
		final String SECET_SEARCH = "5";
		final String END = "0";

		boolean flag = true;

		while (flag) {
			System.out.println(" ** 전화 메뉴 ** ");
			System.out.println("1. 저장 2. 전체 조회 3. 수정 4. 삭제 5. 선택 조회 0.  종료 ");
			String userSelect = sc.nextLine();
			if (userSelect.equals(SAVE)) {
				PhoneBook.savePhone(sc, phoneBook);
			} else if (userSelect.equals(SEARCH)) {
				PhoneBook.readAll(phoneBook);
			} else if (userSelect.equals(ULOAD)) {
				PhoneBook.uLoad(sc, phoneBook);
			} else if (userSelect.equals(DELETE)) {
				PhoneBook.deletER(sc, phoneBook);
			} else if (userSelect.equals(SECET_SEARCH)) {
				PhoneBook.selectSer(sc, phoneBook);
			} else if (userSelect.equals(END)) {
				flag = false;
			} else {
				System.out.println("없는 선택입니다. 다시 입력해 주세요.");
			}

		} // end of while

	} // end of main
// 함수

} // end of class
