package Employee;

public class Employee {
	protected int work_hours;
	protected float salary;

	public Employee(int work_hours, float salary) {
		this.work_hours = work_hours;
		this.salary = salary;

		setWork_Hours(work_hours);
		setSalary(salary);
	}

	public int getWork_Hours() {
		return work_hours;
	}

	public void setWork_Hours(int work_hours) {
		this.work_hours = work_hours;

	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public void doPrint() {
		System.out.println("Hours of work per month " + this.work_hours);
		System.out.println("Salary " + this.salary);

	}
}
