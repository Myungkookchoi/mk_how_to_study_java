package mk.home.online;

import java.util.Arrays;
import java.util.Random;

public class BlackJack_Class {

	public static void main(String[] args) {
		String[] cardShape = { "스페이드", "하트", "클로버", "다이아" };
		String[] cardNumber = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

		int deck[] = new int[52];
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}
		for (int i = 0; i < deck.length; i++) {
			System.out.println((deck[i] + ":" + cardShape[i / 13] + cardNumber[i % 13]));
		}
		System.out.println("==========================");
//		Random rd = new Random(); // 카드 랜덤 배치
//		for (int i = deck.length - 1; i > 0; i--) {
//			int j = rd.nextInt(i + 1);
//			int temp = deck[i];
//			deck[i] = deck[j];
//			deck[j] = temp;
//			System.out.println(rd);
//		}
//		System.out.println(Arrays.toString(deck));

//		for (int i = deck.length - 1; i > 0; i--) {
//			int rd = (int) (Math.random() * 52);
//			int cardTemp = deck[0];
//			deck[0] = deck[rd];
//			deck[rd] = cardTemp;
//
//			System.out.println((deck[i] + ":" + cardShape[i / 13] + cardNumber[i % 13]));
//		}

		for (int i = 0; i < deck.length; i++) {
			int randomCard = (int) (Math.random() * 52);
			int cardTemp = deck[0];
			deck[0] = deck[randomCard];
			deck[randomCard] = cardTemp;
		}
		for (int i = 0; i < deck.length; i++) {
			System.out.println((deck[i] + ":" + cardShape[i / 13] + cardNumber[i % 13]));
		}
	}

}
