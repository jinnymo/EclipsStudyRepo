package IO.ch02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyFileOutputStream {

	public static void main(String[] args) {

		long start = System.nanoTime();
		String data = "hello, Java FileOutputStream \n안녕반가워";

		// 1번 파일에다가 데이터를 저장 하고 싶다면(바이트 기반)

		// try-catch-resource -> 자동으로 자원 닫아준다.
		//파일명 옆 true는 기존 파일데이터에 계속 덮어쓰는 기능 활성화
		//로그 확인 할떄 좋을듯
		try (FileOutputStream fos = new FileOutputStream("output.txt",true)) {
			//수행문
			//data(string) 가지고 있는 문자열들을 바이트 배열로 반환 처리
			//byte[] bytes = data.getBytes();
			byte[] bytes = {72,101,108,108,111};
			System.out.println("bytes : " + bytes);
			for (int i = 0; i < bytes.length; i++) {
				System.out.println("bytes[i] : " + bytes[i]);
			}
			
			//연결된 스트림을 활용해서 바이트 배열을 파일에다가 흘려보냄
			fos.write(bytes);
			System.out.println("파일출력 스트림을 통해서 데이터를 씀");
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없음");
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		long end = System.nanoTime();
		System.out.println(end - start);
	}

}
