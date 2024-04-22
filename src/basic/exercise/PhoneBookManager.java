package basic.exercise;

import java.util.Iterator;
import java.util.Scanner;

import basic.ch15.Book;

public class PhoneBookManager {
	static int LAST_INDEX_NUMBER1;
	static Scanner sc = new Scanner(System.in);
	static PhoneBook[] phoneBook;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final String SAVE = "1";
		final String SEARCH_ALL = "2";
		final String SEARCH_BY_TITLE = "3";
		final String DELETE_ALL = "4";
		final String END = "0";

		phoneBook = new PhoneBook[100];
		LAST_INDEX_NUMBER1 = 100;
		for (int i = 0; i < phoneBook.length; i++) {
			phoneBook[i] = new PhoneBook(i);
		}

		boolean flag = true;
		while (flag) {

			//System.out.println(phoneBook.length);
			System.out.println("**메뉴선택**");
			System.out.println("1.저장 2.전체조회 3. 선택조회 4. 전체삭제 0.프로그램 종료");
			String selectedNumber = sc.nextLine();
			System.out.println(selectedNumber);

			if (selectedNumber.equals(SAVE)) {
				System.out.println(">>저장 하기<<");
				save(phoneBook);
			} else if (selectedNumber.equals(SEARCH_ALL)) {
				System.out.println(">>전체 조회 하기<<");
				searchAll(phoneBook);
			} else if (selectedNumber.equals(SEARCH_BY_TITLE)) {
				System.out.println(">>선택 조회 하기<<");
				serachName(phoneBook);
			} else if (selectedNumber.equals(DELETE_ALL)) {
				System.out.println(">>전체 삭제 하기<<");
				deleteAll();
			} else if (selectedNumber.equals(END)) {
				System.out.println(">>프로그램 종료<<");
				flag = false;
			} else {

			}
		}

	}

	public static void save(PhoneBook[] phoneBook) {

		if (LAST_INDEX_NUMBER1 >= phoneBook.length) {
			System.out.println("더이상 저장할 공간이 없음");
			return;

		}
		System.out.println(">>>>저자하기<<<<");
		System.out.println("이름 하세요");
		int name = sc.nextInt();
		PhoneBook phoneBook1 = new PhoneBook(name);

		for (int i = 0; i < phoneBook.length; i++) {
			System.out.println(i);
			// System.out.println(phoneBook[1].getName());
			if (phoneBook[i] == null) {
				phoneBook[i] = phoneBook1;
				break;
			} else {
				System.out.println(i + "abcd");
			}
		}

	}

	public static void searchAll(PhoneBook[] phoneBook) {
		System.out.println(phoneBook.length);
		for (int i = 0; i < phoneBook.length; i++) {

			if (phoneBook[i] != null) {
				System.out.println("이름 : " + phoneBook[i].getName());
				System.out.println("전화번호 : " + phoneBook[i].getPhoneNum());
			}

		}
	}

	public static void serachName(PhoneBook[] phoneBook) {
		System.out.println("---선택 조회하기---");
		System.out.print("이름 입력 해줘요 : ");
		String getName = sc.next();
		for (int i = 0; i < phoneBook.length; i++) {

			if (phoneBook[i] != null && getName.equals(phoneBook[i].getName())) {
				System.out.println("전화번호 : " + phoneBook[i].getPhoneNum());
				return;
			}

		}
		System.out.println("해당하는 유저 없음");
	}

	public static void deleteAll() {
		System.out.println("전체 삭제");
		LAST_INDEX_NUMBER1 = 0;
		// [주소] [주소] [주소]
		// [null] [null] [null] --> heap --> GC 삭제 처리
		for (int i = 0; i < phoneBook.length; i++) {

			if (phoneBook[i] != null) {
				// phoneBook[i] = null;
				System.out.println(phoneBook);

				phoneBook = null; // 생성되어 있는 배열의 메모리 공간

				return;
			}
		}

	}

	public void exit() {

	}
}
