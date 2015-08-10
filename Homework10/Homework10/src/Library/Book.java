package Library;

public class Book  extends Library{
	
	private String nameBook;
	private String author;
	private int pages;
	
	public Book(String name,String adress,String collection,String nameBook,String author,int pages){
		super(name,adress,collection);
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
		return (super.getName() + super.getAddres() +super.getCollection() +this.nameBook +this.author+this.pages).hashCode();
	}

   public boolean equals(Object obj){
	   if(obj==null){
		   return false;
	   }
	   if(!(obj instanceof Object)){
		   return false;
	   }
	   
	   Book book=(Book) obj;
	   return this.hashCode()==book.hashCode();
	   
   }
	
	public String toString(){
		return String.format("%s| %s| %s| %s| %s| %d",super.getName(),super.getAddres(),super.getCollection(),this.nameBook,this.author,this.pages);
	
		
	}
}
