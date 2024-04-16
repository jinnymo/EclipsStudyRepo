package basic.ch09;

public class Student {
	
	String name;
	int money; //소지금
	
	public Student(String Myname, int myMoney) {
		name = Myname;
		money = myMoney;
	}
	
	//학생이 버스를 탄다.
	public void takeBus(Bus bus) {
		//어떻게 코드를 만들어야 할까?
		bus.take(1500);
		money -= 1500;
	}
	//학생이 지하철을 탄다.
	public void takeSubway(Subway subway) {
		//어떻게 코드를 만들어야 할까?
		subway.take(1100);
		money -= 1100;
		
	}
	//상태창을 보여준다.
	public void showInfo() {
		System.out.println("학생 이름 :" + name);
		System.out.println("학생 소지금 :" + money);
	}
	
}
