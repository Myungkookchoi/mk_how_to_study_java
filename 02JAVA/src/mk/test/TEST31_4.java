package mk.test;

class CellPhone {
	public String name = "";
	public String phoneNumber = "";
	public String sendName = "";
	public String sendPhoneNumber = "";
	public String text = "";

	public CellPhone(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public void sendInput(String sendName, String sendPhoneNumber, String text) {
		this.sendName = sendName;
		this.sendPhoneNumber = sendPhoneNumber;
		this.text = text;
	}

	public void sendMsgButton() {
		System.out.println(
				String.format("%s(%s)님이 %s(%s)님에게 %s 문자를 보냈습니다.", name, phoneNumber, sendName, sendPhoneNumber, text));
	}

	public void sendInput(String sendName, String sendPhoneNumber) {
		this.sendName = sendName;
		this.sendPhoneNumber = sendPhoneNumber;
	}

	public void sendButton() {
		System.out.println(String.format("%s(%s)님이 %s(%s)님에게 전화를 합니다.", name, phoneNumber, sendName, sendPhoneNumber));
	}
}

public class TEST31_4 {
	public static void main(String[] args) {
		CellPhone phone = new CellPhone("홍길동", "010-1111-1111");
		phone.sendInput("홍길남", "010-2222-2222", "하이");
		phone.sendMsgButton();
		phone.sendInput("홍길남", "010-2222-2222");
		phone.sendButton();
	}
}
