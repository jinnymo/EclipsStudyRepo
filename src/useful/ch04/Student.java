package useful.ch04;

public class Student {

	private static Student student;
	
	private Student() {
		
	}
	
	public static Student getInstance() {
		if(student == null) {
			student = new Student();
		}
		return student;
	}
	
}
