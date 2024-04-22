package basic.ex13;

import java.util.Arrays;
import java.util.Iterator;

public class LottoGame {

	static int temp;
	static int b = 0;

	public static void main(String[] args) {

		int[] numArray = new int[6];
		int[] biggerArray = new int[6];

		// staic 변수 --> 클래스 변수라고도 불린다.

		for (int i = 0; i < numArray.length; i++) {
			numArray[i] = LottoNumberMaker.makeNumber();
		}
		
		for (int i = 0; i < numArray.length; i++) {
			System.out.print(numArray[i] + "\t");
		}
		// 내림 차순으로 정렬해보기

		int biggerNum = 0;
		int step = 0;

		for (int j = 0; j < numArray.length; j++) {
			for (int i = b; i < numArray.length; i++) {
				if (biggerNum < numArray[i]) {
					biggerNum = numArray[i];
					step = i;
				}
			}
			biggerArray[b] = biggerNum;
			temp = numArray[b];
			numArray[b] = numArray[step];
			numArray[step] = temp;
			biggerNum = 0;
			b++;
		}
		boolean flag;
		System.out.println();
		System.out.println();
		System.out.println(biggerArray[0] + " | ");

		for (int i = 1; i < biggerArray.length; i++) {
			flag = true;
			
			while (flag) {
				if (biggerArray[i] == biggerArray[i - 1]) {
					flag = false;
				} else {
					System.out.println(biggerArray[i] + " | ");
					flag = false;
				}
			}

		}
//		for (int i = 0; i < numArray.length; i++) {
//			Arrays.sort(numArray);
//			System.out.println(numArray[i]);
//		}
		
	
	}// end of main

}
