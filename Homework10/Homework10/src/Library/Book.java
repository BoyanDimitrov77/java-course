package Library;

public class Book {
	
	private String nameBook;
	private String author;
	private int pages;
	
	public Book(){
		super();
	}
	
	public Book(String nameBook,String author,int pages){
		
		this.nameBook=nameBook;
		this.author=author;
		this.pages=pages;
	}
	
	public String getNameBook() {
		return nameBook;
	}
	public void setNameBook(String nameBook) {
		this.nameBook = nameBook;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	@Override
	public int hashCode(){
		return (this.nameBook +this.author+this.pages).hashCode();
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
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (nameBook == null) {
			if (other.nameBook != null)
				return false;
		} else if (!nameBook.equals(other.nameBook))
			return false;
		if (pages != other.pages)
			return false;
		return true;
	}
	
	public String toString(){
		return String.format(" %s| %s| %d",this.nameBook,this.author,this.pages);
	
		
	}
}
