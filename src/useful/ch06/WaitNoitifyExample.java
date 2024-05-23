package useful.ch06;

import java.util.ArrayList;

public class WaitNoitifyExample {

	// 객체들간에 공유하는 데이터(자원)을 설계
	// static 이기 때문에 인스턴스들이 자원을 공유할 수 있다.
	private static ArrayList<Integer> sharedResource = new ArrayList<Integer>();

	private static boolean isDataAvaliable = false;

	// 생산자 만들기
	static class Producer extends Thread {
		@Override
		public void run() {
			synchronized (sharedResource) {
				System.out.println("생산자는 data 생성 시작!!~~");
				for (int i = 0; i < 10; i++) {
					sharedResource.add(i + 1);

					// 시각적 인지를 위해서 임의 코드 추가
					System.out.print(".");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				// 작업이 다끝나면 상태 변경 처리
				isDataAvaliable = true;
				// sharedResource 쓸수 있도록 다른 작업자들에게 알려주기 notify
				sharedResource.notify();
			} // 동기화 블록

		}
	}

	static class Consumer extends Thread {
		@Override
		public void run() {
			synchronized (sharedResource) {

				while (!isDataAvaliable) {
					System.out.println("고객은 데이터 생성까지 기다려...");
					try {
						sharedResource.wait();// 대기상태
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				System.out.println("데이터가 생성완료 되어서 사용가능함");
				System.out.println(sharedResource);
			} // 동기화 블록
		}
	}

	public static void main(String[] args) {
		Consumer consumer = new Consumer();
		Producer producer = new Producer();
		
		//소비자 스레드 시작
		consumer.start();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//생상자 스레드 시작
		producer.start();
		//run -> for 10번 -> listadd -> notify()
		
	}
}
