package basic.ch08;

public class StudentMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student("홍길동",101,3);
		System.out.println(s1);
	
		//연습문제
		//s2참조 변수에 이름으로 학생을 메모리에 올리고
		//호출해주세요
		Student s2 = new Student("kdy",102,10);
		s2.showInfo();
		
		//변수에 직접 접근해서 값을 초기화 해보세요
		Student s3 = new Student();
		s3.grade = 1;
		s3.name ="12"; 
		s3.number = 123;
		s3.showInfo();
	}

}
