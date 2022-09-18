package mk.home.online;

public class BlackJack_ClassTime {

	public static void main(String[] args) {
		// 카드 모양
		String[] cardShape = { "스페이드", "클로버", "하트", "다이아" };
		// 카드 숫자
		String[] cardNumber = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		// deck 배열 만들기
		// 52장의 카드번호를 저장하고 있는 배열 결국 0~51이 들어 있는 카드
		int[] deck = new int[52];
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;// 0~51
		}
		// deck배열에 있는 카드식별숫자를 가지고 원래의 카드를 만들어보자.
		// 식별번호 14 -> 다이아 2

		// deck배열에 있는 모든 카드를 화면에 출력하시오.
		for (int i = 0; i < deck.length; i++) {
			System.out.println(deck[i] + ":" + cardShape[deck[i] / 13] + cardNumber[deck[i] % 13]);
			// 0~51
		}

		// 카드를 섞은 다음 섞인 카드를 모두 찍어보자.
		for (int i = 0; i < 900000; i++) {
			int randomCard = (int) (Math.random() * 52);
			int cardTemp = deck[0];
			deck[0] = deck[randomCard];
			deck[randomCard] = cardTemp;
		}

		for (int i = 0; i < deck.length; i++) {
			System.out.println(deck[i] + ":" + cardShape[deck[i] / 13] + cardNumber[deck[i] % 13]);
			// 0~51
		}

		int deckIndex = 0;// deck카드묶음에서 카드 사용 유무 구분 인덱스​
		int[] p1Deck = new int[11];// 플레이어 1의 카드 묶음
		int[] p2Deck = new int[11];// 플레이어 2의 카드 묶음
		int p1DeckIndex = 0;// 플레이어 1의 카드 개수
		int p2DeckIndex = 0;// 플레이어 2의 카드 개수

//		//deck 에서 카드 한장씩 꺼내서 p1과 p2에 1장씩 번가라 가며 총 2장 주고 
//		//p1과 p2가 가지고 있는 카드를 출력해보자.
//		// p1Deck[p1DeckIndex++]=deck[deckIndex++];
//		// p2Deck[p2DeckIndex++]=deck[deckIndex++];
//		
//		// p1Deck[p1DeckIndex++]=deck[deckIndex++];
//		// p2Deck[p2DeckIndex++]=deck[deckIndex++];
//		// p1Deck[p1DeckIndex++]=deck[deckIndex++];
//		// p2Deck[p2DeckIndex++]=deck[deckIndex++];

//		// System.out.println("p1Card");
//		// for(int i=0;i<p1DeckIndex;i++) {
//		// System.out.println(p1Deck[i]+":"
//		// + cardShape[p1Deck[i]/13]+cardNumber[p1Deck[i]%13]);//0~51
//		// }

//		// System.out.println("p2Card");
//		// for(int i=0;i<p2DeckIndex;i++) {
//		// System.out.println(p2Deck[i]+":"
//		// + cardShape[p2Deck[i]/13]+cardNumber[p1Deck[i]%13]);//0~51
//		// }
//
		boolean isP1PlayFlag = true;
		boolean isP2PlayFlag = true;

		int p1Sum = 0;
		int p2Sum = 0;

//		//p1,p2각각 원하는 만큼의 카드를 받은 다음 받은 카드를 출력해 보자.
//
//		//while((isP1PlayFlag||isP2PlayFlag)&&(p1DeckIndex<p1Deck.length&&p2DeckIndex<p2Deck.length))
//
		while ((isP1PlayFlag || isP2PlayFlag) && p1DeckIndex != p1Deck.length && p2DeckIndex != p2Deck.length) {

			p1Sum = 0;
			p2Sum = 0;

			if (isP1PlayFlag) {
				System.out.println("p1님 카드를 더 받으시겠습니까? 1.yes 2.no");
				String input = new java.util.Scanner(System.in).nextLine();
				if (input.equals("1")) {
					p1Deck[p1DeckIndex++] = deck[deckIndex++];
				} else {
					isP1PlayFlag = false;
				}
			}
			if (isP2PlayFlag) {
				System.out.println("p2님 카드를 더 받으시겠습니까? 1.yes 2.no");
				String input = new java.util.Scanner(System.in).nextLine();
				if (input.equals("1")) {
					p2Deck[p2DeckIndex++] = deck[deckIndex++];
				} else {
					isP2PlayFlag = false;
				}
			}
//
//		//2명의 플레이어가 가지고 있는 카드를 찍어보자.
//
//		//플레이어별 점수출력을 추가해보자.
//
			System.out.print("p1Card: ");
			for (int i = 0; i < p1DeckIndex; i++) {
				System.out.print(cardShape[p1Deck[i] / 13] + cardNumber[p1Deck[i] % 13] + " ");
			}
			for (int i = 0; i < p1DeckIndex; i++) {
				int score = 0;
				// a =11
				if (p1Deck[i] % 13 == 0) {// A
					score = score + 11;
				} else if (p1Deck[i] % 13 < 9) {// 2~9
					score = p1Deck[i] % 13 + 1;
				} else {// 나머지 10
					score = score + 10;
				}
				p1Sum = p1Sum + score;
			}
			// A이를 1로 보았을경우의 처리가 남아있음 p1Sum 21를 초과하면
			// A를 11로 보았던것을 1로 본다.
			if (p1Sum > 21) {
				for (int i = 0; i < p1DeckIndex; i++) {
					if (p1Deck[i] % 13 == 0) {
						p1Sum = p1Sum - 10;
					}
					if (p1Sum < 22) {
						break;
					}
				}
			}
			System.out.println("p1의 총합:" + p1Sum);
			System.out.println();

			System.out.print("p2Card: ");
			for (int i = 0; i < p2DeckIndex; i++) {
				System.out.print(cardShape[p2Deck[i] / 13] + cardNumber[p2Deck[i] % 13] + " ");
			}
			for (int i = 0; i < p2DeckIndex; i++) {
				int score = 0;
				// a =11
				if (p2Deck[i] % 13 == 0) {// A
					score = score + 11;
				} else if (p2Deck[i] % 13 < 9) {// 2~9
					score = p2Deck[i] % 13 + 1;
				} else {// 나머지 10
					score = score + 10;
				}
				p2Sum = p2Sum + score;
			}
			// A이를 1로 보았을경우의 처리가 남아있음 p1Sum 21를 초과하면
			// A를 11로 보았던것을 1로 본다.
			if (p2Sum > 21) {
				for (int i = 0; i < p2DeckIndex; i++) {
					if (p2Deck[i] % 13 == 0) {
						p2Sum = p2Sum - 10;
					}
					if (p2Sum < 22) {
						break;
					}
				}
			}
			System.out.println("p2의 총합:" + p2Sum);
		}
		// 1. 카드를 받는 도중 21이 넘으면 카드 받는 작업을 종료
		// 2. 게임 종료후 승패 출력String winner="";
		String winner = "";
		if (p1Sum > 21 && p2Sum > 21) {
			winner = "무승부";
		} else if (p1Sum > 21) {// 둘다 받은 카드가 21넘으면
			winner = "p2승리";
		} else if (p2Sum > 21) {
			winner = "p1승리";
		} else if (p1Sum > p2Sum) {
			winner = "p1승리";
		} else if (p1Sum == p2Sum) {
			winner = "무승부";
		} else {
			winner = "p2승리";
		}
		System.out.println("최종결과:" + winner);

	}
}