package mk.home.dto;

public class CellPhone {
	public String name = "";
	public String phoneNumber = "";
	public String sendName = "";
	public String sendPhoneNumber = "";
	public String message = "";

	public CellPhone(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public void sendInput(String sendName, String sendPhoneNumber, String message) {
		this.sendName = sendName;
		this.sendPhoneNumber = sendPhoneNumber;
		this.message = message;
	}

	public void sendMsgButton() {
		System.out.println(String.format("%s(%s)님이 %s(%s)님에게 문자를 보랬습니다. \n 문자내용 : %s", name, phoneNumber, sendName,
				sendPhoneNumber, message));
	}

	public void call(String sendName, String sendPhoneNumber) {
		this.sendName = sendName;
		this.sendPhoneNumber = sendPhoneNumber;
	}

	public void callButton() {
		System.out.println(String.format("%s(%s)님이 %s(%s)님에게 전화를 겁니다.", name, phoneNumber, sendName, sendPhoneNumber));
	}
}
