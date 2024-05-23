package IO;

import java.io.IOException;

public class MySystemIn {

	public static void main(String[] args) {
		
		//키보드에서 데이터를 으용 프로그램 안으로 넣기
		System.out.println("알파벳 하나를 쓰고 enter를 누르세요");
		
		//바이트 기반 동장 -->0과 1로 구성
		
		//정수 -> byte, short, int, long
		 int i;
		 
		 try {
			i = System.in.read();
			System.out.println("------------------");
			
			System.out.println("i : " + i);
			
			//문자로 변환하고 싶다면 --> 컴픁너 안에 있는 문자표를 활용
			System.out.println((char)i);
		 } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
