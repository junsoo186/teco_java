package basic.exercise.toy;

import java.util.Random;
import java.util.Scanner;

public class ToyMachineTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 상품
		Radio radio = new Radio();
		Zippo zippo = new Zippo();
		LionDoll lionDoll = new LionDoll();
		Product[] products = new Product[3];
		products[0] = radio;
		products[1] = zippo;
		products[2] = lionDoll;

		boolean flag = true;

		System.out.println("===================================");
		System.out.println("===   ★★★★★★★★★★★★★★★★★★★★★★★   ===");
		System.out.println("===   ★  앗싸~! 인 형 뽑 기 ★   ===");
		System.out.println("===   ★★★★★★★★★★★★★★★★★★★★★★★   ===");
		System.out.println("===================================");
		System.out.println("   한 게임에 500원    ");

		int money = sc.nextInt();

		while (flag) {
			if (money >= 500) {

				ToyMachine.insertCoin();

				int a = ToyMachine.gotCha();
				System.out.println(" 뽑으실 상품을 선택해 주세요");
				System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★");
				System.out.println("1.사자인형 2. 지포라이터 3.라디오 ");
				int selected1 = sc.nextInt();
				if (selected1 == 1) {
					System.out.println("사자인형 뽑기 도전!");
					System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★");
					System.out.println("뽑기를 시작하시겠습니까?");
					System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★");
					System.out.println("1번 시작 // 다른번호 입력시 종료");
					int selected2 = sc.nextInt();
					if (selected2 == 1) {
						money = money - 500;
						System.out.println("남은 금액 :" + money + "원");
						switch (a) {
						case 1:
							System.out.println("축하합니다~~@@");
							products[2].showInfo();
							break;

						default:
							System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
							System.out.println("◈◈◈◈◈◈ 꽝 ◈◈◈◈◈◈ ");
							System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
						}

					} else {
						flag = false;
					}

				} else if (selected1 == 2) {
					System.out.println("지포라이터 도전!");

					System.out.println("뽑기를 시작하시겠습니까?");
					System.out.println("1번 시작 // 다른번호 입력시 종료");
					int selected2 = sc.nextInt();
					if (selected2 == 1) {
						money = money - 500;
						System.out.println("남은 금액 :" + money + "원");
						switch (a) {
						case 1:
							System.out.println("축하합니다~~@@");
							products[1].showInfo();
							break;

						default:
							System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
							System.out.println("◈◈◈◈◈◈ 꽝 ◈◈◈◈◈◈ ");
							System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
						}
					} else {
						flag = false;
					}

				} else if (selected1 == 3) {
					System.out.println("라디오 뽑기 도전!");

					System.out.println("뽑기를 시작하시겠습니까?");
					System.out.println("1번 시작 // 다른번호 입력시 종료");
					int selected2 = sc.nextInt();
					if (selected2 == 1) {
						money = money - 500;
						System.out.println("남은 금액 :" + money + "원");
						switch (a) {
						case 1:
							System.out.println("축하합니다~~@@");
							products[0].showInfo();
							break;

						default:
							System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
							System.out.println("◈◈◈◈◈◈ 꽝 ◈◈◈◈◈◈ ");
							System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
						}
					} else {
						flag = false;
					}

				}

			} else if (money < 500) {
				System.out.println("잔액이 부족합니다. 돈을 더 넣어주세요.");
				int money2 = sc.nextInt();
				money = money + money2;

			} else {
				System.out.println("종료");
				flag = false;

			}

		} // end of while

	} // end of main

} // end of class
