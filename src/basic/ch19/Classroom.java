package basic.ch19;

public class Classroom {

	private String className;
	private Student[] students;
	private int studentCount;
	private final int MAX_STUDENT = 30;

	public Classroom(String className) {
		this.className = className;
		students = new Student[MAX_STUDENT];
		this.studentCount = 0;
	}
	
	//학생을 추가하는 메서드
	public void addStudent(Student student) {
		if(studentCount < MAX_STUDENT) {
			students[studentCount] = student;
			studentCount++;
		}else {
			System.out.println("정원 초과");
		}
	}
	
	//학급에 속한 모든 학생 정보를 출력하세요
	public void showStudents() {
		for (int i = 0; i < students.length; i++) {
			if(students[i] != null) {
				System.out.println(students[i].getName());
				System.out.println(students[i].getAge());
			}
		}
	}
}
