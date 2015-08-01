package Person;

public class CollegeTeacher extends Teacher implements Homework {
	private String nameOfColleage;
	
	

	public CollegeTeacher(String first_name,String last_name,int experience,String nameSubject,String nameOfColleage){
		super(first_name,last_name,experience,nameSubject);
		this.nameOfColleage=nameOfColleage;
		
		setNameOfColleage(nameOfColleage);
		
	}

	public String getNameOfColleage() {
		return nameOfColleage;
	}

	public void setNameOfColleage(String nameOfColleage) {
		this.nameOfColleage = nameOfColleage;
	}
	
	public void checkHomework(){
		
		System.out.println("Teacher check homework.");
		
	}
}
