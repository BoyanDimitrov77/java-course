package Person;

public abstract class  Person {
	protected String first_name;
	protected String last_name;
	protected int experience;
	protected static int counter=0;
	
	
	
	public Person(){
		
	}

	public Person(String first_name,String last_name,int experience ){
		this.first_name=first_name;
		this.last_name=last_name;
		this.experience=experience;
		
		
		setFirst_name(first_name);
		setLast_name(last_name);
		setExperience(experience);
	}
	
	public String getFirst_name() {
		setCounter(getCounter()+1);
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Person.counter = counter;
		
	}

	
	
	
}
