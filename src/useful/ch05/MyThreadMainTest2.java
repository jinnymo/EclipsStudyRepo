package useful.ch05;

public class MyThreadMainTest2 {

	//메인 작업자
	public static void main(String[] args) {
		System.out.println("main start ");
		
		//MyThread2 myThread2 = new MyThread2();
		
		//새로운 작업자를 생성해서 위임 시킬떄는 Thread 안에 있는 start()메서드를 호출해
		Thread a = new Thread(new MyThread2());
		a.start();
		System.out.println("--------------------");
		
	}
}
