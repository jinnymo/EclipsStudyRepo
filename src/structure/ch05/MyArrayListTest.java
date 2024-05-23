package structure.ch05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import basic.ch05.Student;

public class MyArrayListTest {

	public static void main(String[] args) {
		
		List mList; //리스트 인터페이스 계열
		
		//arraylist 클래스의 인스턴스화 처리
		ArrayList list = new ArrayList();
		
		//<>  <--제네릭
		//제네릭은 타입의 명시화이다.
		ArrayList<Integer> nums = new ArrayList<Integer>();
		//변수의 선언과 동시에 초기화 --> 값이 들어가 있는 상태인가?
		//값을 동시에 추가 하고 싶다면
		ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		
		
		ArrayList<String> vocabulary = new ArrayList<String>();
		
		ArrayList<Student> members = new ArrayList<Student>();
		
		//클래스의 정의된 기능을 알아 봐야 한다.
		list.add(3);
		list.add(4);
		list.add(6);
		list.add(9);
		//list.add(null);
		list.add(1,10);
		System.out.println("값 추가 확인 :" +list);
		
		Student student = new Student();
		System.out.println(student);
		
		// 값 삭제
	
		list.remove(2);
		System.out.println("값 삭제 확인 :" +list);
	
		//전체 삭제
		//list.clear();
		System.out.println("전체 삭제 확인 : "+list);
		System.out.println(list.size());
		
		try {
			System.out.println(list.get(0));
		} catch (Exception e) {
			System.out.println("list 0 에 데이터 없음");
		}
		
		System.out.println("----------------");
		//ArrayList 와 반복문 활용
		nums = list;//얕은 복사 개념;
		//for(Integer i : nums) {} <- 리스트는 컴파일 시점에 object 타입으로 인식
		for(Integer i : nums) {
			System.out.println(i);
		}
		//ArrayList 안에 값이 포함 되어 있는가?
		System.out.println("3이 nums 리스트에 존재 하는가?" + nums.contains(3));
		System.out.println("50이 nums 리스트에 존재 하는가?" + nums.contains(50));
		
		
		//  요소의 위치 확인
		
		System.out.println("요소3이 몇번쨰 인덱스에 위치 하니 ->" + nums.indexOf(3));
	
		//Iterator 요소 순회 반복자
		Iterator<Integer> iter = nums.iterator();
		while(iter.hasNext()) {
			System.out.println("while 문을 활용하는 방법"+iter.next());
		}
	}

}
