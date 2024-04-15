package basic.exercise;

import java.util.Iterator;
import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {

		// 1단계 세로 반봅에 횟수 (for - 횟수)

		// *
		// **
		// ***
		// ****
		// *****

		for (int i = 0; i < 5; i++) {

		}

		// 2단계

		System.out.print("*");
		System.out.println();
		System.out.print("**");
		System.out.println();
		System.out.print("***");
		System.out.println();
		System.out.print("****");
		System.out.println();
		System.out.println("*****");

		System.out.println("-------------------");

		for (int j = 0; j < 1; j++) {
			System.out.print("*");
		}
		System.out.println();
		for (int j = 0; j < 2; j++) {
			System.out.print("*");
		}
		System.out.println();
		for (int j = 0; j < 3; j++) {
			System.out.print("*");
		}
		System.out.println();
		for (int j = 0; j < 4; j++) {
			System.out.print("*");
		}
		System.out.println();
		for (int j = 0; j < 5; j++) {
			System.out.print("*");
		}
		System.out.println();

		System.out.println("-------------------");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
