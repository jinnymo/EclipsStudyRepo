package basic.ex13;

import java.util.Random;

public class LottoNumberMaker {

	private String version = "1.0.0";
	//main함수
	public static void main(String[] args) {
		
		
		System.out.print(makeNumber()+"\t");
		System.out.print(makeNumber()+"\t");
		System.out.print(makeNumber()+"\t");
		System.out.print(makeNumber()+"\t");
		System.out.print(makeNumber()+"\t");
		System.out.print(makeNumber()+"\t");
		
	}//end of main
	//인스턴스에 속하지 않는 함수 만들기
	public static int makeNumber() {
		//System.out.println("ver : " + version);
		
		//static 함수안에 멤버변수를 사용할 수 없다.
		//메모리할당 순서를 이해해야함.
		
		//자바 도구 --- 표준 api
		//난수 발생기 -> 랜덤 값을 생성
		Random random = new Random();
		int resultNumber = random.nextInt(45) +1;
		return resultNumber;
	}
	
}
