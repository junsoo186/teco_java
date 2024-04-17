package exercise;

import java.util.Scanner;

public class Exercise5 {

	// 코드의 시작점

	public static void main(String[] args) {

		// 1단계 -세로 반복에 횟수

		// * -1
		// ** -2
		// *** -3
		// **** -4
		// *****-5

		for (int i = 0; i < 5; i++) { // 5번

		}

		System.out.print("*");
		System.out.println();
		System.out.print("**");
		System.out.println();
		System.out.print("***");
		System.out.println();
		System.out.print("****");
		System.out.println();
		System.out.print("*****");

		System.out.println("--------------------------");

		for (int j = 0; j < 1; j++) { // 1번동작이다
			System.out.print("*");

		}
		System.out.println();
		for (int j = 0; j < 1; j++) { // 1번동작이다
			System.out.print("*");

		}
		System.out.println();
		for (int j = 0; j < 2; j++) { // 2번동작이다
			System.out.print("*");

		}
		System.out.println();
		for (int j = 0; j < 3; j++) { // 3번동작이다
			System.out.print("*");

		}
		System.out.println();
		for (int j = 0; j < 4; j++) { // 4번동작이다
			System.out.print("*");

		}
		System.out.println();
		System.out.println("---------------------------------");
		// 3단계

		//outer for
		for (int i = 0; i < 5; i++) { // 5번
			
			//inner for
			//첫번째 동작 j = 0 , j < 5 ----> 0 1 2 3 4 5 다섯번
			for (int j = 0; j <= i; j++) { // 4번동작이다
				System.out.print("*");

			}
			System.out.println();
		}

	} // end of main

} // end of class
