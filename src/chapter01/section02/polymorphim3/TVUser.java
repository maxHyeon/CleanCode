package chapter01.section02.polymorphim3;

public class TVUser {
// polymorphism = extends + overriding + changeShape 
	public static void main(String[] args) {
		TVFactory factory = new TVFactory();
		
		TV tv = factory.getTv(args[0]);
		tv.powerOff();
		tv.powerOn();
		tv.volumeDown();
		tv.volumeUp();
	}
}
