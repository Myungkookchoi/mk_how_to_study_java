package mk.home.dto;

public class BlackJack_Deck {
	public String cardShape[] = { "스페이드", "하트", "클로버", "다이아" };
	public String cardNumber[] = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	int deck[] = new int[52];
	public int p1deck[] = new int[11];
	public int p2deck[] = new int[11];
	public int p1deckIndex = 0;
	public int p2deckIndex = 0;
	public int deckIndex = 0;

	public void deck() {
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}
		for (int i = 0; i < deck.length; i++) {
			int rd = (int) (Math.random() * 52);
			int temp = deck[0];
			deck[0] = rd;
			deck[rd] = temp;
		}
		
	}

	public int p1Card(int p1deckIndex, int deckIndex) {
		p1deck[p1deckIndex] = deck[deckIndex];
		return p1deck[p1deckIndex];
	}

	public int p2Card(int p2deckIndex, int deckIndex) {
		p1deck[p2deckIndex] = deck[deckIndex];
		return p1deck[p1deckIndex];
	}

}
