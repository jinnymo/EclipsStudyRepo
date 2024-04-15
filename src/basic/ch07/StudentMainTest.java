package basic.ch07;

public class StudentMainTest {

	public static void main(String[] args) {
		
		//인스턴스화 과정
		Student student1 = new Student();
		student1.studentID = 1001;
		student1.studentName = "샤코";
		student1.address = "푸른언덕";
		
		student1.study();
		student1.breakTime();
		student1.showInfo();

	}

}
