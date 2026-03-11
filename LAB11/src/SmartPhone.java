public class SmartPhone extends Phone implements Camera, Player {

	public SmartPhone(String number) {
		super(number);
	}

	public void redial() {
		System.out.println("Redial " + getNumber());
	}
	
	public void photo() {
		System.out.println("Take a photo");
	}
	
	public void video() {
		System.out.println("Record a video");
	}
	
	public void play() {
		System.out.println("Play Music");
	}
	
	public void stop() {
		System.out.println("Stop Music");
	}
}
