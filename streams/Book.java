
public class Book {
	String title;
	String category;
	String author;
	Double price;
	
	Book()
	{
		
	}

	public Book(String title, String category, String author, Double price) {
		super();
		this.title = title;
		this.category = category;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return (this.title).equals(other.title);
	}

	public String toString()
	{
		System.out.format("%-20s %-20s %-10s %s\n",title,category,author,price);
		return "";
	}
	
}
