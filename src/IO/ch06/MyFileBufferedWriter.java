package IO.ch06;

import java.io.BufferedWriter;
import java.io.FileWriter;
//버퍼를 활용한 파일 풀력 스트림에 사용
public class MyFileBufferedWriter {

	public static void main(String[] args) {

		String filePath = "output2.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))){
			bw.write("첫번쨰 줄입니다.");
			bw.newLine();
			bw.write("두번쨰 줄입니다.");
			bw.newLine();
			bw.write("세번쨰 줄입니다.");
		
			bw.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
