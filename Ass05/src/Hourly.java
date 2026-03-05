public class Hourly extends Employee implements PayCash {

	private double rate;
	private double hours;

	public Hourly() {
		super();
	}

	public Hourly(String name, double rate, double hours) {
		super(name);
		this.rate = rate;
		this.hours = hours;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public String toString() {
		return super.toString() + " Hourly [rate=" + rate + ", hours=" + hours + "]";
	}

	public double payment() {
		return rate * hours;
	}

	public void printPayCash() {
		System.out.printf("จ่ายเงินสด %,.2f บาท\n", payment());
	}
}
