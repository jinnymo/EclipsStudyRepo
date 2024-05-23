package IO.ch02;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class MyBufferedOutputStream {

	public static void main(String[] args) {

		//현재 시간 
		long start = System.nanoTime();
		String data = "기반 스트림 + 보조 스트림을 활용해보자";

		// try-catch-resource
		try (FileOutputStream fos = new FileOutputStream("output2.txt");
				BufferedOutputStream bos = new BufferedOutputStream(fos);) {

			byte[] bytes = data.getBytes();
			//보조 스트림(버퍼)
			bos.write(bytes);
			
			//간혹 버퍼에 데이터가 남아있다면 중복된 데이터를 쓸수 있다.
			//한번 사용한 다음에
			bos.flush();
			
			System.out.println("보조 스트림을 활용한 파일 출력 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		//현재시간
		//나노초는 10억분의 1
		long end = System.nanoTime();
		//종료 - 시작 -> 소요시간
		System.out.println(end - start);
		
	}

}
