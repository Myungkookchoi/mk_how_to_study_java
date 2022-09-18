package mk.alone.making;

import java.util.*;

public class TestServer {

	public static int st(int st) {
		st++;
		return st;
	}

	public static int per(int st, int per) {
		switch (st) {
		case 0:
			break;
		case 1:
			break;
		case 2:
			per += 5;
			break;
		case 3:
			break;
		case 4:
			per += 5;
			break;
		case 5:
			break;
		case 6:
			per += 0;
			break;
		case 7:
			per += 5;
			break;
		case 8:
			per += 5;
			break;
		case 9:
			per += 0;
			break;
		case 10:
			per += 5;
			break;
		case 11:
			per += 5;
			break;
		case 12:
			per += 0;
			break;
		case 13:
			per += 5;
		}
		return per;
	}

	public static int sell(int st, int sell) {
		switch (st) {
		case 0:
			sell += 150;
			break;
		case 1:
			sell += 250;
			break;
		case 2:
			sell += 200;
			break;
		case 3:
			sell += 200;
			break;
		case 4:
			sell += 800;
			break;
		case 5:
			sell += 1900;
			break;
		case 6:
			sell += 2600;
			break;
		case 7:
			sell += 3900;
			break;
		case 8:
			sell += 10000;
			break;
		case 9:
			sell += 15100;
			break;
		case 10:
			sell += 124900;
			break;
		case 11:
			sell += 190000;
			break;
		case 12:
			sell += 650000;
			break;
		case 13:
			sell += 2000000;
		}
		return sell;
	}

	public static int cost(int st, int cost) {
		switch (st) {
		case 0:
			break;
		case 1:
			cost += 200;
			break;
		case 2:
			break;
		case 3:
			cost += 500;
			break;
		case 4:
			cost += 500;
			break;
		case 5:
			cost += 500;
			break;
		case 6:
			cost += 0;
			break;
		case 7:
			cost += 1000;
			break;
		case 8:
			cost += 2000;
			break;
		case 9:
			cost += 5900;
			break;
		case 10:
			cost += 9100;
			break;
		case 11:
			cost += 15000;
			break;
		case 12:
			cost += 20000;
			break;
		case 13:
			cost += 45000;
		}
		return cost;
	}

	public static int money(int money, int cost) {
		money = money - cost;
		return money;
	}

	public static void main(String[] args) {
		int per = 0;
		int sell = 0;
		int cost = 300;
		int st = 0;
		int money = 1000000000;
		int insur = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 시작 2. 설명 3. 종료");
		Start: while (1 != 0) {
			int input1 = sc.nextInt();
			if (input1 == 1) {
				Game: while (1 != 0) {
					int random1 = (int) (Math.random() * 100) + 1;
					System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
					System.out.println("1. 강화 2. 팔기 3. 상점");
					System.out.println("현재 강화 : +" + st + "강");
					System.out.println("현재 자금 : " + money);
					System.out.println("강화확률 : " + (100 - per) + "%");
					System.out.println("강화비용 : " + cost + "원");
					System.out.println("판매 가격 : " + sell + "원");
					System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
					int input2 = sc.nextInt();
					if (input2 == 1) {
						if (random1 > per) {
							System.out.println("=================");
							System.out.println("!!!!!강화 성공!!!!!");
							System.out.println("=================");
							per = per(st, per);
							sell = sell(st, sell);
							cost = cost(st, cost);
							st = st(st);
							money = money(money, cost);
							continue;
						} else if (random1 < per) {
							if (insur > 0) {
								System.out.println("깨짐 방지권 사용");
								insur = insur - 1;
								continue;
							} else {
								System.out.println("ㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠ");
								System.out.println("ㅠㅠㅠㅠ강화 실패ㅠㅠㅠㅠ");
								System.out.println("ㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠ");
								if (money > 0) {
									per = 0;
									st = 0;
									sell = 0;
									cost = 300;
									continue;
								} else if (money == 0) {
									System.out.println("Game Over");
									break Game;
								}
							}
						}
					} else if (input2 == 2) {
						System.out.println("판매 하셨습니다.");
						money = money + sell;
						per = 0;
						sell = 0;
						st = 0;
						cost = 300;
						continue;
					} else if (input2 == 3) {
						System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ상점ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
						System.out.println("1.  +9강 워프권	-	 1,000,000원");
						System.out.println("2. +13강 워프권 	-	 7,000,000원");
						System.out.println("3. +14강 워프권	-	10,000,000원");
						System.out.println("4. 깨짐 방지권 x 1	-	 1,000,000원");
						System.out.println("5. 깨짐 방지권 x 3	-	 2,500,000원");
						System.out.println("6. +15강 워프권	-	15,000,000원");
						System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
						int input3 = sc.nextInt();
						if (input3 == 1) {
							if (money >= 1000000) {
								System.out.println("+9강 워프권 구매 완료");
								money = money - 1000000;
								for (st = 0; st < 9; st++) {
									per = per(st, per);
									sell = sell(st, sell);
									cost = cost(st, cost);
								}
							} else {
								System.out.println("금액이 부족합니다.");
							}
						} else if (input3 == 2) {
							if (money >= 7000000) {
								System.out.println("+13강 워프권 구매 완료");
								money = money - 7000000;
								st = st + 13;
							} else {
								System.out.println("금액이 부족합니다.");
							}
						} else if (input3 == 3) {
							if (money >= 10000000) {
								System.out.println("+14강 워프권 구매 완료");
								money = money - 10000000;
								st = st + 14;
							} else {
								System.out.println("금액이 부족합니다.");
							}
						} else if (input3 == 4) {
							if (money >= 1000000) {
								System.out.println("깨짐 방지권 x 1 구매 완료");
								money = money - 1000000;
								insur = insur + 1;
							} else {
								System.out.println("금액이 부족합니다.");
							}
						} else if (input3 == 5) {
							if (money >= 2500000) {
								System.out.println("깨짐 방지권 x 3 구매 완료");
								money = money - 2500000;
								insur = insur + 3;
							} else {
								System.out.println("금액이 부족합니다.");
							}
						} else if (input3 == 6) {
							if (money >= 15000000) {
								System.out.println("+15강 워프권 구매 완료");
								money = money - 15000000;
								st = st + 15;
							} else {
								System.out.println("금액이 부족합니다.");
							}
						}
						continue;
					}
				}
			} else if (input1 == 2) {
				System.out.println("대충 설명");
			} else if (input1 == 3) {
				System.out.println("종료");
				break Start;
			}
			break;
		}
		System.out.println("게임 종료");
	}

}

//	강화		강화비용		판매가격		확률
//	0		300			0			100	
//	1		300			150			100	
//	2		500			400			100	

//	3		500			600			95	
//	4		1000		800			95

//	5		1,500		1,600		90
//	6		2,000		3,500		90
//	7		2,000		6,100		90

//	8		3,000		10,000		85

//	9		5,000		20,000		80
//	10		10,900		35,100		80

//	11		20,000		160,000		75

//	12		35,000		350,000		70
//
//	13		55,000		1,000,000	70
//	
//	14		100,000		3,000,000	65
//
//	15		180,000		7,500,000	60
//
//	16		300,000		14,200,000	60
//
//	17		300,000		20,000,000	55
//
//	18		500,000		30,000,000	50



//st = st + 1;
//per = per + 5;
//sell = sell + 150;
//money = money - cost;
