package basic.ch09;

import java.util.Scanner;

import basic.ch04.IfElseIfElse;

public class GoingToSchool2 {

	public static void main(String[] args) {

		// 설계된 클래스를 가지고 본인이 의도한 대로 실행에 흐름을 만들어 보자.

		// 스캐너를 활용해서 1번을 누르면 버스를 태워서 실행의 흐름
		// 2번을 누르면 지하철을 태우는 실행의 흐름을 만들어보자
		Scanner sc = new Scanner(System.in);

		Student s1 = new Student("티모", 10000);
		Student s2 = new Student("다리우스", 100_000);
		Subway subway1 = new Subway(1);

		Subway subway2 = new Subway(2);
		Bus bus1 = new Bus(100);
		Bus bus2 = new Bus(200);

		int b;
		boolean flag = true;

		while (flag) {
			System.out.println("탑승할 교통수단 선택 1. 버스  2. 지하철");
			int a = sc.nextInt();
			if (a == 1) {

				if (s1.money - 1500 < 0) {
					System.out.println("잔액 부족 충전 요망");
					flag = false;
				} else {

					System.out.println("버스 번호 선택 1. 100번  2. 200번");
					b = sc.nextInt();
					if (b == 1) {
						s1.takeBus(bus1);

					} else if (b == 2) {
						s1.takeBus(bus2);
					} else {

					}
				}

			} else if (a == 2) {

				if (s1.money - 1100 < 0) {
					System.out.println("잔액 부족 충전 요망");
					flag = false;
				} else {

					System.out.println("지하철 번호 선택 1. 1호선  2. 2호선");
					b = sc.nextInt();
					if (b == 1) {
						s1.takeSubway(subway1);
					} else if (b == 2) {
						s1.takeSubway(subway2);
					} else {

					}
				}
			} else {

			}

			System.out.println("현잔액 : " + s1.money);

		}

	} // end of main

}
