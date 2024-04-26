package useful;

public class StringBufferTest {
	
	// start of code - (main worker)
	public static void main(String[] args) {

		String str1 = new String ("Hello");
		String str2 = new String ("World");
		
		StringBuffer bufferStr = new StringBuffer("Hello");
		System.out.println(bufferStr);
		System.out.println(System.identityHashCode(bufferStr)); // 원시 주소 값
		
		bufferStr.append(str2);
		System.out.println(bufferStr);
		System.out.println(System.identityHashCode(bufferStr));
		// 1번 결과와 2번 결과에 주소값이 같다라는 의미는
		//새로운 메모리를 할당 한 것이 아닌 변경한 것이다.
		
		// 활용
		String newstr = bufferStr.toString();
		
		System.out.println(newstr); // toString 호출시 타입 -> String
		
		
		
		
	} // end of main
} // end of class 
