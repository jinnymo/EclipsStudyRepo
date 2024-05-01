package useful.ch05;

/*
 * 쓰레드를 추가하는 방법 - 상속을 활용할 수 있다.
 * Thread --> Runnable --> run()
 * 
 */
public class MyThread extends Thread{

	//우리가 정의한 클래스에서 run()메서드 재정의 할 수 있다
	//쓰레드를 사용할 떄 알야 하는 필수 개념
	//쓰레드가 가지고 있는 메서드 start()호출 시키면 약속으로
	//run() 메서드 호출 되어 동작하게 만들어져있다.
	
	@Override
	public void run() {
	 //우리가 동작 시키고자 하는 일을 정의해서 코드를 설계할 수 있다.
		//임무-> 반복문 200번 수행
		
		for (int i = 0; i < 200; i++) {
			System.out.print(i +"\t");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//super.run();
	}
	
}
