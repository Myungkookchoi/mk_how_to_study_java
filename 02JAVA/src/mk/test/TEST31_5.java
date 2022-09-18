package mk.test;

//import java.util.Arrays;

import java.util.Scanner;

public class TEST31_5 {
	public static Scanner sc = new Scanner(System.in);
	public static int deck[] = new int[52];
	public static int p1Deck[] = new int[11];
	public static int p2Deck[] = new int[11];
	public static int deckIndex = 0;
	public static int p1DeckIndex = 0;
	public static int p2DeckIndex = 0;
	public static boolean isP1Flag = true;
	public static boolean isP2Flag = true;
	public static boolean gameFlag = true;
	public static int p1Scoure = 0;
	public static int p2Scoure = 0;
	public static final String CARD_SHAPE[] = { "스페이스", "하트", "클로버", "다이아" };
	public static final String CARD_NUMBER[] = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

	public static void newCard() {
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}
		deckIndex = 0;
		p1DeckIndex = 0;
		p2DeckIndex = 0;
		for (int i = 0; i < deck.length; i++) {
			int random = (int) (Math.random() * 52);
			int temp = deck[0];
			deck[0] = deck[random];
			deck[random] = temp;
		}
//		System.out.println(Arrays.toString(deck));
	}

	public static void getP1Card() {
		p1Deck[p1DeckIndex++] = deck[deckIndex++];
	}

	public static void getP2Card() {
		p2Deck[p2DeckIndex++] = deck[deckIndex++];
	}

	public static void displayP1Deck() {
		System.out.print("P1Cards : ");
		for (int i = 0; i < p1DeckIndex; i++) {
			System.out.print(" " + CARD_SHAPE[p1Deck[i] % 4] + CARD_NUMBER[p1Deck[i] % 13]);
		}
	}

	public static void displayP2Deck() {
		System.out.print("P2Cards : ");
		for (int i = 0; i < p1DeckIndex; i++) {
			System.out.print(" " + CARD_SHAPE[p2Deck[i] % 4] + CARD_NUMBER[p2Deck[i] % 13]);
		}
	}

	public static int p1Scoure() {
		p1Scoure = 0;
		for (int i = 0; i < p1DeckIndex; i++) {
			if (p1Deck[i] % 13 == 0) {// a
				p1Scoure += 11;
			} else if (p1Deck[i] % 13 < 10) {
				p1Scoure += (p1Deck[i] % 13) + 1;
			} else {
				p1Scoure += 10;
			}
		}
		if (p1Scoure > 21) {
			for (int i = 0; i < p1DeckIndex; i++) {
				if (p1Deck[i] % 13 == 0) {// a
					p1Scoure -= 10;
				}
			}
		}
		System.out.println("");
		System.out.println("P1 점수 : " + p1Scoure);
		return p1Scoure;
	}

	public static int p2Scoure() {
		p2Scoure = 0;
		for (int i = 0; i < p2DeckIndex; i++) {
			if (p2Deck[i] % 13 == 0) {// a
				p2Scoure += 11;
			} else if (p2Deck[i] % 13 < 10) {
				p2Scoure += (p2Deck[i] % 13) + 1;
			} else {
				p2Scoure += 10;
			}
		}
		if (p2Scoure > 21) {
			for (int i = 0; i < p2DeckIndex; i++) {
				if (p2Deck[i] % 13 == 0) {// a
					p2Scoure -= 10;
				}
			}
		}
		System.out.println("");
		System.out.println("P2 점수 : " + p2Scoure);
		return p2Scoure;
	}

	public static void gamePlay() {
		while (gameFlag) {
			while (isP1Flag) {
				System.out.println("P1 카드를 받으시겠습니까? 1. YES 2. NO");
				String input1 = sc.nextLine();
				if (input1.equals("1")) {
					getP1Card();
					displayP1Deck();
					p1Scoure();
					if (p1Scoure > 21) {
						System.out.println("P1 플레이어가 21점을 넘겼습니다.");
						isP1Flag = false;
						isP2Flag = false;
						gameFlag = false;
					}
					break;
				} else if (input1.equals("2")) {
					isP1Flag = false;
				}
			}
			while (isP2Flag) {
				System.out.println("P2 카드를 받으시겠습니까? 1. YES 2. NO");
				String input2 = sc.nextLine();
				if (input2.equals("1")) {
					getP2Card();
					displayP2Deck();
					p2Scoure();
					if (p2Scoure > 21) {
						System.out.println("P2 플레이어가 21점을 넘겼습니다.");
						isP1Flag = false;
						isP2Flag = false;
						gameFlag = false;
					}
					break;
				} else if (input2.equals("2")) {
					isP2Flag = false;
				}
			}
			if (isP1Flag == false && isP2Flag == false) {
				endGame();
				gameFlag = false;
			}
		}
	}

	public static void endGame() {
		displayP1Deck();
		p1Scoure();
		displayP2Deck();
		p2Scoure();
		String winner = "";
		if (p1Scoure > 21 && p2Scoure > 21) {
			winner = "무승부";
		} else if (p1Scoure > 21) {
			winner = "P2승리";
		} else if (p2Scoure > 21) {
			winner = "P1승리";
		} else if (p1Scoure > p2Scoure) {
			winner = "P1승리";
		} else if (p1Scoure == p2Scoure) {
			winner = "무승부";
		} else {
			winner = "P2승리";
		}
		System.out.println("최종결과 : " + winner);
	}

	public static void main(String[] args) {
		newCard();
		gamePlay();
	}
}

//			A	2	3	4	5	6	7	8	9	10	J	Q	K
//스페이드		0	1	2	3	4	5	6	7	8	9	10	11	12
//하트		13	14	15	16	17	18	19	20	21	22	23	24	25
//클로버
//다이아
