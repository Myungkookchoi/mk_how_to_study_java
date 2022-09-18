package mk.alone.making;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BlackJack_Test {

	public static int p1points(int p1deckIndex, String p1card) {
		int p1point = 0;
		String CardShape[] = { "Spade", "Heart", "Clover", "Diamond" };
		String CardNumber[] = { "-A", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10", "-J", "-Q", "-K" };
		String deck2[] = new String[52];
		for (int i = 0; i < CardShape.length;) { // 카드 넣기
			for (int j = 0; j < deck2.length;) {
				for (int x = 0; x < CardNumber.length;) {
					deck2[j] = CardShape[i] + CardNumber[x];
					x++;
					j++;
				}
				i++;
			}
		}

		String p1Deck[] = new String[52];
		p1Deck[p1deckIndex] = p1card;

		System.out.println("");
		System.out.println(Arrays.toString(p1Deck));

		for (int b = 0; b < p1Deck.length; b++) { // 플레이어 덱 안에 카드가 뭔지 확인하고, 그 카드에 따른 점수
			for (int c = 0; c < 10; c++) {
				if (deck2[c].equals(p1Deck[b]) || deck2[c + 13].equals(p1Deck[b]) || deck2[c + 26].equals(p1Deck[b])
						|| deck2[c + 39].equals(p1Deck[b])) {
					p1point += c + 1;
				} else {

				}
			}
			for (int c = 0; c < 3; c++) {
				if (deck2[c + 10].equals(p1Deck[b]) || deck2[c + 10 + 13].equals(p1Deck[b])
						|| deck2[c + 23 + 13].equals(p1Deck[b]) || deck2[c + 36 + 13].equals(p1Deck[b])) {
					p1point += 11;
				} else {

				}
			}
		}
		return p1point;

	}

	public static int p2points(int p2deckIndex, String p2card) {
		int p1point = 0;
		String CardShape[] = { "Spade", "Heart", "Clover", "Diamond" };
		String CardNumber[] = { "-A", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10", "-J", "-Q", "-K" };
		String deck2[] = new String[52];
		String p2Deck[] = new String[52];
		p2Deck[p2deckIndex] = p2card;
		for (int i = 0; i < CardShape.length;) { // 카드 넣기
			for (int j = 0; j < deck2.length;) {
				for (int x = 0; x < CardNumber.length;) {
					deck2[j] = CardShape[i] + CardNumber[x];
					x++;
					j++;
				}
				i++;
			}
		}

		for (int b = 0; b < p2Deck.length; b++) { // 플레이어 덱 안에 카드가 뭔지 확인하고, 그 카드에 따른 점수
			for (int c = 0; c < 10; c++) {
				if (deck2[c].equals(p2Deck[b]) || deck2[c + 13].equals(p2Deck[b]) || deck2[c + 26].equals(p2Deck[b])
						|| deck2[c + 39].equals(p2Deck[b])) {
					p1point += c + 1;
				} else {

				}
			}
			for (int c = 0; c < 3; c++) {
				if (deck2[c + 10].equals(p2Deck[b]) || deck2[c + 10 + 13].equals(p2Deck[b])
						|| deck2[c + 23 + 13].equals(p2Deck[b]) || deck2[c + 36 + 13].equals(p2Deck[b])) {
					p1point += 11;
				} else {

				}
			}
		}

		return p1point;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String CardShape[] = { "Spade", "Heart", "Clover", "Diamond" };
		String CardNumber[] = { "-A", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10", "-J", "-Q", "-K" };
		String deck[] = new String[52];
		String deck2[] = new String[52];
		int deckIndex = 0;
		boolean p1Flag = true;
		boolean p2Flag = true;
		String p1deck = "";
		String p2deck = "";
		for (int i = 0; i < CardShape.length;) { // 카드 넣기
			for (int j = 0; j < deck.length;) {
				for (int x = 0; x < CardNumber.length;) {
					deck[j] = CardShape[i] + CardNumber[x];
					x++;
					j++;
				}
				i++;
			}
		}
		for (int i = 0; i < CardShape.length;) { // 카드 넣기
			for (int j = 0; j < deck2.length;) {
				for (int x = 0; x < CardNumber.length;) {
					deck2[j] = CardShape[i] + CardNumber[x];
					x++;
					j++;
				}
				i++;
			}
		}
		Random rd = new Random(); // 카드 랜덤 배치
		for (int i = deck.length - 1; i > 0; i--) {
			int j = rd.nextInt(i + 1);
			String temp = deck[i];
			deck[i] = deck[j];
			deck[j] = temp;
		}
		String p1Deck[] = new String[52];
		String p2Deck[] = new String[52];
		int p1point = 0;
		int p2point = 0;
		System.out.println("게임 시작");
		int p1Index = 0;
		int p2Index = 0;
		p1Deck[p1Index] = deck[deckIndex]; // p1 시작 카드 주기
		p1point = p1points(p1Index, p1Deck[p1Index]);
		p1Index++;
		deckIndex++;
		p1deck = p1deck + p1Deck[p1Index - 1];

		p2Deck[p2Index] = deck[deckIndex]; // p2 시작 카드 주기
		p2point = p2points(p2Index, p2Deck[p2Index]);
		p2Index++;
		deckIndex++;
		p2deck = p2deck + p2Deck[p2Index - 1];

		System.out.println("===============카드 현황(반복문 밖)===============");
		System.out.println("Player 1 : " + p1deck);
		System.out.println("Player 1 : " + p1point + "점");
		System.out.println("");
		System.out.println("Player 2 : " + p2deck);
		System.out.println("Player 2 : " + p2point + "점");
		System.out.println("====================================");
//		p1point = 0;
//		p2point = 0;
		int game = 0;
		while (game == 0) {
			while (p1Flag) { // p1 턴
				System.out.println("Player 1님 카드를 받으시겠습니까? 0=no, 1=yes");
				int input1 = sc.nextInt();
				if (input1 == 1) {// Player 1 card add
					System.out.println("Player 1님이 카드를 받으셨습니다.");
					p1Deck[p1Index] = deck[deckIndex];
					System.out.println(Arrays.toString(p1Deck));
					for (int i = 0; i < p1Deck.length; i++) {
						p1point = p1points(i, p1Deck[i]);
					}
					System.out.println("");
					System.out.println(Arrays.toString(p1Deck));
					System.out.println("asdf" + p1point);
					p1Index++;
					deckIndex++;
					p1deck = p1deck + ", " + p1Deck[p1Index - 1];
//					p1point = 0;
//					for (int b = 0; b < p1Deck.length; b++) {
//						for (int c = 0; c < 10; c++) {
//							if (deck2[c].equals(p1Deck[b]) || deck2[c + 13].equals(p1Deck[b])
//									|| deck2[c + 26].equals(p1Deck[b]) || deck2[c + 39].equals(p1Deck[b])) {
//								p1point += c + 1;
//							} else {
//							}
//						}
//						for (int c = 0; c < 3; c++) {
//							if (deck2[c + 10].equals(p1Deck[b]) || deck2[c + 10 + 13].equals(p1Deck[b])
//									|| deck2[c + 23 + 13].equals(p1Deck[b]) || deck2[c + 36 + 13].equals(p1Deck[b])) {
//								p1point += 11;
//							} else {
//							}
//						}
//					}
					if (p1point == 21) {
						p1point = 0;
						for (int b = 0; b < p1Deck.length; b++) {
							for (int c = 0; c < 10; c++) {
								if (deck2[c].equals(p1Deck[b]) || deck2[c + 13].equals(p1Deck[b])
										|| deck2[c + 26].equals(p1Deck[b]) || deck2[c + 39].equals(p1Deck[b])) {
									p1point += c + 1;
								} else {
								}
							}
							for (int c = 0; c < 3; c++) {
								if (deck2[c + 10].equals(p1Deck[b]) || deck2[c + 10 + 13].equals(p1Deck[b])
										|| deck2[c + 23 + 13].equals(p1Deck[b])
										|| deck2[c + 36 + 13].equals(p1Deck[b])) {
									p1point += 11;
								} else {
								}
							}
						}

						p2point = 0;
						for (int b = 0; b < p2Deck.length; b++) {
							for (int c = 0; c < 10; c++) {
								if (deck2[c].equals(p2Deck[b]) || deck2[c + 13].equals(p2Deck[b])
										|| deck2[c + 26].equals(p2Deck[b]) || deck2[c + 39].equals(p2Deck[b])) {
									p2point += c + 1;
								} else {
								}
							}
							for (int c = 0; c < 3; c++) {
								if (deck2[c + 10].equals(p2Deck[b]) || deck2[c + 10 + 13].equals(p2Deck[b])
										|| deck2[c + 23 + 13].equals(p2Deck[b])
										|| deck2[c + 36 + 13].equals(p2Deck[b])) {
									p2point += 11;
								} else {

								}
							}
						}
						System.out.println("");
						System.out.println("========!!!!!Player 1 승리!!!!!!========");
						System.out.println("=========!!!Player 1 블랙잭!!!!=========");
						System.out.println("최종 카드 및 최종 점수");
						System.out.println("Player 1 : " + p1deck);
						System.out.println("Player 1 : " + p1point + "점");
						System.out.println("");
						System.out.println("Player 2 : " + p2deck);
						System.out.println("Player 2 : " + p2point + "점");
						System.out.println("=======================================");
						p1Flag = false;
						p2Flag = false;
						break;
					}
					break;
				} else if (input1 == 0) {
					System.out.println("Player 1님이 카드를 받지 않으셨습니다.");
					p1point = 0;
					for (int b = 0; b < p1Deck.length; b++) {
						for (int c = 0; c < 10; c++) {
							if (deck2[c].equals(p1Deck[b]) || deck2[c + 13].equals(p1Deck[b])
									|| deck2[c + 26].equals(p1Deck[b]) || deck2[c + 39].equals(p1Deck[b])) {
								p1point += c + 1;
							} else {
							}
						}
						for (int c = 0; c < 3; c++) {
							if (deck2[c + 10].equals(p1Deck[b]) || deck2[c + 10 + 13].equals(p1Deck[b])
									|| deck2[c + 23 + 13].equals(p1Deck[b]) || deck2[c + 36 + 13].equals(p1Deck[b])) {
								p1point += 11;
							} else {

							}
						}
					}
					p1Flag = false;
					break;
				} else {
					System.out.println("잘못 입력하셨습니다.");
				}
			}
			if (p1point > 21 && p2point <= 21) {
				p1point = 0;
				for (int b = 0; b < p1Deck.length; b++) {
					for (int c = 0; c < 10; c++) {
						if (deck2[c].equals(p1Deck[b]) || deck2[c + 13].equals(p1Deck[b])
								|| deck2[c + 26].equals(p1Deck[b]) || deck2[c + 39].equals(p1Deck[b])) {
							p1point = p1point + (c + 1);
						} else {
						}
					}
					for (int c = 0; c < 3; c++) {
						if (deck2[c + 10].equals(p1Deck[b]) || deck2[c + 10 + 13].equals(p1Deck[b])
								|| deck2[c + 23 + 13].equals(p1Deck[b]) || deck2[c + 36 + 13].equals(p1Deck[b])) {
							p1point = p1point + 11;
						} else {
						}
					}
				}
				System.out.println("");
				System.out.println("========!!!!!Player 2 승리!!!!!!(p1안)========");
				System.out.println("Player 1 의 점수가 21점을 넘겼습니다.");
				System.out.println("최종 카드 및 최종 점수");
				System.out.println("Player 1 : " + p1deck);
				System.out.println("Player 1 : " + p1point + "점");
				System.out.println("");
				System.out.println("Player 2 : " + p2deck);
				System.out.println("Player 2 : " + p2point + "점");
				System.out.println("=======================================");
				break;
			} else if (p1point <= 21 && p2point <= 21) {
			} else if (p1point == 21) {
				System.out.println("");
				System.out.println("========!!!!!Player 1 승리!!!!!!========");
				System.out.println("=========!!!Player 1 블랙잭!!!!=========");
				System.out.println("최종 카드 및 최종 점수");
				System.out.println("Player 1 : " + p1deck);
				System.out.println("Player 1 : " + p1point + "점");
				System.out.println("");
				System.out.println("Player 2 : " + p2deck);
				System.out.println("Player 2 : " + p2point + "점");
				System.out.println("=======================================");
				break;
			}
			while (p2Flag) { // p2 턴
				System.out.println("Player 2님 카드를 받으시겠습니까? 0=no, 1=yes");
				int input1 = sc.nextInt();
				if (input1 == 1) {// player 1 card add
					System.out.println("Player 2님이 카드를 받으셨습니다.");
					p2Deck[p2Index] = deck[deckIndex];
					p2Index++;
					deckIndex++;
					p2deck = p2deck + ", " + p2Deck[p2Index - 1];
					p2point = 0;
					for (int b = 0; b < p2Deck.length; b++) {
						for (int c = 0; c < 10; c++) {
							if (deck2[c].equals(p2Deck[b]) || deck2[c + 13].equals(p2Deck[b])
									|| deck2[c + 26].equals(p2Deck[b]) || deck2[c + 39].equals(p2Deck[b])) {
								p2point = p2point + (c + 1);
							} else {

							}
						}
						for (int c = 0; c < 3; c++) {
							if (deck2[c + 10].equals(p2Deck[b]) || deck2[c + 10 + 13].equals(p2Deck[b])
									|| deck2[c + 23 + 13].equals(p2Deck[b]) || deck2[c + 36 + 13].equals(p2Deck[b])) {
								p2point = p2point + 11;
							} else {
							}
						}
					}
					if (p2point == 21) {
						p1point = 0;
						for (

								int b = 0; b < p1Deck.length; b++) {
							for (int c = 0; c < 10; c++) {
								if (deck2[c].equals(p1Deck[b]) || deck2[c + 13].equals(p1Deck[b])
										|| deck2[c + 26].equals(p1Deck[b]) || deck2[c + 39].equals(p1Deck[b])) {
									p1point += c + 1;
								} else {

								}
							}
							for (int c = 0; c < 3; c++) {
								if (deck2[c + 10].equals(p1Deck[b]) || deck2[c + 10 + 13].equals(p1Deck[b])
										|| deck2[c + 23 + 13].equals(p1Deck[b])
										|| deck2[c + 36 + 13].equals(p1Deck[b])) {
									p1point += 11;
								} else {
								}
							}
						}
						p2point = 0;
						for (int b = 0; b < p2Deck.length; b++) {
							for (int c = 0; c < 10; c++) {
								if (deck2[c].equals(p2Deck[b]) || deck2[c + 13].equals(p2Deck[b])
										|| deck2[c + 26].equals(p2Deck[b]) || deck2[c + 39].equals(p2Deck[b])) {
									p2point += c + 1;
								} else {

								}
							}
							for (int c = 0; c < 3; c++) {
								if (deck2[c + 10].equals(p2Deck[b]) || deck2[c + 10 + 13].equals(p2Deck[b])
										|| deck2[c + 23 + 13].equals(p2Deck[b])
										|| deck2[c + 36 + 13].equals(p2Deck[b])) {
									p2point += 11;
								} else {

								}
							}
						}
						System.out.println("");
						System.out.println("========!!!!!Player 2 승리!!!!!!========");
						System.out.println("=========!!!Player 2 블랙잭!!!!=========");
						System.out.println("최종 카드 및 최종 점수");
						System.out.println("Player 1 : " + p1deck);
						System.out.println("Player 1 : " + p1point + "점");
						System.out.println("");
						System.out.println("Player 2 : " + p2deck);
						System.out.println("Player 2 : " + p2point + "점");
						System.out.println("=======================================");
						p1Flag = false;
						p2Flag = false;
						break;
					}
					break;
				} else if (input1 == 0) {
					System.out.println("Player 2님이 카드를 받지 않으셨습니다.");
					System.out.println(p2point);
					p2point = 0;
					for (int b = 0; b < p2Deck.length; b++) {
						for (int c = 0; c < 10; c++) {
							if (deck2[c].equals(p2Deck[b]) || deck2[c + 13].equals(p2Deck[b])
									|| deck2[c + 26].equals(p2Deck[b]) || deck2[c + 39].equals(p2Deck[b])) {
								p2point = p2point + (c + 1);
							} else {

							}
						}
						for (int c = 0; c < 3; c++) {
							if (deck2[c + 10].equals(p2Deck[b]) || deck2[c + 10 + 13].equals(p2Deck[b])
									|| deck2[c + 23 + 13].equals(p2Deck[b]) || deck2[c + 36 + 13].equals(p2Deck[b])) {
								p2point = p2point + 11;
							} else {

							}
						}
					}
					p2Flag = false;
					break;

				} else {
					System.out.println("잘못 입력하셨습니다.");
				}
			}
			if (p2point > 21 && p1point <= 21) {
				p2point = 0;
				for (int b = 0; b < p2Deck.length; b++) {
					for (int c = 0; c < 10; c++) {
						if (deck2[c].equals(p2Deck[b]) || deck2[c + 13].equals(p2Deck[b])
								|| deck2[c + 26].equals(p2Deck[b]) || deck2[c + 39].equals(p2Deck[b])) {
							p2point += c + 1;
						} else {

						}
					}
					for (int c = 0; c < 3; c++) {
						if (deck2[c + 10].equals(p2Deck[b]) || deck2[c + 10 + 13].equals(p2Deck[b])
								|| deck2[c + 23 + 13].equals(p2Deck[b]) || deck2[c + 36 + 13].equals(p2Deck[b])) {
							p2point += 11;
						} else {

						}
					}
				}
				System.out.println("");
				System.out.println("========!!!!!Player 1 승리!!!!!!========");
				System.out.println("Player 2 의 점수가 21점을 넘겼습니다.");
				System.out.println("최종 카드 및 최종 점수");
				System.out.println("Player 1 : " + p1deck);
				System.out.println("Player 1 : " + p1point + "점");
				System.out.println("");
				System.out.println("Player 2 : " + p2deck);
				System.out.println("Player 2 : " + p2point + "점");
				System.out.println("=======================================");
				break;
			} else {
			}
			if (p1Flag == false && p2Flag == false) {
				break;
			}
			System.out.println("===============카드 현황(반복문 안)===============");
			System.out.println("Player 1 : " + p1deck);
			System.out.println("Player 1 : " + p1point + "점");
			System.out.println("");
			System.out.println("Player 2 : " + p2deck);
			System.out.println("Player 2 : " + p2point + "점");
			System.out.println("====================================");
			continue;
		}
		p1point = 0;
		for (int b = 0; b < p1Deck.length; b++) {
			for (int c = 0; c < 10; c++) {
				if (deck2[c].equals(p1Deck[b]) || deck2[c + 13].equals(p1Deck[b]) || deck2[c + 26].equals(p1Deck[b])
						|| deck2[c + 39].equals(p1Deck[b])) {
					p1point += c + 1;
				} else {

				}
			}
			for (int c = 0; c < 3; c++) {
				if (deck2[c + 10].equals(p1Deck[b]) || deck2[c + 10 + 13].equals(p1Deck[b])
						|| deck2[c + 23 + 13].equals(p1Deck[b]) || deck2[c + 36 + 13].equals(p1Deck[b])) {
					p1point += 11;
				} else {

				}
			}
		}
		p2point = 0;
		for (int b = 0; b < p2Deck.length; b++) {
			for (int c = 0; c < 10; c++) {
				if (deck2[c].equals(p2Deck[b]) || deck2[c + 13].equals(p2Deck[b]) || deck2[c + 26].equals(p2Deck[b])
						|| deck2[c + 39].equals(p2Deck[b])) {
					p2point += c + 1;
				} else {

				}
			}
			for (int c = 0; c < 3; c++) {
				if (deck2[c + 10].equals(p2Deck[b]) || deck2[c + 10 + 13].equals(p2Deck[b])
						|| deck2[c + 23 + 13].equals(p2Deck[b]) || deck2[c + 36 + 13].equals(p2Deck[b])) {
					p2point += 11;
				} else {

				}
			}
		}
		if (p1point > p2point && p1point < 21 && p2point < 21) { // p1 win
			System.out.println("");
			System.out.println("========!!!!!Player 1 승리!!!!!!밖========");
			System.out.println("최종 카드 및 최종 점수");
			System.out.println("Player 1 : " + p1deck);
			System.out.println("Player 1 : " + p1point + "점");
			System.out.println("");
			System.out.println("Player 2 : " + p2deck);
			System.out.println("Player 2 : " + p2point + "점");
			System.out.println("=======================================");
		} else if (p1point < p2point && p1point < 21 && p2point < 21) {// p2 win
			System.out.println("");
			System.out.println("========!!!!!Player 2 승리!!!!!!밖========");
			System.out.println("최종 카드 및 최종 점수");
			System.out.println("Player 1 : " + p1deck);
			System.out.println("Player 1 : " + p1point + "점");
			System.out.println("");
			System.out.println("Player 2 : " + p2deck);
			System.out.println("Player 2 : " + p2point + "점");
			System.out.println("=======================================");
		} else if (p1point == p2point) {
			System.out.println("");
			System.out.println("=======================================");
			System.out.println("최종 카드 및 최종 점수");
			System.out.println("Player 1 : " + p1deck);
			System.out.println("Player 1 : " + p1point + "점");
			System.out.println("");
			System.out.println("Player 2 : " + p2deck);
			System.out.println("Player 2 : " + p2point + "점");
			System.out.println("=======================================");
			System.out.println("================= 무승부 =================");
		}
		sc.close();
	}
}
// 수정 사항
// 21이 넘은 플레이어 덱 안에 A가 있으면 A를 1 or 11 선택하기