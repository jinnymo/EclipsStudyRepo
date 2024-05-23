package IO.ch03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedFileCopy {

	public static void main(String[] args) {
		//기반 스트림 + 보조 스트림을 활용해서 파일 복사 기능을 만들기
		
		String sourceFilePath = "C:\\Users\\KDP\\git\\Team2Project\\saved.png";

		// 목적지 파일
		String destinationFilePath = "copy.png";
		long startTime = System.nanoTime();
		try (
				FileInputStream in = new FileInputStream(sourceFilePath);
				FileOutputStream out = new FileOutputStream(destinationFilePath);
				BufferedInputStream inB = new BufferedInputStream(in);
				BufferedOutputStream outB = new BufferedOutputStream(out);
				){
			
			int data;
			
			while((data =inB.read()) != -1) {
				outB.write(data);
			}
			byte[] bytes = in.readAllBytes();
			
			outB.write(bytes);
			outB.flush();

		} catch (Exception e) {
			e.printStackTrace();
		}
		long end = System.nanoTime();
		//소요시간을 초 단위로 변환 (포맷팅)
		long duration = end - startTime;
		
		double seconds = duration/1_000_000_000.0;
		
		
		
		//스트링 클래스에 format 메서드 사용해보기
		String result = String.format("소요 시간은 : %.6f초 입니다.", seconds);
		//%는 포맷 지정자의 시작
		//f지정자는 float , double 유형의 변수를 인자로 받아 처리 하겠다.
		
		System.out.println(result);
		System.out.println("완료");
	}
}
