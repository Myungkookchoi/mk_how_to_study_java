package mk.home.online;

import java.util.Arrays;
import java.util.Scanner;

public class BlackJack_Class02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 카드 모양
		String[] cardShape = { "스페이드", "하트", "클로버", "하트" };
		// 카드숫자
		String[] cardNumber = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

		int[] deck = new int[52];

		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
			System.out.println(deck[i] + ":" + cardShape[deck[i] / 13] + cardNumber[deck[i] % 13]);
		}

		System.out.println("==================================");

		for (int i = 0; i < deck.length + 1; i++) { // 카드 셔플
			int randomCard = (int) (Math.random() * 52);
			int cardTemp = deck[0];
			deck[0] = deck[randomCard];
			deck[randomCard] = cardTemp;
		}

		for (int i = 0; i < deck.length; i++) {
			System.out.println(deck[i] + ":" + cardShape[deck[i] / 13] + cardNumber[deck[i] % 13]);
		}

		System.out.println("==================================");

		int deckIndex = 0;
		int p1Deck[] = new int[11];
		int p2Deck[] = new int[11];
		int p1DeckIndex = 0;
		int p2DeckIndex = 0;
		int p1Scoure = 0;
		int p2Scoure = 0;

		p1Deck[p1DeckIndex++] = deck[deckIndex++];
		for (int i = 0; i < p1DeckIndex; i++) {

			if (p1Deck[i] % 13 == 0) {
				p1Scoure += 11;
			} else if (p1Deck[i] % 13 < 10) {
				p1Scoure += (p1Deck[i] % 13) + 1;
			} else if (p1Deck[i] % 13 > 10) {
				p1Scoure += 10;
			}
		}
		if (p1Scoure > 21) {
			for (int i = 0; i < p1DeckIndex; i++) {
				if (p1Deck[i] % 13 == 0) {
					p1Scoure = p1Scoure - 10;
				}
				if (p1Scoure < 22) {
					break;
				}
			}
		}

		p2Deck[p2DeckIndex++] = deck[deckIndex++];
		for (int i = 0; i < p2DeckIndex; i++) {

			if (p2Deck[i] % 13 == 0) {
				p2Scoure += 11;
			} else if (p2Deck[i] % 13 < 10) {
				p2Scoure += (p2Deck[i] % 13) + 1;
			} else if (p2Deck[i] % 13 > 10) {
				p2Scoure += 10;
			}
		}
		if (p2Scoure > 21) {
			for (int i = 0; i < p2DeckIndex; i++) {
				if (p2Deck[i] % 13 == 0) {
					p2Scoure = p2Scoure - 10;
				}
				if (p1Scoure < 22) {
					break;
				}
			}
		}

		System.out.println("p1Card");
		for (int i = 0; i < p1DeckIndex; i++) {
			System.out.println(p1Deck[i] + ":" + cardShape[p1Deck[i] / 13] + cardNumber[p1Deck[i] % 13]);
		}
		System.out.println(p1Scoure);

		System.out.println("p2Card");
		for (int i = 0; i < p2DeckIndex; i++) {
			System.out.println(p2Deck[i] + ":" + cardShape[p2Deck[i] / 13] + cardNumber[p2Deck[i] % 13]);
		}
		System.out.println(p2Scoure);

		boolean p1Flag = true;
		boolean p2Flag = true;

		while ((p1Flag || p2Flag) && p1DeckIndex != p1Deck.length && p2DeckIndex != p2Deck.length) {

			while (p1Flag) {
				p1Scoure = 0;
				System.out.println("P1 카드를 받으시겠습니까? Yes = 1 / No = 0");
				int input1 = sc.nextInt();
				if (input1 == 1) { // 1은 받겠다
					p1Deck[p1DeckIndex++] = deck[deckIndex++]; // p1DeckIndex +1 , deckIndex+1
					for (int i = 0; i < p1DeckIndex; i++) {

						if (p1Deck[i] % 13 == 0) {
							p1Scoure += 11;
						} else if (p1Deck[i] % 13 < 10) {
							p1Scoure += (p1Deck[i] % 13) + 1;
						} else if (p1Deck[i] % 13 > 10) {
							p1Scoure += 10;
						}
					}
					if (p1Scoure > 21) {
						for (int i = 0; i < p1DeckIndex; i++) {
							if (p1Deck[i] % 13 == 0) {
								p1Scoure = p1Scoure - 10;
							}
							if (p1Scoure < 22) {
								break;
							}
						}
					}
					break;
				} else if (input1 == 0) {
					System.out.println("카드를 받지 않았습니다.");
					p1Flag = false;
				}
			}

			while (p2Flag) {
				p2Scoure = 0;
				System.out.println("P2 카드를 받으시겠습니까? Yes = 1 / No = 0");
				int input2 = sc.nextInt();
				if (input2 == 1) {
					p2Deck[p2DeckIndex++] = deck[deckIndex++];
					for (int i = 0; i < p2DeckIndex; i++) {

						if (p2Deck[i] % 13 == 0) {
							p2Scoure += 11;
						} else if (p2Deck[i] % 13 < 10) {
							p2Scoure += (p2Deck[i] % 13) + 1;
						} else if (p2Deck[i] % 13 > 10) {
							p2Scoure += 10;
						}
					}
					if (p2Scoure > 21) {
						for (int i = 0; i < p2DeckIndex; i++) {
							if (p2Deck[i] % 13 == 0) {
								p2Scoure = p2Scoure - 10;
							}
							if (p1Scoure < 22) {
								break;
							}
						}
					}
					break;
				} else if (input2 == 0) {
					System.out.println("카드를 받지 않았습니다.");
					p2Flag = false;
				}
			}
			if (p1Flag == false && p2Flag == false) {
				break;
			}
			System.out.println("p1Card");
			for (int i = 0; i < p1DeckIndex; i++) {
				System.out.println(p1Deck[i] + ":" + cardShape[p1Deck[i] / 13] + cardNumber[p1Deck[i] % 13]);
			}

			System.out.println(p1Scoure);
			if (p1Scoure > 21) {
				p1Flag = false;
				p2Flag = false;
			}

			System.out.println("p2Card");
			for (int i = 0; i < p2DeckIndex; i++) {
				System.out.println(p2Deck[i] + ":" + cardShape[p2Deck[i] / 13] + cardNumber[p2Deck[i] % 13]);
			}
			System.out.println(p2Scoure);
			if (p1Scoure > 21) {
				p1Flag = false;
				p2Flag = false;
			}
		}
		System.out.println("p1Card");
		for (int i = 0; i < p1DeckIndex; i++) {
			System.out.println(p1Deck[i] + ":" + cardShape[p1Deck[i] / 13] + cardNumber[p1Deck[i] % 13]);
		}
		System.out.println("p2Card");
		for (int i = 0; i < p2DeckIndex; i++) {
			System.out.println(p2Deck[i] + ":" + cardShape[p2Deck[i] / 13] + cardNumber[p2Deck[i] % 13]);
		}
		System.out.println("P1 Point : " + p1Scoure);
		System.out.println("P2 Point : " + p2Scoure);

	}
}
