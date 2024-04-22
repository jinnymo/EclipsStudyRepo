package basic.ch14;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//배열이란?
		//연관된 데이터를 모아서 통으로 관리하기 위한 데이터 타입!!
		
		//배열에 특징
		//배열은 사용하기 전에 반드시 몇 개의 데이터가 등렁갈지
		//크기를 지정해야 사용할수 있다.
		
		
		//배열 메모리 공간 만들기
		int[] numbers = new int[3];
		int intBoxes[] = new int[5];
		//값넣기
		
		numbers[0] = 1000;
		numbers[1] = 1001;
		numbers[2] = 1002;
		
		//numbser[3] = ~~; 으로 해버리면 인덱스 길이 초과로 오류 발생
		
		//배열에 선언과 동시에 초기화
		int[] grades = {5,3,1}; //new int[] 생략 가능하다.,

		
		//문제 1 
		//5개의 크기를 가지는 double 타입의 배열을 선언ㄴ
		
		double[] arrayB = new double[5];
		
		//문제2
		//위에서 선언한 배열에 값을 인덱스 0~2까지 초기화 하시오
		//값은 아무거나 상관없음
		
		arrayB[0] = 10;
		arrayB[1] = 10;
		arrayB[2] = 10;
		
		//문제3
		//String 타입에 배열을 선언 배열의 크기는 3
		//선언과 동시에 초기화
	
		String[] arraytT = {"1.","2.","3."};
	
	}

}
