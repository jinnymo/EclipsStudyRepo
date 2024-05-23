package structure.ch06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class MySetTest {
	
	public static void main(String[] args) {
		
		//업캐스팅 상태 - 컴파일 시점에는 set게열에 타입은 멤버들만 확인 가능
		Set<Integer> mSet = new HashSet<Integer>();
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		
		//요소 추가 방법
		set1.add(1);
		set1.add(1);//중복값ㄱ - retrun = false; 저장안됨
		set1.add(2);
		set1.add(3);
		set1.add(3);//중복값ㄱ - retrun = false;
		
		
		//요소제거(요소값을 넣음)인덱스 X
		set1.remove(3);
		for (int i = 0; i < set1.size(); i++) {
			//set[i] ==>set 은 인덱스 개념이 없다
		}
		
		for (Integer mi : set1) {
			System.out.println(mi);
		}
		
		Iterator<Integer> iter = set1.iterator();
		
		HashSet<Integer> lottoNumbers = new HashSet<Integer>();
		
		while (lottoNumbers.size()<6) {
			
		lottoNumbers.add(getRandomNumber());
		
			
		}
		
		
		
	}
	
	public static int getRandomNumber() {
		Random random = new Random();
		return random.nextInt(45)+1;
	}
	
}
