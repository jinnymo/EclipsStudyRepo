package useful.ch05;

/*
 * 쓰레드를 만드는 두번째 방법 Runable 인터벵이스를 
 * 활용하는 방법
 */
public class MyThread2 implements Runnable {

	//Thread 클래스에서 start 메서드가 호출되면
	//동작하는 부분이라고 약속 되어 있다.
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i = 0;
		while(i<50) {
			System.out.println("i : "+ i);
			i++;
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
