package mk.alone.making;

import java.util.Arrays;
import java.util.Scanner;

public class BlackJackReMaster2 {

	public static void main(String[] args) {
		String cardShape[] = { "스페이드", "하트", "클로버", "다이아" };
		String cardNumber[] = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		int deck[] = new int[52];
		for (int i = 0; i < deck.length; i++) {// 카드 인덱스 넣기
			deck[i] = i;
		}

		for (int i = 0; i < deck.length; i++) {// 카드 섞기
			int rd = (int) (Math.random() * 52);
			int temp = deck[0];
			deck[0] = rd;
			deck[rd] = temp;
		}

		int p1deck[] = new int[11];
		int p2deck[] = new int[11];
		int p1deckIndex = 0;
		int p2deckIndex = 0;
		int deckIndex = 0;
		boolean p1Flag = true;
		boolean p2Flag = true;
		int p1Score = 0;
		int p2Score = 0;

		Game: while (p1Flag || p2Flag) {
			Scanner sc = new Scanner(System.in);
			while (p1Flag) {
				p1Score = 0;
				System.out.println("P1");
				System.out.println("1. 카드 받기 2. 안 받기");
				int input = sc.nextInt();
				if (input == 1) {
					p1deck[p1deckIndex++] = deck[deckIndex++];// p1 카드 줌
					System.out.print("P1 : ");
					for (int i = 0; i < p1deckIndex; i++) {
						System.out.println(cardShape[p1deck[i] / 13] + cardNumber[p1deck[i] % 13]);
					}
					for (int i = 0; i < p1deckIndex; i++) { // p1 점수 계산
						if (p1deck[i] % 13 == 0) {
							p1Score += 11;
						} else if (p1deck[i] % 13 < 10) {
							p1Score += (p1deck[i] % 13) + 1;
						} else if (p1deck[i] % 13 > 9) {
							p1Score += 10;
						}
					}
					if (p1Score > 21) {
						for (int i = 0; i < p1deckIndex; i++) {
							if (p1deck[i] % 13 == 0) {
								p1Score -= 10;
							} else {
								break Game;
							}
						}
					}
					if (p1Score == 21) {
						break Game;
					}
					break;
				} else if (input == 2) {
					System.out.println("안 받음");
					p1Flag = false;
				}
			}
			while (p2Flag) {
				p2Score = 0;
				System.out.println("P2");
				System.out.println("1. 카드 받기 2. 안 받기");
				int input = sc.nextInt();
				if (input == 1) {
					p2deck[p2deckIndex++] = deck[deckIndex++];// p2 카드 줌
					System.out.print("P2 : ");
					for (int i = 0; i < p2deckIndex; i++) {
						System.out.println(cardShape[p2deck[i] / 13] + cardNumber[p2deck[i] % 13]);
					}
					for (int i = 0; i < p2deckIndex; i++) { // p2 점수 계산
						if (p2deck[i] % 13 == 0) {
							p2Score += 11;
						} else if (p2deck[i] % 13 < 10) {
							p2Score += (p2deck[i] % 13) + 1;
						} else if (p2deck[i] % 13 > 9) {
							p2Score += 10;
						}
					}
					if (p2Score > 21) {
						for (int i = 0; i < p2deckIndex; i++) {
							if (p2deck[i] % 13 == 0) {
								p2Score -= 10;
							} else {
								break Game;
							}
						}
					}
					if (p2Score == 21) {
						break Game;
					}
					break;
				} else if (input == 2) {
					System.out.println("안 받음");
					p2Flag = false;
				}

			}

			if (p1Flag == false && p2Flag == false) {
				for (int i = 0; i < p1deckIndex; i++) { // p1 점수 계산
					if (p1deck[i] % 13 == 0) {
						p1Score += 11;
					} else if (p1deck[i] % 13 < 10) {
						p1Score += (p1deck[i] % 13) + 1;
					} else if (p1deck[i] % 13 > 9) {
						p1Score += 10;
					}
				}
				if (p1Score > 21) {
					for (int i = 0; i < p1deckIndex; i++) {
						if (p1deck[i] % 13 == 0) {
							p1Score -= 10;
						} else {
							break Game;
						}
					}
				}
				for (int i = 0; i < p2deckIndex; i++) { // p2 점수 계산
					if (p2deck[i] % 13 == 0) {
						p2Score += 11;
					} else if (p2deck[i] % 13 < 10) {
						p2Score += (p2deck[i] % 13) + 1;
					} else if (p2deck[i] % 13 > 9) {
						p2Score += 10;
					}
				}
				if (p2Score > 21) {
					for (int i = 0; i < p2deckIndex; i++) {
						if (p2deck[i] % 13 == 0) {
							p2Score -= 10;
						} else {
							break Game;
						}
					}
				}
				System.out.println("");
				System.out.println("현재 상황");
				System.out.print("P1 : ");
				for (int i = 0; i < p1deckIndex; i++) {
					System.out.print(" " + cardShape[p1deck[i] / 13] + cardNumber[p1deck[i] % 13]);
				}
				System.out.println("");
				System.out.println("점수 : " + p1Score);

				System.out.println("");

				System.out.print("P2 : ");
				for (int i = 0; i < p2deckIndex; i++) {
					System.out.print(" " + cardShape[p2deck[i] / 13] + cardNumber[p2deck[i] % 13]);
				}
				System.out.println("");
				System.out.println("점수 : " + p2Score);

				System.out.println("");

				if (p1Score > 21) {
					System.out.println("P1의 점수가 21점 초과 \n P2 승리");
				} else if (p2Score > 21) {
					System.out.println("P2의 점수가 21점 초과 \n P1 승리");
				} else if (p1Score > p2Score) {
					System.out.println("P1 승리");
				} else if (p2Score > p1Score) {
					System.out.println("P2 승리");
				} else if (p1Score == 21) {
					System.out.println("P1 블랙잭, P1 승리");
				} else if (p2Score == 21) {
					System.out.println("P2 블랙잭, P2 승리");
				} else if (p1Score == p2Score) {
					System.out.println("무승부");
				}
				break Game;
			} else {
				System.out.println("");
				System.out.println("현재 상황");
				System.out.print("P1 : ");
				for (int i = 0; i < p1deckIndex; i++) {
					System.out.print(" " + cardShape[p1deck[i] / 13] + cardNumber[p1deck[i] % 13]);
				}
				System.out.println("");
				System.out.println("점수 : " + p1Score);

				System.out.println("");

				System.out.print("P2 : ");
				for (int i = 0; i < p2deckIndex; i++) {
					System.out.print(" " + cardShape[p2deck[i] / 13] + cardNumber[p2deck[i] % 13]);
				}
				System.out.println("");
				System.out.println("점수 : " + p2Score);

				System.out.println("");
			}
		}

	}

}

//			A	2	3	4	5	6	7	8	9	10	J	Q	K
//	스페이드	0	1	2	3	4	5	6	7	8	9	10	11	12
//	클로버	13	14	15	16	17	18	19	20	21	22	23	24	25
//	하트		26	27	28	29	30	31	32	33	34	35	36	37	38
//	다이아	39	40	41	42	43	44	45	46	47	48	49	50	51
