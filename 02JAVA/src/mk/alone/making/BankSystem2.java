package mk.alone.making;

import java.util.*;

public class BankSystem2 {
	public static Scanner sc = new Scanner(System.in);
	public static String id[] = new String[100];
	public static String pw[] = new String[100];
	public static double account[] = new double[100];
	public static int totalUserCount = 0;

	public static String inputId = null;
	public static String inputPw = null;
	public static double inputAccount = 0;

	public static final int LOGIN_LOG_OFF = 0;
	public static final int LOGIN_NORMAL_USER = 1;
	public static final int LOGIN_ADMIN_USER = 2;

	public static int loginState = BankSystem2.LOGIN_LOG_OFF;
	public static int loginIndex = -1;

	public static String adminId = "admin";
	public static String adminPw = "admin";

	public static void init() {
		id[0] = "user1";
		id[1] = "user2";
		id[2] = "user3";

		pw[0] = "user1";
		pw[1] = "user2";
		pw[2] = "user3";

		account[0] = 1000;
		account[1] = 2000;
		account[2] = 3000;

		totalUserCount = 3;

	}

	public static void login() {
		login: while (loginState == BankSystem2.LOGIN_LOG_OFF) {
			System.out.println("ID와 PW를 입력하세요.");
			System.out.println("id >>");
			inputId = sc.nextLine();
			System.out.println("pw >>");
			inputPw = sc.nextLine();

			// Admin login
			if (inputId.equals(adminId)) {
				if (inputPw.equals(adminPw)) {
					loginState = BankSystem2.LOGIN_ADMIN_USER;
					System.out.println("관리자로 로그인 하였습니다.");
					adminMenu();
					break;
				} else {
					System.out.println("아이디 혹은 비밀번호가 잘못 되었습니다.");
				}
			} else {
				// User login
				for (int i = 0; i < totalUserCount; i++) {
					if (id[i].equals(inputId)) {
						if (pw[i].equals(inputPw)) {
							System.out.println(id[i] + "님 로그인 하셨습니다.");
							loginState = BankSystem2.LOGIN_NORMAL_USER;
							loginIndex = i;
							userMenu();
							continue login;
						} else {
							System.out.println("아이디 혹은 비밀번호가 잘못 되었습니다.");
							continue login;
						}
					}
				}
			}
			System.out.println(inputId + "는 존재하지 않습니다.");
			continue;
		}
	}

	public static void userMenu() {
		boolean isUserMenu = true;
		while (isUserMenu) {
			System.out.println("1.입금 2.출금 3.확인 4.종료 입력 >>");
			String input1 = sc.nextLine();
			if (input1.equals("1")) {
				System.out.println("입금액 입력 >>");
				inputAccount = Double.parseDouble(sc.nextLine());
				account[loginIndex] += inputAccount;
				System.out.println(id[loginIndex] + "님의 잔액은:" + account[loginIndex]);
			} else if (input1.equals("2")) {
				System.out.println("출금액 입력 >>");
				inputAccount = Double.parseDouble(sc.nextLine());
				account[loginIndex] -= inputAccount;
			} else if (input1.equals("3")) {
				System.out.println("확인");
				System.out.println(id[loginIndex] + "님의 잔액은:" + account[loginIndex]);
			} else if (input1.equals("4")) {
				System.out.println("종료");
				loginState = BankSystem2.LOGIN_LOG_OFF;
				isUserMenu = false;
			}
		}
	}

	public static void adminMenu() {
		boolean isAdminMenu = true;
		while (isAdminMenu) {
			System.out.println("관리자");
			System.out.println("1.계정추가 2.계정삭제 3.id변경 4.모든사용자출력 6.종료");
			String input1 = sc.nextLine();
			if (input1.equals("1")) {
				totalUserCount += 1;
				for (int i = 0; i < totalUserCount; i++) {
					System.out.println(id[i]);
					if (id[i] == (null)) {
						System.out.println("계정추가");
						System.out.println("ID >>");
						inputId = sc.nextLine();
						id[i] = inputId;
						System.out.println("PW >>");
						inputPw = sc.nextLine();
						pw[i] = inputPw;
					} else {
						continue;
					}
				}
			} else if (input1.equals("2")) {
				System.out.println("계정삭제. 종료는 0.");
				System.out.println("삭제 할 ID >>");
				inputId = sc.nextLine();
				System.out.println("PW >>");
				inputPw = sc.nextLine();
				for (int i = 0; i < totalUserCount; i++) {
					if (id[i].equals(inputId)) {
						if (pw[i].equals(inputPw)) {
							System.out.println(inputId + "가 삭제되었습니다.");
							id[i] = null;
							pw[i] = null;
							account[i] = 0;
							id[i] = id[i + 1];
							pw[i] = id[i + 1];
							account[i] = account[i + 1];
							totalUserCount--;
							break;
						} else {
							System.out.println("아이디 혹은 비밀번호가 잘못 되었습니다.");
							continue;
						}
					}
				}
//				for (int i = 0; i < totalUserCount + 1; i++) {
//					id[i] = id[i + 1];
//					pw[i] = id[i + 1];
//					account[i] = account[i + 1];
//				}
				continue;
			} else if (input1.equals("3")) {
				System.out.println("id변경");

			} else if (input1.equals("4")) {
				System.out.println("모든사용자출력");
				for (int i = 0; i < totalUserCount; i++) {
					System.out
							.println((i + 1) + "번째 " + "id >>" + id[i] + " pw >>" + pw[i] + " account >>" + account[i]);
				}
			} else if (input1.equals("6")) {
				System.out.println("종료");
				loginState = BankSystem2.LOGIN_LOG_OFF;
				isAdminMenu = false;
				login();
			}
		}
	}

	public static void playBank() {

	}

	public static void main(String[] args) {
		init();
		login();
	}
}
