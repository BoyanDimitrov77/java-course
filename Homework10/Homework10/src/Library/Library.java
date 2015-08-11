package Library;
import java.util.ArrayList;


public class Library {
	private String name;
	private String addres;
	private ArrayList<Book> book=new ArrayList<Book>();

	public Library(){
    	super();
    }
	
	public Library(String name,String adress,ArrayList<Book> book){
		this.name=name;
		this.addres=adress;
		this.book=book;
	
		setName(name);
		setAddres(adress);
		setBook(book);
	}
	
	public  String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	 public ArrayList<Book> getBook() {
			return book;
	}

	public void setBook(ArrayList<Book> book) {
		this.book = book;
	}

	public String toString(){
		return String.format("%s | %s", this.name,this.addres);	
				}

	
	public void AddBook(String name,String author,int pages){
		Book bookAdd=new Book(name,author,pages);
		book.add(bookAdd);
		
		
	}
	public void removeBook(String removeBook){
		for(Book searchBooks:book){
			if(searchBooks.getNameBook().equals(removeBook)){
				book.remove(searchBooks);
			}
			if(book.isEmpty()){
				System.out.println("Library is empty");
				break;
			}
				
			
		}
		System.out.println(book);
		
	}
	
}
