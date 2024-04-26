package useful;

public class StringBufferTest {
	
	//코드의 시작점 - (메인작업자)
	public static void main(String[] args) {
	
		String str1 = new String("hello");
		String str2 = new String("world");
		
		StringBuffer bufferStr = new StringBuffer("Hello");
		System.out.println(System.identityHashCode(str1+str2));// String constant pool에 생성됨
		
		
		//1번
		System.out.println(bufferStr);
		System.out.println(System.identityHashCode(bufferStr)); //원시 주소값
		//2번
		bufferStr.append(str2);
		System.out.println(bufferStr);
		System.out.println(System.identityHashCode(bufferStr)); //원시 주소값
		
		////1번결과와 2번 결과에 주소값이 같다라는 의미는
		//새로운 메모리를 할당 한 것이 아닌 변경한 것이다.
		
		String newStr = bufferStr.toString(); //toString 호출시 타입 ->String
		System.out.println(newStr);
	}//end of main
	
}
