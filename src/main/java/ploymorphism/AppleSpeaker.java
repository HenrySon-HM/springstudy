package ploymorphism;

public class AppleSpeaker implements Speaker {
	public AppleSpeaker() {
		System.out.println("====> AppleSpeaker ��ü����");
	}
	public void volumUp() {
		System.out.println("AppleSpeaker -- �Ҹ��ø���");
	}
	public void volumDown() {
		System.out.println("AppleSpeaker -- �Ҹ�������");
	}
}
