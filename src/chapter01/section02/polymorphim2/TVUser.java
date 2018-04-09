package chapter01.section02.polymorphim2;

public class TVUser {
// polymorphism = extends + overriding + changeShape 
	public static void main(String[] args) {
		TV tv = new SamsungTV();
		tv.powerOff();
		tv.powerOn();
		tv.volumeDown();
		tv.volumeUp();
	}
}
