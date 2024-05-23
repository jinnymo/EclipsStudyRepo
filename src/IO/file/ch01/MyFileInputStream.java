package IO.file.ch01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyFileInputStream {
	
	public static void main(String[] args) {
		
		//외부에 있는 파일 데이터를 읽으려면 input
		FileInputStream in = null;
		try {
			in = new FileInputStream("a.txt");
			//int readData = in.read();
//			System.out.println((char)in.read());
//			System.out.println((char)in.read());
//			System.out.println((char)in.read());
			
			//3단계
			int readData;
			while((readData = in.read()) != -1) {
				System.out.print((char)readData);
			}
			//4단계 fileInputStream(기반 스트림)대상에 접근해서 한바이트씩 읽어들이는 기능을 가진다.
			// 1byte -> 127 -128 정수값을 담을수 있다. a=>97 A=>65, 대 =>(정수값)
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
