package IO.ch04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StandardInputExample {

	public static void main(String[] args) {

		List<String> lines = new ArrayList<String>();
		
		// 문자 기반 스트림 + 보조 문자 기반 스트림을 사용한다.!!
		try (InputStreamReader isr = new InputStreamReader(System.in); 
				BufferedReader br = new BufferedReader(isr)) {
			System.out.println("더 많은 텍스트를 입력하세요 (한줄 단위) -> 엔터");
			
			String line;
			while((line = br.readLine()) != null && !line.isEmpty()) {
			lines.add(line);
			
			}
			for (String data : lines) {
				System.out.println(data);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	

	}

}
