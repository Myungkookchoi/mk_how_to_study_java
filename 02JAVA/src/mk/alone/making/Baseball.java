package mk.alone.making;

import java.util.Arrays;
import java.util.Scanner;

public class Baseball {

	public static void home(int cho) {
		int home[] = new int[3];
		int totalPoint = 0;
//		home[cho-1] = (point/4);

		while (cho < 3) {
			Scanner sc = new Scanner(System.in);
			System.out.println("=========" + cho + "회초 시작=========");

			int out = 0;
			int point = 0;
			int pmenu = 0;
			int hmenu = 0;

			while (out < 3) {

				int prandom = 0;
				int hrandom = 0;

				for (; pmenu < 1;) {// 투수 파트

					System.out.println(cho + "회초");
					System.out.println("				=============");
					System.out.println("				|1.   던짐   |");
					System.out.println("				|2. 한 턴 쉬기|");
					System.out.println("				|3.   사구   |");
					System.out.println("				=============");
					System.out.println("현재점수 : " + (point / 4));
					System.out.println("현재 아웃 : " + out);
					int pitcher = sc.nextInt();
					if (pitcher == 1) {
						System.out.println("== 투수가 공을 던졌습니다. ==");
						prandom = prandom + (int) (Math.random() * 20 + 1);
						pmenu++;
					} else if (pitcher == 2) {
						continue;
					} else if (pitcher == 3) {
						System.out.println("== 투수가 사구를 던졌습니다.=="); // while문 처음으로 돌아가기
						point++;
						continue;
					} else {
						System.out.println("Error");
						continue;
					}
				}

				for (; hmenu < 1;) {// 타자 파트
					System.out.println(cho + "회초");
					System.out.println("				=============");
					System.out.println("				|1.   치기   |");
					System.out.println("				|2. 한 턴 쉬기|");
					System.out.println("				|3.   포기   |");
					System.out.println("				=============");
					System.out.println("현재점수 : " + (point / 4));
					System.out.println("현재 아웃 : " + out);
					int hitter = sc.nextInt();
					if (hitter == 1) {
						hrandom = hrandom + (int) (Math.random() * 20 + 1);
						if (prandom > hrandom) {
							System.out.println("아웃!");
							System.out.println("투수 : " + prandom);
							System.out.println("타자 : " + hrandom);
							out++;
							hmenu++;
						} else if (prandom < hrandom) {
							System.out.println("투수 : " + prandom);
							System.out.println("타자 : " + hrandom);
							int hitRandom = (int) (Math.random() * 20) + 1;
							System.out.println("타자 : " + hitRandom);
							if (hitRandom < 2) {
								System.out.println("!!!!!!!!!!!홈런!!!!!!!!!!!");
								point += 4;
							} else if (hitRandom < 4) {
								System.out.println("!!!!3루타!!!!");
								point += 3;
							} else if (hitRandom < 9) {
								System.out.println("!!2루타!!");
								point += 2;
							} else if (hitRandom < 19) {
								System.out.println("안타!");
								point += 1;
							} else {
								System.out.println("플라잉 아웃!");
								out++;
							}
							hmenu++;
						} else {
							System.out.println("재 승부");
							hmenu++;
							continue;
						}
					} else if (hitter == 2) {
						continue;
					} else if (hitter == 3) {
						System.out.println("==타자가 포기 하였습니다.==");
						out++;
						break;
					} else {
						System.out.println("Error");
						continue;
					}
				}
				prandom = 0;
				hrandom = 0;
				pmenu = 0;
				hmenu = 0;

				if (out == 3) {

					System.out.println("3아웃 체인지");
					System.out.println(cho + "회초 종료!");
					away(cho);
				}
			}
			sc.close();

		}

	}

	public static void away(int cho) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=========" + cho + "회말 시작=========");

		int out = 0;
		int point = 0;
		int pmenu = 0;
		int hmenu = 0;

