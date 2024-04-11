package basic.ch04;

import java.util.Scanner;

public class EvenSumCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 값을 입력 하세요 :  ");
		int maxNumber = sc.nextInt();
		
		int sum =0;
		
		for(int i=1; i<=maxNumber; i++) {
			if(i%2 == 0) {
				
			}
			else {
				sum += i;
			}
		}
		System.out.println(sum);
		
		
		sum= 0;
		for(int i=1; i<=maxNumber; i+=2) {
			sum+=i;
		}
		
		System.out.println(sum);

	}

}
