package day62;

public class BeanFactory {
	public Object getBean(String beanName) {
		if(beanName.equals("Apple")) {
			return new AppleWatch();
		}
		else if(beanName.equals("Galaxy")) {
			return new GalaxyWatch();
		}
		return null;
	}

}
