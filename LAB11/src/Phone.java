public abstract class Phone {
	
	private String number;

	public Phone() {
		super();
		this.number = "0000000000";
	}

	public Phone(String number) {
		super();
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public boolean equals(Object obj) {
		Phone other = (Phone) obj;
		return number == other.getNumber();
	}

	public String toString() {
		return "Phone [number=" + number + "]";
	}

	public void call() {
		System.out.println("Call " + number);
	}
	
	// Task 2
	public abstract void redial();
}