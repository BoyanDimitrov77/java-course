package Company;


public class Company {

	private String name;
	private int count;
	
	public Company(String name,int count){
		 this.name=name;
		 this.count=count;
		 
		 setName(name);
		 setCount(count);
		 
	 }   
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	public String toString(){
		return String.format("%s %d",name,count);
	}
	
 
}

