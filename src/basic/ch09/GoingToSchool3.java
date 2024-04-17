package basic.ch09;

import java.util.Scanner;

public class GoingToSchool3 {

	//메인 함수
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생이 탑승할 대중교통을 선택 해주새요");
		System.out.println("1. 버스 2. 지하철");
		int answer = sc.nextInt();
		
		// 설계된 클래스를 가지고 본인이 의도한 대로 실행에 흐름을 만들어 보자.
		
		// 스케너를 활용해서 1번을 누르면 버스를 태워서 실행에 흐름을 만들고
		// 2번을 누르면 지하철을 태우는 실행에 흐름을 만들어 보자.
		
		
		Bus bus1 = new Bus (100); // 선언만 했음
		Bus bus2 = new Bus (200); // 선언만 했음
		
		Subway subway1 = new Subway(1);
		Subway subway2 = new Subway(2);
		
		Student s1 = new Student ("호랑이", 100_000);
		Student s2 = new Student ("토끼", 100_000);
		
		if(answer == 1) {
			s2.takeBus(bus2);
			s2.showInfo();
			bus2.showInfo();
		}else if (answer == 2) {
			s2.takeSubway(subway2);
			s2.showInfo();
			subway2.showInfo();
	
		}
		
	} // end of main

}	// end of class
