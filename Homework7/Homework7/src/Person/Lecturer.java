package Person;

public class Lecturer extends Person implements Homework {

	private String name_uni;
	private final int max_lecturе=10;
	
	
	


	public Lecturer(){
		super();
	}
	
	public Lecturer(String first_name,String last_name,int experience,String name_uni){
		super(first_name,last_name,experience);
		this.name_uni=name_uni;
		
		setName_uni(name_uni);
		
	}
	
	public String getName_uni() {
		return name_uni;
	}

	public void setName_uni(String name_uni) {
		this.name_uni = name_uni;
	}
	
	public int getMax_lecturе() {
		return max_lecturе;
	}
	
	public void checkHomework(){
		System.out.println("Lecture check homework");
	
	}
	
	public void doExcercises(String first_sub,String third_sub){
		System.out.println("Lecturer  has excercise "+first_sub +" and " + third_sub);
	}
	public void doExcercises(String first_sub){
		System.out.println("Lecturer has exercise at " + first_sub);
	}

	public void doExcercises(String first_sub,String second_sub,String third_sub){
		System.out.println("Lecturer  has excercise  at "+first_sub +", " + second_sub+"and "+third_sub);
	}
	public void SayGoodDay(){
		System.out.println("Lecturer said:\"Good day!\"");
	}
	
	

	
}
