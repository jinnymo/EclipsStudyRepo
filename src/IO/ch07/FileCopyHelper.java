package IO.ch07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopyHelper {

	//파일 복사
	public static void copyFile(String readFilePath, String writerFilePath) {
		
		try (FileReader fr = new FileReader(readFilePath);
				FileWriter fw = new FileWriter(writerFilePath)){
			int c;
			while((c = fr.read())!= -1) {
				fw.write(c);
			}
			System.out.println("파일복사 완료 "+ writerFilePath);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("파일 복사중에 오류 발생");
		}
		
	}
	
	//파일 복사 - 버퍼기능
	public static void copyFileWithBuffer(String readFilePath, String writerFilePath) {
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(readFilePath));
				BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(writerFilePath))){
			
			// 버퍼의 크키를 지정 가능하다.
			char[] buffer = new char[1000];
			int numCharsRead;
			
			while((numCharsRead = bufferedReader.read(buffer)) != -1) {
				bufferedWriter.write(buffer,0,numCharsRead);
				System.out.println("numCharsRead : " + numCharsRead);
			}
			
			
			System.out.println("버퍼를 사용한 파일 복사 완료 : " + writerFilePath);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("버퍼를 사용한 파일 복사중에 오류 발생");
		}
		
	}
	
	public static void main(String[] args) {
		//FileCopyHelper.copyFile("NewYork.txt","copyNewYork.txt");
		FileCopyHelper.copyFileWithBuffer("NewYork.txt","copyNewYork.txt");
		
	}
}
