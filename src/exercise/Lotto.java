package exercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Lotto {
	
	public static void main(String[] args) {
	Random random = new Random();
	
	
	
	int[] lottos= Lotto.makeNumbers();
	Arrays.sort(lottos);
	for ( int i = 0; i < lottos.length; i++) {
		System.out.print(lottos[i]+ "\t");
	}

	} // end of main
	public static int[] makeNumbers() {
		int[] numbers = new int[6];
		Random random = new Random();
		// 중복된 랜덤 1 ~ 45 숫자가 나온다면 
		// 다시 반복문을 돌려서 중복 안되게 만들어야 한다. 
		for(int i = 0; i < 6; i++) {
			numbers[i] = random.nextInt(45) + 1;
			// for -> 중복된 숫자가 없도록 코드를 완성하시오 
			//[0] 3. 
			//[1] 3. 
			for(int j = 0; j < i; j++ ) {
				if(numbers[j] == numbers[i]) {
					i--;
					break;
				}
			}
			
		}
		
		return numbers;
	}

	
} // end of class
