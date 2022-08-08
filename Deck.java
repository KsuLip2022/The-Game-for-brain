import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

/*  i.	Fields
*           1.	cards (List of Card)
*   ii.	Methods
*           1.	shuffle (randomizes the order of the cards)
*           2.	draw (removes and returns the top card of the Cards field)
*           3.	In the constructor, when a new Deck is instantiated, the Cards field should be populated with the
*            standard 52 cards.*/

public class Deck extends LinkedList<Card>{
		
	private final List<String> names = List.of("Two of Diamonds", "Two of Hearts", "Two of Spades", "Two of Clubs",
			"Three of Diamonds", "Three of Hearts", "Three of Spades", "Three of Clubs", "Four of Diamonds",
			"Four of Hearts", "Four of Clubs", "Four of Spades", "Five of Diamonds", "Five of Hearts",
			"Five of Spades", "Five of Clubs", "Six of Diamonds", "Six of Hearts", "Six of Spades", "Six of Clubs",
			"Seven of Diamonds", "Seven of Hearts", "Seven of Spades", "Seven of Clubs", "Eight of Diamonds",
			"Eight of Hearts", "Eight of Spades", "Eight of Clubs", "Nine of Diamonds", "Nine of Hearts", "Nine of Spades",
			"Nine of Clubs", "Ten of Diamonds", "Ten of Hearts", "Ten of Spades", "Ten of Clubs", "Jack of Diamonds",
			"Jack of Hearts", "Jack of Spades", "Jack of Clubs", "Queen of Diamonds","Queen of Hearts", "Queen of Spades",
			"Queen of Clubs", "King of Diamonds", "King of Hearts", "King of Spades", "King of Clubs", "Ace of Diamonds",
			"Ace of Hearts", "Ace of Spades", "Ace of Clubs");
	
	
	private final List<Integer> value = List.of(2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7,
			8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 11, 12, 12, 12, 12, 13, 13, 13, 13, 14, 14, 14, 14);
//	private final List<Integer> value = List.of(2-14);
	
	private List<Card> cards;
	
	public Deck() {	
		ourDeck();	
//		System.out.println(names);	This is for describing the card.
	 }		 
	private void ourDeck() {
		cards = new LinkedList<>();
		 for(int namePos = 0; namePos < names.size(); namePos++) {
		      int rank = namePos + 2;
		      String name = names.get(namePos);

		      for(int val : value) {
		       cards.add(new Card(name, val,rank));
		      }
		 }
}
	@Override
    public String toString() {
		StringBuilder sb = new StringBuilder();	
		
		sb.append("List of Card:").append(System.lineSeparator());	
		
		for (Card card : cards) {
			sb.append(" ").append(card).append("\n");
		}
		return sb.toString();
	}       
	
	public void shuffle() {
		 Random random = new Random();
		 List<Card> x = new LinkedList<>(cards);
		 cards.clear();
		 while(!x.isEmpty()) {
			 int pos = random.nextInt(x.size());
			 cards.add(x.remove(pos));
		 }		
	}
	public int size() {
		return cards.size();
	}
	public Card draw() {
		return cards.remove(0);
	}
}
	




