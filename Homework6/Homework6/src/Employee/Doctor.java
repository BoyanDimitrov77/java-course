package Employee;

public class Doctor extends Employee {

	private int full_time_duty_month;
	private int night_duty_month;

	public Doctor(int work_hours, float salary, int full_time_duty_month, int night_duty_month) {
		super(work_hours, salary);

		setFullTime(full_time_duty_month);
		setNightDuty(night_duty_month);
	}

	public int getFullTime() {
		return full_time_duty_month;
	}

	public void setFullTime(int full_time_duty_month) {
		this.full_time_duty_month = full_time_duty_month;
	}

	public int getNightDuty() {
		return night_duty_month;
	}

	public void setNightDuty(int night_duty_month) {
		this.night_duty_month = night_duty_month;
	}

	public void printDuty() {
		System.out.println("Doctor-full time duty:" + this.full_time_duty_month);
		System.out.println("Doctor-night duty:" + this.night_duty_month);

	}
}
