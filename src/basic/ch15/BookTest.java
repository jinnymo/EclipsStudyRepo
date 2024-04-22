package basic.ch15;

public class BookTest {

	public static void main(String[] args) {

		//배열이란 - 연관된 데이터를 하나의 변수의 통으로 관리하소 싶다면 - 자료구조
		
		Book[] books = new Book[10];
		
		books[0] = new Book("플러터 Ui 실전","김근호");
		books[1] = new Book("무궁화 꽃이 피었습니다.","김진명");
		books[2] = new Book("흐르는 강물처럼.","파울로코엘료");
		books[3] = new Book("리딩으로 리드하라.","이지성");
		books[4] = new Book("사피엔스.","유발하라리");
		books[9] = new Book("d.","d");
		
		//배열은 반복문과 함께 많이 활용된다.
		//배열에 크기와 요소에 크기는 꼭동일한것은 아니다.
		
		//books[3] --> Book
		//System.out.println(books[3].getTitle()); 
		//System.out.println(books[3].getAuthor()); 
		
		for (int i = 0; i < books.length; i++) {
			
			
			if(books[i] != null) {
			System.out.println(books[i].getTitle());
			System.out.println(books[i].getAuthor());
			System.out.println("-----------------");
			}
			
		}
	}

}
