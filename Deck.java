import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;


public class Deck {
	class Rank{
		private int ordinal;
		private String name;
		public Rank(int ordinal, String name){
			this.ordinal=ordinal;
			this.name=name;
		}
		public int ordinal(){
			return this.ordinal;
		}
		public String name(){
			return this.name;
		}
	}
	public String [] names= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	private Rank[] ranks=new Rank[13];
	public enum SUIT {DIAMONDS, CLUBS, HEARTS, SPADES};
	
	private ArrayList<Card> cardDeck;
	
	public Deck(){
		for(int i=0; i<names.length; i++){
			ranks[i]=new Rank(i,names[i]);
		}
		cardDeck=new ArrayList<Card>();
		for(SUIT s: SUIT.values() ){
			for (Rank r: ranks){
				cardDeck.add(new Card(s.ordinal(),s.name(), r.ordinal(),r.name()));
			}
		}
	}
	
	public ArrayList<Card> getCardDeck(){
		return cardDeck;
	}
	public void lazyShuffle(){
		Collections.shuffle(cardDeck);
	}
	
	public void shuffle(){
		Random rng=new Random();
		Card cards[]=new Card[cardDeck.size()];
		cards=cardDeck.toArray(cards);
		for (int i=0; i<cards.length; i++){
			int target=rng.nextInt(cardDeck.size());
			Card tmp=cards[target];
			cards[target]=cards[i];
			cards[i]=tmp;
		}
		cardDeck=new ArrayList<Card>();
		cardDeck.addAll(Arrays.asList(cards));
	}
	
	public void lazySort(){
		Collections.sort(cardDeck);
	}

	public void sort(){
		Card cards[]=new Card[cardDeck.size()];
		cards=cardDeck.toArray(cards);
		DeckQuickSort dqs=new DeckQuickSort();
		dqs.quickSort(cards);
		cardDeck=new ArrayList<Card>();
		cardDeck.addAll(Arrays.asList(cards));
	}
	
	public ArrayList<Card> getAllCardsWithSameShuffledSuit(ArrayList<Card> shuffledDeck, String suitName){
		ArrayList<Card> sDeck=new ArrayList<Card>();
		Iterator<Card> it=shuffledDeck.iterator();
		while(it.hasNext()){
			Card card=it.next();
			if (card.getSuitName().equals(suitName)){
				sDeck.add(card);
			}
		}
		return sDeck;
	}
	
	public Boolean isSorted(){
		for (int i=1; i<cardDeck.size(); i++){
			if (cardDeck.get(i-1).compareTo(cardDeck.get(i))==1){
				return false;
			}
		}
		return true;
	}
	
	public String toString(){
		StringBuilder sb=new StringBuilder();
		sb.append("Deck {");
		for(Card card : cardDeck){
			sb.append(card).append(" ");
		}
		sb.append("}");
		return sb.toString();
	}
	
}
