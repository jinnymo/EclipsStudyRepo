package IO;

import java.io.IOException;

public class MySystemIn2 {

	public static void main(String[] args) {
		
		//키보드에서 데이터를 으용 프로그램 안으로 넣기
		System.out.println("알파벳 하나를 쓰고 enter를 누르세요");
		
		//바이트 기반 동장 -->0과 1로 구성
		
		//정수 -> byte, short, int, long
		 int i;
		 
		 try {
			 while( (i = System.in.read()) != '\n') {
				 System.out.println("i : "+ i);
				 System.out.println("(char)i : "+ (char)i);
			 }
	
		 } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
