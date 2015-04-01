public class JavaCardDeck{
	public static void display(Object obj){
		System.out.println(obj);
	}
	public static void main(String args[]){
		display("JavaCardDeck Implemented features:.");
		display("1). Shuffling with Collections shuffle method (lazy).");
		display("2). Shuffling with implementation by permutation inside array.");
		display("3). Sorting with Collections sort method (lazy).");
		display("4). Implemented a Card Deck quick sorting method to sort the shuffled array.");
		display("5). Implemented get all cards in the same suit from the shuffled deck.");
		display("6). 6 Junit test cases.");
		
		display("\n\n -----Exhibation of implemented behaviors -----");
		Deck d=new Deck();
		display("\n");
		display("\nInitial deck ...");
		display(d);
		d.shuffle();
		display("\nShuffled deck ...");
		display(d);
	
		display("\nDiamound Suit in shuffled deck ...");
		display(d.getAllCardsWithSameShuffledSuit(d.getCardDeck(), "DIAMONDS"));
		
		display("\nCLUBS Suit in shuffled deck ...");
		display(d.getAllCardsWithSameShuffledSuit(d.getCardDeck(), "CLUBS"));
		
		display("\nHEARTS Suit in shuffled deck ...");
		display(d.getAllCardsWithSameShuffledSuit(d.getCardDeck(), "HEARTS"));
		
		display("\nSPADES Suit in shuffled deck ...");
		display(d.getAllCardsWithSameShuffledSuit(d.getCardDeck(), "SPADES"));
		
		display("\nSorting the shuffled deck ...");
		d.sort();
		display(d);
		display("\nIs the deck sorted ..."+d.isSorted());
		
		
		display("\nShuffle with Java Library method ...");
		d.lazyShuffle();
		display(d);
		
		display("\nSort with java library method ...");
		d.lazySort();
		display(d);
	}
}
