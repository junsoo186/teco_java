package basic.ch22;

public class Student implements Romeo {
	String name;

	public Student(String name) {
		this.name = name;
	}

	public void performAsRomeo() {
		System.out.println("학교 축제이서 " + name + " 이 연극합니다");

	}

}
