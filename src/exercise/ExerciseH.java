package exercise;

import java.util.Iterator;
import java.util.Scanner;

public class ExerciseH {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println();

		System.out.print("이름을 입력해주세요:");
		String name = sc.next();
		greet(name);
		// --------------------------------------
		System.out.print("제곱할수 : ");
		int i = sc.nextInt();
		System.out.println("제곱은 :" + square(i));
		//----------------------------------------
		System.out.print("나이를 입력하세요 : ");
		int age  = sc.nextInt();
		System.out.println("성인"+checkAdult(age));
		//----------------------------------------
		System.out.print("숫자를 입력하세요");
		int num = sc.nextInt();
		System.out.println(signOfNumber(num));
		System.out.print("x :");
		int op = sc.nextInt();
		System.out.print("y :");
		int tp = sc.nextInt();
		System.out.println(findMax(op,tp));
	}

//--------------------------------------------------
	static void greet(String greeting) {
		System.out.println("안녕하세요," + greeting + "님!");
	}

	static int square(int i) {
		int ze;
		ze = i * i;
		return ze;
	}

	static boolean checkAdult(int age) {

		boolean adult = age > 18;
		return adult;
	}

	static int signOfNumber(int num) {
		int result = 0;
		if (num > 0) {
			System.out.println("positive");
		} else if (num < 0) {
			System.out.println("negative");
		} else {
			System.out.println("zero");

		}
		return result;
	}

	static int findMax(int op, int tp) {
		int max = 0;
		max = op > tp ? op : tp;

		return max;
	}

} // end of class
