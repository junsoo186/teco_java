package useful;

public class EBook2 {

	private int bookTypeId;
	private String title;
	private String author;

	public EBook2(int bookTyId, String title, String author) {
		this.bookTypeId = bookTyId;
		this.title = title;
		this.author = author;
	}

// Object 클래스에 있는 메서드를 재정의
	@Override
	public String toString() {
		return bookTypeId + ", " + title + ", " + author;
	}
	


	// Object 클래스에 있는 메서드를 재정의
	public boolean equals(EBook2 ebook) {

		if (this.title.equals(ebook.title)) {
			return true;
		} else {
			return false;
		}
	}

// 메인 시작
	public static void main(String[] args) {
		EBook2 book1 = new EBook2(1, "홍길동전", "허균");
		EBook2 book2 = new EBook2(1, "홍길동전", "허균");
		Book book = new Book("홍길동전", "허균");
		System.out.println("=======================================================");

		boolean result1 = book1 == book2;
		System.out.println("result : " + result1);

		boolean result2 = book1.equals(book);
		System.out.println("result : " + result2);
	}
}
