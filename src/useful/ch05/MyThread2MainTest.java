package useful.ch05;

public class MyThread2MainTest  {
	//메인 작업자
	public static void main(String[] args) {

		System.out.println("main start");
		
		// 문제 MyThread2 를 메모리에 올리고
		// 그안에 정의된 run() 메서드를 호출 하시오
		// 힌트 ---> Thread 문서를 반드시 확인하시오
		
		System.out.println(Thread.currentThread());
	MyThread2 myThread2 = new MyThread2();
	MyThread2 myThread21 = new MyThread2();
	// 새로운 작업자를 생성해서 위임 시킬때는 Thread 안에 있는 start() 메서드를 호출해야 된다.
	Thread thread1 = new Thread(myThread21);
	thread1.start();
	new Thread(myThread2).start();
	 
	System.out.println("------end main thread -------");
	
	
	}

}
