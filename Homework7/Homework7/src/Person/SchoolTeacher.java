package Person;

public class SchoolTeacher extends Teacher implements Homework {
private String[] clas=new String[5];  

public SchoolTeacher(String first_name,String last_name,int experience,String nameSubject){
	super(first_name,last_name,experience,nameSubject);
	
}
	
public void doPrintClass(){
	System.out.print("Class:");
	clas[0]="1A";
	clas[1]="2A";
	clas[2]="3A";
	clas[3]="4A";
	clas[4]="5A";
	
	for(int i=0;i<clas.length;i++){
		System.out.print(","+clas[i]);
		
	}
	System.out.println();
	
	
}

  

public void checkHomework(){
	System.out.println("Teacher check homework.");
	
}
public void entertainKids(){
	System.out.println("School teacher entertain kids.");
}
}
