package useful.ch05;

public class WorkerMainTest {
	
	//메인 작업자
	public static void main(String[] args) {
		System.out.println("-----------------main 쓰레드 시작------------------");
		System.out.println(Thread.currentThread());
	
		//작업자 하나 만들어내기
		
		Worker worker = new Worker("워커1");//생성은 메인 쓰레드가 했다.
		//명령어를 통해서 워커 1에게 너가 위임 받은 일을 시작해
		worker.start();
		System.out.println("-----------------main 쓰레드 종료------------------");
	}
	
	
}
