package IO.ch03;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {

	public static void main(String[] args) {
		// 스트림은 기본적으로 단방향이다.
		// 입력 스트림, 출력 스트림 두개가 필요하다.

		// 파일 경로(복사할 대상의 경로)
		String sourceFilePath = "C:\\Users\\KDP\\git\\Team2Project\\saved.png";

		// 목적지 파일
		String destinationFilePath = "copy.png";

		// 소요시간 확인
		long startTime = System.nanoTime();

		try (FileInputStream in = new FileInputStream(sourceFilePath);
				FileOutputStream out = new FileOutputStream(destinationFilePath)) {

			int data;
			while((data = in.read()) != -1) {
				//파일에 출력
				
				out.write(data);
			}
			
			
			
			System.out.println("입력스트림 -> 출력스트림 -> 입력-> 출력에 반복 완료");
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
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
	}

}
