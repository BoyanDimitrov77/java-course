package Person;

public class Proffesor extends Lecturer implements Homework {
  private String degree;

 
public Proffesor(String first_name,String last_name,int experience,String name_uni,String degree){
	  super(first_name,last_name,experience,name_uni);
	  this.degree=degree;
	  
	  setDegree(degree);
  }

public String getDegree() {
	return degree;
}

public void setDegree(String degree) {
	this.degree = degree;
}

public void doPirnt(){
	System.out.println("Proffessor's degree:"+this.degree);
	System.out.println("Experience:"+super.getExperience());
	
}
public void checkHomework(){
	System.out.println("Proffesor don't check homework");
}

public void conductExamination(){
	System.out.println("Proffesor conduct examination. ");
}
}
