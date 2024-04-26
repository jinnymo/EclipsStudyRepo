package useful;

public class EBook {

	private int bookTypeId;
	private String title;
	private String author;

	public EBook(int bookTypeId, String title, String authot) {
		this.bookTypeId = bookTypeId;
		this.title = title;
		this.author = authot;
	}

	@Override
	public String toString() {

		return bookTypeId + "," + title + "," + author;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof EBook) {
			//1.이북 클래스의 인스턴스가 맞다면
			EBook tbook = (EBook)obj;
			//2, 이북의 제목과 저자의 이름이 같다면 true를 반한 시켜라
			if (this.title.equals(tbook.title)) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}

	public static void main(String[] args) {
	
		EBook book1 = new EBook(1, "홍길동전", "허균");
		EBook book2 = new EBook(1, "홍길동전", "허균");
		System.out.println("----------------------------------");
		
		boolean result1 = book1 == book2;
		System.out.println(result1);
		boolean result2 = book1.equals(book2);
		System.out.println(result2);
	}

}
