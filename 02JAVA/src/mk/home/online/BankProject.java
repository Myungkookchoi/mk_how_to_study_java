package mk.home.online;

public class BankProject {

	public static final int LOGIN_LOG_OFF = 0; // 로그인 상태 상수
	public static final int LOGIN_NORMAL_USER = 1;// final은 값 변경이 불가능 함
	public static final int LOGIN_ADMIN_USER = 2;

	public static void main(String[] args) {

		String inputId = ""; // 입력받을 로그인 아이디
		String inputPw = ""; // 입력받을 패스워드

		
		// 프로그램에 존재하는 사용자 정보 다음 정보를 값으로 가지는 User클래스를 만들어 보자.
		int loginState = LOGIN_NORMAL_USER; // 현유저 login상태
		String id = "user1"; // 존재하는 로그인 아이디
		String pw = "user1"; // 사용가능한 아이디의 PW
		int account = 0;

		boolean isFlag = true;
		while (isFlag) {
			// 메인 메뉴 1. 일반로그인 2. 관리자 로그인 3. 잘못입력 4. exit
			System.out.println("아이디 pw를 입력 'exit'종료>> ");
			System.out.println("아이디 입력 >> ");
			inputId = new java.util.Scanner(System.in).nextLine();
			System.out.println("pw를 입력 >> ");
			inputPw = new java.util.Scanner(System.in).nextLine();

			if (id.equals(inputId)) {// 로그인 성공
				switch (loginState) {
				case LOGIN_LOG_OFF: // 로그아웃 상태
					System.out.println("사용할 수 없는 ID입니다. - 로그아웃 상태");
					break;
				case LOGIN_NORMAL_USER: // 일반 사용자로 로그인한 상태
					System.out.println("1. 입금 2. 출금 3. 잔액확인 4. 종료");
					break;
				case LOGIN_ADMIN_USER: // 관리자 상태로 로그인한 상태
					System.out.println("1. 계정추가 2. 계정삭제 3. id변경 4. 모든 사용자출력 6. 종료");
					break;
				}
			} else if (inputId.equals("exit")) {// 프로그램 종료
				System.out.println("프로그램 종료");
				isFlag = false;
			} else {// 잘못입력
				System.out.println("잘못 입력 하였습니다.");
			}
		}
	}

}
