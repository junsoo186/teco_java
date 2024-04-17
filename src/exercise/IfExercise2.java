package exercise;

import java.util.Scanner;

public class IfExercise2 {
	// 코드의 시작점
	public static void main(String[] args) {

		// 정수 값 이력 받기 활용해서 코드에 흐름을 만들어 주세요

		System.out.println("성적을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt();
		System.out.println("로깅 - 받은 값 확인: " + point);
		char grade = 'X'; // 초기값을 'X'로 설정해 잘못된 입력을 쉽게 확인
		String message = ""; // 추가적인 피드백 메시지

		// 조건문을 완성 하세요
		// 90점 이상 -> A 학점 입니다.
		// 80점 이상 -> B 학점 입니다.
		// 70점 이상 -> C 학점 입니다.
		// 60점 이상 -> D 학점 입니다.
		// 59점 이하 -> F 학점 입니다.

		if (point >= 90) {
			System.out.println("A 학점 입니다.");
		} else if (point >= 80) {
			System.out.println(" B 학점 입니다.");
		} else if (point >= 70) {
			System.out.println("C 학점 입니다.");
		} else if (point >= 60) {
			System.out.println("D 학점 입니다");
		} else {
			System.out.println("F 학점 입니다.");
		}
		
		
		sc.close();// 열여 있던 자원 닫기
	} // end of main

}
// end of class
