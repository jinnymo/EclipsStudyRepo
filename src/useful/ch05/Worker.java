package useful.ch05;

import java.util.Iterator;

public class Worker extends Thread {

	private String name;

	public Worker(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("worker : " + name + "  " + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// super.run();
	}

}
