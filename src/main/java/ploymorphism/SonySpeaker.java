package ploymorphism;

public class SonySpeaker implements Speaker {
	public SonySpeaker() {
		System.out.println("====> SonySpeaker ��ü����");
	}
	public void volumUp() {
		System.out.println("SonySpeaker -- �Ҹ��ø���");
	}
	public void volumDown() {
		System.out.println("SonySpeaker -- �Ҹ�������");
	}
}
