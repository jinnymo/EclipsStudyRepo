package basic.ex13;

import java.util.Iterator;

public class LottoGame2 {

	public static void main(String[] args) {
	
		
		
		
		//staic 변수 --> 클래스 변수라고도 불린다.
		int gameNumber1 = LottoNumberMaker.makeNumber();
		int gameNumber2 = LottoNumberMaker.makeNumber();
		int gameNumber3 = LottoNumberMaker.makeNumber();
		int gameNumber4 = LottoNumberMaker.makeNumber();
		int gameNumber5 = LottoNumberMaker.makeNumber();
		int gameNumber6 = LottoNumberMaker.makeNumber();

		int temp = 0;
		
		if(gameNumber1 > gameNumber2) {
			temp = gameNumber1;
			gameNumber1 = gameNumber2;
			gameNumber2 = temp;
		}
		if(gameNumber2 > gameNumber3) {
			temp = gameNumber2;
			gameNumber2 = gameNumber3;
			gameNumber3 = temp;
		}
		if(gameNumber3 > gameNumber4) {
			temp = gameNumber3;
			gameNumber3 = gameNumber4;
			gameNumber4 = temp;
		}
		if(gameNumber4 > gameNumber5) {
			temp = gameNumber4;
			gameNumber4 = gameNumber5;
			gameNumber5 = temp;
		}
		if(gameNumber5 > gameNumber6) {
			temp = gameNumber5;
			gameNumber5 = gameNumber6;
			gameNumber6 = temp;
		}
		System.out.println(gameNumber1);
		System.out.println(gameNumber2);
		System.out.println(gameNumber3);
		System.out.println(gameNumber4);
		System.out.println(gameNumber5);
		System.out.println(gameNumber6);
		
		
	}// end of main

}

		