public class SmartPhoneMain {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("1234567890");
		sp.call();
		sp.redial();
		sp.photo();
		sp.video();
		sp.play();
		sp.stop();
	}
}
