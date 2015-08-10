package Library;

public class Library {
	private String name;
	private String addres;
	private String collection;
	
	public Library(String name,String adress,String collection){
		this.name=name;
		this.addres=adress;
		this.collection=collection;
	}
	
	public String getName() {
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
	public String getCollection() {
		return collection;
	}
	public void setCollection(String collection) {
		this.collection = collection;
	}

}
