package chapter01.section02.polymorphim3;

public class TVFactory {
	public TV getTv(String name) {
		if(name.equals("lg")){
			return new LgTV();
		}else if(name.equals("samaung")){
			return new SamsungTV();
		}
		return null;
	}
}
