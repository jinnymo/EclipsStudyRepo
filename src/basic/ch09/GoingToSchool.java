package basic.ch09;

public class GoingToSchool {

	public static void main(String[] args) {

		//객체지향 프로그래밍이란 객체와 객체간의 관계를 형성하고 
		//상호작용 하게 프로그래밍 하는것
		
		Bus bus1 = new Bus(100);
		Bus bus2 = new Bus(200);
		
		Subway subway1 = new Subway(1);
		Subway subway2 = new Subway(2);
		Subway subway3 = new Subway(3);
		
		//////////////////////////////////////
		//학생이 버스를 탄다
		
		Student student1 = new Student("홍길동",10000);
		student1.showInfo();
		System.out.println("--------------------------------");
		student1.takeBus(bus2);
		student1.showInfo();
		//버스의 상태값 확인
		System.out.println("--------------------------------");
		bus2.showInfo();
		System.out.println("--------------------------------");
		student1.takeSubway(subway1);
		student1.showInfo();
		subway1.showInfo();
		System.out.println("--------------------------------");
		subway2.showInfo();
	
	}

}
