package day62;

public class User {

	public static void main(String[] args) {
		
		BeanFactory bf=new BeanFactory();
		Watch watch=(Watch)bf.getBean(args[0]);
		watch.pay();
		watch.qr();
		watch.health();
		
	
	}
}
