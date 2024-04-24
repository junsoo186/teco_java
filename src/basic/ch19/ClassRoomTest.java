package basic.ch19;

public class ClassRoomTest {

	public static void main(String[] args) {

		ClassRoom classroomA = new ClassRoom("C4");
		Student student1 = new Student("홍길동", 20);
		Student student2 = new Student("전우치", 10);
		
		classroomA.addStudent(student1);
		classroomA.addStudent(student2);
		classroomA.showStudents();
	}

}
