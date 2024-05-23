package IO.ch04;

import java.io.InputStream;
import java.io.InputStreamReader;

public class SingleCharReader {

	public static void main(String[] args) {

		// 문자 기반에 InputStreamReader 사용방법
		// 중요
		// InputStreamReader는 한 바이트씩 데이터를 읽는것이 아니라
		// 하나의 문자 단위로 읽음!!!

		System.out.println("문자 하나를 이력 하세요");

		// try - catch - resource
		try (InputStreamReader isr = new InputStreamReader(System.in, "UTF-8")) {

			int charData = isr.read();// 사용자가 키보드에 값을 입력할 떄 까지 대기
			if (charData != -1) {
				
				//char --> 2바이트(한글은 2바이트로 거의 모든 글자 표현이 가능하다.)
				System.out.println("사용자가 입력한 값 : " + (char)charData);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
