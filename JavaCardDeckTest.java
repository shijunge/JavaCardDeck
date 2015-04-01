import org.junit.Test;
import static org.junit.Assert.*;

public class JavaCardDeckTest {
	
	@Test
	public void DeckSortTest(){
		Deck dk=new Deck();
		dk.shuffle();
		dk.sort();
		assertEquals("Deck sorted return:", true, dk.isSorted());
	}
	@Test
	public void DeckLazyShuffleSortTest(){
		Deck dk=new Deck();
		dk.lazyShuffle();
		dk.sort();
		assertEquals("Deck lazy shuffle sorted return:", true, dk.isSorted());
	}
	@Test
	public void DeckLazyShuffleLazySortTest(){
		Deck dk=new Deck();
		dk.lazyShuffle();
		dk.lazySort();
		assertEquals("Deck lazy shuffle lazy sorted return:", true, dk.isSorted());
	}
	@Test
	public void DeckLazySortTest(){
		Deck dk=new Deck();
		dk.shuffle();
		dk.lazySort();
		assertEquals("Deck lazy sorted return:", true, dk.isSorted());
	}
	
	@Test
	public void DeckNumberCountTest(){
		Deck dk=new Deck();
		assertEquals("Deck number should be 52", 52, dk.getCardDeck().size());
	}
  
	@Test
	public void GetAllCardsWithSameShuffledSuitTest(){
		Deck dk=new Deck();
		dk.shuffle();
		assertEquals("DIAMONDS count should be 13", 13, (dk.getAllCardsWithSameShuffledSuit(dk.getCardDeck(), "DIAMONDS")).size());
		assertEquals("CLUBS count should be 13", 13, (dk.getAllCardsWithSameShuffledSuit(dk.getCardDeck(), "CLUBS")).size());
		assertEquals("HEARTS count should be 13", 13, (dk.getAllCardsWithSameShuffledSuit(dk.getCardDeck(), "HEARTS")).size());
		assertEquals("SPADES count should be 13", 13, (dk.getAllCardsWithSameShuffledSuit(dk.getCardDeck(), "SPADES")).size());
	}
}
