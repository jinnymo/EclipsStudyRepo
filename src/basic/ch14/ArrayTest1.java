package basic.ch14;

public class ArrayTest1 {

	public static void main(String[] args) {

		String[] names = new String[5];
		
		//생성 - C
		names[0] ="김씨";
		names[1] ="나씨";
		names[2] ="박씨";
		//조회 - R
		System.out.println(names);
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println(names[4]);
		//수정 - U (update) 
		names[0] = "Mr.kim";
		names[1] = "Mr.na";
		names[2] = "Mr.park";
		//삭제 - D
		names[0] =null;
		names[1] =null;
		names[2] =null;
		//자바에서 null 값은 할당되지 않은 상태를 의미합니다.
		//Object 타입에서 사용가능
		
		
		//1단계
		//배열에 길이와 인덱스 길이에 대한 이해 --> 인덱스에서 길이는 n-1이다.
		System.out.println("배열에 크기 : " + names.length);
		
		//문제2
		//배열에 크기가 50개인면 인덱스 길이는 얼마인가 -->49
		//배열에 크기가 100개인면 인덱스 길이는 얼마인가 -->99
		
	
	}

}
