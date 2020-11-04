package guru.springframework.spring5webapp;

import java.util.Set;

public class Book {

	private String title;
	private String isdn;
	private Set<Author> authors;
	

	public Book() {
		super();
	}

	public Book(String title, String isdn, Set<Author> authors) {
		super();
		this.title = title;
		this.isdn = isdn;
		this.authors = authors;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsdn() {
		return isdn;
	}

	public void setIsdn(String isdn) {
		this.isdn = isdn;
	}

	public Set<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}

}
