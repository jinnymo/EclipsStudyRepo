package basic.exercise.test02;

public class MainTest1 {

	
	public static void main(String[] args) {

		//문제1
		
		
		
		A a = new A(b);
		B b = new B();
		C c = new C();
		D d = new D();
		//내부에서 객체를 생성하지 않고 외부에서
		//객체를 주입한 후에 d에 get이름을 호출하시오
		
		System.out.println(a.sendName());
	}
}
