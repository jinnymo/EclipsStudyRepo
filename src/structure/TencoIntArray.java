package structure;

import java.util.Iterator;

/*
 * 배열을 활용 클래스 설계
 * 이미 자바 표준 api 가 존재
 * 
 */
public class TencoIntArray {

	int[] intArr;
	int count;// 배열 size
	public final int ARRAY_SIZE;
	public static final int ERROR_NUM = -99999999;

	public TencoIntArray() {
		count = 0;
		ARRAY_SIZE = 10;
		intArr = new int[ARRAY_SIZE];
	}

	public TencoIntArray(int size) {
		count = 0;
		ARRAY_SIZE = size;
		intArr = new int[ARRAY_SIZE];
	}

	// 기능 설계
	// 배열 요소에 제일 뒤에 값을 추가하는 기능을 가진다.
	public void addElement(int inputData) {
		// 방어적 코드 필요
		if (count >= ARRAY_SIZE) {
			System.out.println("메모리 공간이 가득 찼습니다.");
			return;
		}
		intArr[count] = inputData;
		count++;
	}

	// 배열에 요소를 추가하는 기능
	public void insertElement(int position, int inputData) {
		// 방어적코드작성
		if (count >= ARRAY_SIZE) {
			System.out.println("메모리 공간이 가득 찼습니다.");
			return;
		}
		// 방어적코드
		if (position < 0 || position > ARRAY_SIZE) {
			System.out.println("지정한 인덱스 번호가 잘못 되었습니다.");
			return;
		}
		// 요청값 : position ->3
		// [11,12,13,14,15]
		for (int i = position; i < count - 1; i++) {
			intArr[i + 1] = intArr[i];
		}
		intArr[position] = inputData;
		count++;
	}

// 지정한 인덱스 번호에 맞는 요소를 출력하는 기능
	public int getElement(int position) {
		if (position < 0 || position > count - 1) {
			System.out.println("검색 위치 오류");
			return ERROR_NUM;
		}
		return intArr[position];
	}

	// 요소를 전체 출력하는 기능
	public void prinAll() {
		if (count == 0) {
			System.out.println("출력할내용 x");
			return;
		}

		for (int i = 0; i < intArr.length; i++) {

			System.out.println(intArr[i]);
		}

	}
	//전체 삭제 기능
	public void removeAll() {
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = 0;
		}
		count = 0;
	}
	// 배열에 요소 갯수를 반환
	public int getCountSize() {
		return count;
	}
	
	//현제 요소가 하나도 없는 상태이다.
	public boolean isEmpty() {
		if (count == 0) {
			return true;
		}else {
			return false;
		}
	}
	// 배열에 지정된 인덱스 위치에 값을 추가하는 기능

	// 지정한 인덱스 번호에 요소를 삭제하는 기능
	public void removeElement(int position) {
		
		if (isEmpty()) {
			System.out.println("삭제할 요소가 없습니다.");
			//return;
		}
		//인덱스 범위 잘못 지정 방어적 코드
		if (position < 0 || position >=count) {
			System.out.println("잘못된 요청입니다.");
			return;

		}
		for (int i = position; i < count; i++) {
			intArr[i] = intArr[i+ 1];
		}
	}
}
