package mk.home.online;

import java.util.Arrays;
import java.util.Scanner;

class User {// 이미등록된 사용자 정보를 담는 객체
	public static final int LOGIN_LOG_OFF = 0; // 로그인 상태 상수
	public static final int LOGIN_NORMAL_USER = 1;// final은 값 변경이 불가능 함
	public static final int LOGIN_ADMIN_USER = 2;

	// 프로그램에 존재하는 사용자 정보 다음 정보를 값으로 가지는 User클래스를 만들어 보자.
	public int loginState = LOGIN_NORMAL_USER; // 현유저 login상태
	public String id = "user1"; // 존재하는 로그인 아이디
	public String pw = "user1"; // 사용가능한 아이디의 PW
	public int account = 0;

	// 생성자 추가
	public User() {

	}

	public User(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	public User(int loginState, String id, String pw, int account) {
		this.loginState = loginState;
		this.id = id;
		this.pw = pw;
		this.account = account;
	}

	public String toString() {
		return "User [loginState=" + loginState + ", id=" + id + ", pw=" + pw + ", account=" + account + "]";
	}

}

public class BankProject2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int loginIndex = 0;

		User u = new User();
		User[] userArray = new User[10];
		int userCount = 0;
		userArray[userCount++] = new User(User.LOGIN_NORMAL_USER, "user1", "user1", 0);
		userArray[userCount++] = new User(User.LOGIN_NORMAL_USER, "user2", "user2", 0);
		userArray[userCount++] = new User(User.LOGIN_NORMAL_USER, "user3", "user3", 0);
		userArray[userCount++] = new User(User.LOGIN_ADMIN_USER, "admin1", "admin1", 0);
		userArray[userCount++] = new User(User.LOGIN_ADMIN_USER, "admin2", "admin2", 0);

		String inputId = ""; // 입력받을 로그인 아이디
		String inputPw = ""; // 입력받을 패스워드

		boolean isFlag = true;
		while (isFlag) {
			System.out.println("아이디 pw를 입력 'exit'종료>> ");
			System.out.println("아이디 입력 >> ");
			inputId = new java.util.Scanner(System.in).nextLine();
			System.out.println("pw를 입력 >> ");
			inputPw = new java.util.Scanner(System.in).nextLine();

			User nowUser = null;
			for (int i = 0; i < userCount; i++) {
				if (userArray[i].id.equals(inputId) && userArray[i].pw.equals(inputPw)) {
					nowUser = userArray[i];
					loginIndex = i;
				}
			}

			if (nowUser != null) {// 로그인 성공
				switch (nowUser.loginState) {
				case User.LOGIN_LOG_OFF: // 로그아웃 상태
					System.out.println("사용할 수 없는 ID입니다. - 로그아웃 상태");
					break;
				case User.LOGIN_NORMAL_USER: // 일반 사용자로 로그인한 상태
					boolean isUserLogin = true;
					while (isUserLogin) {
						System.out.println("사용자 : " + nowUser.id);
						System.out.println("1. 입금 2. 출금 3. 잔액확인 4. 종료");
						String input1 = sc.nextLine();
						if (input1.equals("1")) {
							System.out.println("입금 할 금액 >>");
							int input2 = Integer.parseInt(sc.nextLine());
							nowUser.account = nowUser.account + input2;
						} else if (input1.equals("2")) {
							System.out.println("출금 할 금액 >>");
							int input2 = Integer.parseInt(sc.nextLine());
							if (nowUser.account < input2) {
								System.out.println("잔액 부족");
							} else {
								nowUser.account = nowUser.account - input2;
							}
						} else if (input1.equals("3")) {
							System.out.print("현재 잔액 >>");
							System.out.println(nowUser.account);
						} else if (input1.equals("4")) {
							System.out.println("종료");
							isUserLogin = false;
							break;
						} else {
							System.out.println("잘못 입력");
						}
					}
					// nowUser.account이용해서 만들어 보자.

					break;
				case User.LOGIN_ADMIN_USER: // 관리자 상태로 로그인한 상태
					boolean isAdminLogin = true;
					while (isAdminLogin) {
						System.out.println("사용자 : " + nowUser.id);
						System.out.println("1. 계정추가 2. 계정삭제 3. id변경 4. 모든 사용자출력 6. 종료 >>");
						String str = new java.util.Scanner(System.in).nextLine();
						switch (str) {
						case "1":
							User u = new User();
							System.out.println("1. 일반사용자 계정 추가 2. 관리자 계정 추가 >> ");
							str = sc.nextLine();
							if (str.equals("1")) {
								u.loginState = User.LOGIN_NORMAL_USER;
							} else {
								u.loginState = User.LOGIN_ADMIN_USER;
							}
							System.out.println("ID >>");
							u.id = sc.nextLine();
							System.out.println("PW >>");
							u.pw = sc.nextLine();
							u.account = 0;
							userArray[userCount++] = u;
							break;
						case "2":
							User findUser = null;
							System.out.println("ID >>");
							String findId = sc.nextLine();
							System.out.println("PW >>");
							String findPw = sc.nextLine();
							for (int i = 0; i < userCount; i++) {
								if (userArray[i].id.equals(findId) && userArray[i].pw.equals(findPw)) {
									findUser = userArray[i];
									for (int j = i; j < userCount - 1; j++) {
										userArray[j] = userArray[j + 1];
									}
									userCount--;
									break;
								}
							}
							if (findUser != null) {
								System.out.println("다음 데이터를 삭제완료");
								System.out.println(findUser);
							} else {
								System.out.println("데이터를 찾이 못함");
							}
							break;
						case "3":
							System.out.println("ID >>");
							String changeId = sc.nextLine();
							System.out.println("PW >>");
							String changePw = sc.nextLine();
							System.out.println("변경할 ID >>");
							String newId = sc.nextLine();
							for (int i = 0; i < userCount; i++) {
								if (userArray[i].id.equals(changeId) && userArray[i].pw.equals(changePw)) {
									userArray[i].id = newId;
									break;
								}
							}
							System.out.println("ID가 변경되었습니다.");
							break;
						case "4":
							System.out.println("사용자 정보출력 >>");
							for (int i = 0; i < userCount; i++) {
								System.out.println(userArray[i]);
							}
							break;
						default:
							System.out.println("종료");
							isAdminLogin = false;
						}
					}
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
