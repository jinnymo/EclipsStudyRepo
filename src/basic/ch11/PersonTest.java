package basic.ch11;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person1 = new Person("홍길동", 100);
		
		Person personBox = person1;
		System.out.println(personBox.getName());
		person1.setName("지니");
		Person personBox2 = person1.getPerson();
		System.out.println(personBox2.getName());
		System.out.println(personBox.getName());
		
		Person persoLee = new Person("이순신", 101);
		//위 코드 까지는 heap 메모리 영역에 객체가 2개 생성된 상태이다.
		//지역변수인 person1,, personBox , personBox2는 같은 객체를 가르킨다.
		
		//연습문제 
		personBox2.setName("티모");
		
		
	}//end of main

}//end of class
