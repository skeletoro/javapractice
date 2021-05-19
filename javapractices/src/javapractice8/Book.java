package javapractice8;

public class Book {
	private static String title = "animal farm";
	private String genre = "fiction";
	private String publishDate;
	
	public Book (String title, String genre, String publishDate) {
		this.setTitle(title);
		this.setGenre(genre);
		this.setPublishDate(publishDate);
	}

	public static String getTitle() {
		return title;
	}

	public static void setTitle(String title) {
		Book.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

}
