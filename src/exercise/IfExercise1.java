package exercise;

import java.util.Scanner;

public class IfExercise1 {
	// 코드의 시작점
	public static void main(String[] args) {

		System.out.println("성적을 입력하세요 (0-100): ");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        
        char grade = 'X'; // 초기값을 'X'로 설정해 잘못된 입력을 쉽게 확인
        String message = ""; // 추가적인 피드백 메시지
        
        
        
     
   
        // .. 코드를 작성해주세요 
        // 힌트 - 비교 연산자와 논리연사자를 활용 
        // ...
		
     // 조건문을 완성 하세요
     		// 90점 이상 -> A 학점 입니다.
     		// 80점 이상 -> B 학점 입니다.
     		// 70점 이상 -> C 학점 입니다.
     		// 60점 이상 -> D 학점 입니다.
     		// 59점 이하 -> F 학점 입니다.
        
        	if (score> 100 || score < 0) {
        	System.out.println(grade);
        	}else if (score >= 90) {
     			System.out.println("'A' 학점");
     		} else if (score >= 80) {
     			System.out.println("'B' 학점");
     		} else if (score>= 70) {
     			System.out.println("'C' 학점");
     		} else if (score >= 60) {
     			System.out.println("'D' 학점");
     		} else {
     			System.out.println("'F' 학점 (불합격)");
     		}
        
        

		
		
		
        scanner.close(); // 자원 닫기 
	} // end of main

}
// end of class