		while (out < 3) {

			int prandom = 0;
			int hrandom = 0;

			for (; pmenu < 1;) {// 투수 파트

				System.out.println(cho + "회말");
				System.out.println("				=============");
				System.out.println("				|1.   던짐   |");
				System.out.println("				|2. 한 턴 쉬기|");
				System.out.println("				|3.   사구   |");
				System.out.println("				=============");
				System.out.println("현재점수 : " + (point / 4));
				System.out.println("현재 아웃 : " + out);
				int pitcher = sc.nextInt();
				if (pitcher == 1) {
					System.out.println("== 투수가 공을 던졌습니다. ==");
					prandom = prandom + (int) (Math.random() * 20 + 1);
					pmenu++;
				} else if (pitcher == 2) {
					continue;
				} else if (pitcher == 3) {
					System.out.println("== 투수가 사구를 던졌습니다.=="); // while문 처음으로 돌아가기
					point++;
					continue;
				} else {
					System.out.println("Error");
					continue;
				}
			}

			for (; hmenu < 1;) {// 타자 파트
				System.out.println(cho + "회말");
				System.out.println("				=============");
				System.out.println("				|1.   치기   |");
				System.out.println("				|2. 한 턴 쉬기|");
				System.out.println("				|3.   포기   |");
				System.out.println("				=============");
				System.out.println("현재점수 : " + (point / 4));
				System.out.println("현재 아웃 : " + out);
				int hitter = sc.nextInt();
				if (hitter == 1) {
					hrandom = hrandom + (int) (Math.random() * 20 + 1);
					if (prandom > hrandom) {
						System.out.println("아웃!");
						System.out.println("투수 : " + prandom);
						System.out.println("타자 : " + hrandom);
						out++;
						hmenu++;
					} else if (prandom < hrandom) {
						System.out.println("투수 : " + prandom);
						System.out.println("타자 : " + hrandom);
						int hitRandom = (int) (Math.random() * 20) + 1;
						System.out.println("타자 : " + hitRandom);
						if (hitRandom < 2) {
							System.out.println("!!!!!!!!!!!홈런!!!!!!!!!!!");
							point += 4;
						} else if (hitRandom < 4) {
							System.out.println("!!!!3루타!!!!");
							point += 3;
						} else if (hitRandom < 9) {
							System.out.println("!!2루타!!");
							point += 2;
						} else if (hitRandom < 19) {
							System.out.println("안타!");
							point += 1;
						} else {
							System.out.println("플라잉 아웃!");
						}
						hmenu++;
					} else {
						System.out.println("재 승부");
						hmenu++;
						continue;
					}
				} else if (hitter == 2) {
					continue;
				} else if (hitter == 3) {
					System.out.println("==타자가 포기 하였습니다.==");
					out++;
					break;
				} else {
					System.out.println("Error");
					continue;
				}
			}
			prandom = 0;
			hrandom = 0;
			pmenu = 0;
			hmenu = 0;

			if (out == 3) {
				System.out.println("3아웃 체인지");
				System.out.println(cho + "회말 종료!");
				apoint(cho, (point / 4));
				cho++;
				home(cho);

			}

		}

		sc.close();

	}

	public static void hpoint() {
		int home[] = new int[3];
		int retrun = 0;
		System.out.print("Home TEAM : ");
		System.out.println(Arrays.toString(home)); // [1, 2, 3]
		for (int count = 0; count < 3; count++) {
			retrun = retrun + home[count];
		}
	}

	public static void apoint(int awayround, int awayp) {
		int away[] = new int[3];
		int retrun = 0;
		away[awayround - 1] = awayp;
		System.out.print("Away TEAM : ");
		System.out.println(Arrays.toString(away)); // [1, 2, 3]

		for (int count = 0; count < 3; count++) {
			retrun = retrun + away[count];
		}
	}

	public static void ending(int h, int a) {

		System.out.println("게임 끝");
		System.out.println("Home TEAM : ");
		System.out.println("Away TEAM : ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("				=============");
		System.out.println("				|1.  게임시작 |");
		System.out.println("				|2.  게임규칙 |");
		System.out.println("				|3.   종료   |");
		System.out.println("				=============");
		int input = sc.nextInt();
		if (input == 1) {
			home(1);
		} else if (input == 2) {
			System.out.println("설명 쓰기 귀찮음 그냥 해.(나중에 추가)");
		} else {
			System.out.println("종료 합니다.");
		}
		sc.close();

	}
}

// 게임 시작을 하면 home method로 넘어간다.		//구연 완
// 게임 메뉴 투수 (1. 던지기 2. 숨고르기(구연은 나중에) 3. 사구(상대에게 1점추가)) 	// 구연 완
// 게임 메뉴 타자 (1. 치기   2. 숨고르기(구연은 나중에) 3. 아웃당하기(아웃+1))		// 구연 완
// 투수 > 타자 = 아웃(아웃+1), 		// 구연 완 
// 점수 내는 방법 (안타 = 1점, 2루타 = 2점, 3루타 = 3점, 홈런 = 4점 / 해서 점수/4 = 최종점수) // 구연 완
//if(아웃==3) 되면 최종점수 배열에다가 넣기. 다른 method로 넘어가기 // 구연 완
//투수 < 타자 = 점수(+1~4)		//구연 완
//랜덤값을 정해준다.(1 = 홈런, 2,3 = 3루타, 4,5,6,7,8 = 2루타,  9,10,11,12,13,14,15,16,17,18 = 안타, 19,20  = 아웃) // 구연 완

// 점수 point method로 넘기기.
// 9번 해서 home[10], away[10] 비교해서 이긴 팀 출력

// 수정
//배열에 숫자 넣으면 문제 생김.

// 버그
//플라잉 아웃이 아웃처리 안 댐

//System.out.print("Home TEAM : ");
//System.out.print(Arrays.toString(home)); // [1, 2, 3]
//System.out.println(" 총점 : " + retrun);
//
//System.out.print("Away TEAM : ");
//System.out.print(Arrays.toString(away)); // [1, 2, 3]
//System.out.println(" 총점 : " + retrun);