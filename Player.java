import java.util.ArrayList;
import java.util.List;

/* i.	Fields
        1.	hand (List of Card)
        2.	score (set to 0 in the constructor)
        3.	name
   ii.	Methods
        1.	describe (prints out information about the player and calls the describe method for each card in the Hand List)
        2.	flip (removes and returns the top card of the Hand)
        3.	draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
        4.	incrementScore (adds 1 to the Player’s score field)*/ 

public class Player {

	List<Card> hand = new ArrayList<>();
	private int score = 0;
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	public List<Card> getHand(){
		return hand;
	}
	@Override
	public String toString() {
		return "Player [hand=" + hand + ", score=" + score + "]";
	}
	public Card flip() {
		return hand.remove(0);
	}
	public void incrementScore() {
		score += 1;	
	}
	public int size() {
		return hand.size();
	}
	public int getScore() {
		return score;
	}
	public int handSize() {
		return hand.size();
	}
}
