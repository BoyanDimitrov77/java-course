package Employee;

public class Policeman extends Employee {
	private String rang;

	public Policeman(int work_hours, float salary, String rang) {
		super(work_hours, salary);

		setRang(rang);

	}

	public void setRang(String rang) {
		this.rang = rang;
	}

	public String getRang() {
		return rang;
	}

	public void sayRang() {
		System.out.println("Piceman's rang is " + this.rang);

	}
}