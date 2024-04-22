package basic.ch15;

import java.util.Iterator;
import java.util.Scanner;

/*
 * author - 김근호
 * 모든 프로그래밍의 기본은 CRUD이다.
 */

public class MyBookStore {

	static int LAST_INDEX_NUMBER = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 배열선언
		Book[] books = new Book[100];

		final String SAVE = "1";
		final String SEARCH_ALL = "2";
		final String SEARCH_BY_TITLE = "3";
		final String DELETE_ALL = "4";
		final String END = "0";
		LAST_INDEX_NUMBER = 5;
		// 샘플데이터
		books[0] = new Book("플러터 Ui 실전", "김근호");
		books[1] = new Book("무궁화 꽃이 피었습니다.", "김진명");
		books[2] = new Book("흐르는 강물처럼.", "파울로코엘료");
		books[3] = new Book("리딩으로 리드하라.", "이지성");
		books[4] = new Book("사피엔스", "유발하라리");

		boolean flag = true;
		while (flag) {

			System.out.println("**메뉴선택**");
			System.out.println("1.저장 2.전체조회 3. 선택조회 4. 전체삭제 0.프로그램 종료");
			String selectedNumber = sc.nextLine();
			System.out.println(selectedNumber);

			if (selectedNumber.equals(SAVE)) {
				System.out.println(">>저장 하기<<");
				save(sc, books);
			} else if (selectedNumber.equals(SEARCH_ALL)) {
				System.out.println(">>전체 조회 하기<<");
				readAll(books);
			} else if (selectedNumber.equals(SEARCH_BY_TITLE)) {
				System.out.println(">>선택 조회 하기<<");
				readByTitle(sc, books);
			} else if (selectedNumber.equals(DELETE_ALL)) {
				System.out.println(">>전체 삭제 하기<<");
				deleteAll(books);
			} else if (selectedNumber.equals(END)) {
				System.out.println(">>프로그램 종료<<");
				flag = false;
			} else {

			}
		}
	}

	public static void readAll(Book[] books) {
		System.out.println("전체 조회 하기>>>>>>");
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				System.out.println(books[i].getTitle() + "," + books[i].getAuthor());
			}

		}
	}

	// 전체삭제하기
	public static void deleteAll(Book[] books) {
		System.out.println(">>>>전체 삭제<<<<");
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				books[i] = null;
			}
		}
	}

	// 저장하기
	public static void save(Scanner sc, Book[] books) {
		System.out.println(">>>>저자하기<<<<");
		System.out.println("책의 제목을 입력 하세요");
		String bookTitle = sc.nextLine();
		System.out.println("책의 저자을 입력 하세요");
		String bookAuthor = sc.nextLine();

		Book book = new Book(bookTitle, bookAuthor);

		if (LAST_INDEX_NUMBER >= books.length) {
			System.out.println("더이상 저장할 공간이 없음");
			return;
		}
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				books[i] = book;
				LAST_INDEX_NUMBER++;
				break;
			}
		}

	}

	public static void readByTitle(Scanner sc, Book[] books) {
		System.out.println("---선택 조회하기---");
		System.out.print("책제목 입력 해줘요 : ");
		String bookTitle = sc.next();
		// 만약 사용자가 입력한 책제목과 배열요소 안에 title 값이 같다면
		// 화면에 책제목 저자 이름을 출력하고 아니라면 해당하는 책이 없습니다. 문구를 출력

		for (int i = 0; i < books.length; i++) {

			if (books[i] != null && bookTitle.equals(books[i].getTitle())) {
				System.out.println(books[i].getAuthor());
				return;
			}

		}
		System.out.println("해당하는 책이 없음");
	}

}
