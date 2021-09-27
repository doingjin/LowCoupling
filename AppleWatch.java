package day62;

public class AppleWatch implements Watch {

	@Override
	public void pay() {
		System.out.println("Pay!");
	}

	@Override
	public void qr() {
		System.out.println("QR Check-In");
	}

	@Override
	public void health() {
		System.out.println("Measure Heartbeat");
	}

}
