package day62;

public class GalaxyWatch implements Watch{

	@Override
	public void pay() {
		System.out.println("결제!");
	}

	@Override
	public void qr() {
		System.out.println("QR 체크인!");
	}

	@Override
	public void health() {
		System.out.println("심박수 확인!");
	}

}
