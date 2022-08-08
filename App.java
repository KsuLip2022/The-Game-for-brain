import java.util.Collections;
import java.util.Random;

/*  2.	Create a class called App with a main method.
    3.	Instantiate a Deck and two Players, call the shuffle method on the deck.
    4.	Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using 
the Deck you instantiated.
    5.	Using a traditional for loop, iterate 26 times and call the flip method for each player.
     a.	Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the
player whose card has the higher value.
    6.	After the loop, compare the final score from each player. 
    7.	Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is
higher or if they are both the same.*/

public class App {
	public static void main(String[] args) {
		 
    new App().run();
	}
	private void run() {
	Player player1 = new Player();
	Player player2 = new Player();
	
	Deck deck = new Deck(); 
	shuffleDeck(deck);
//	System.out.println(deck);
	deal(deck, player1, player2);
//	System.out.println("player1: " + player1.getHand()); 
//	System.out.println("player2: " + player2.getHand());
	
	play(player1, player2);
	
	finalScore(player1, player2);
	}	
	private void shuffleDeck(Deck deck) {
		deck.shuffle();	
	}	
	private void finalScore(Player player1, Player player2) {
		
		Player winner = null;
		Player loser = null;
		
		if(player1.getScore() > player2.getScore()) {
			winner = player1;
			loser = player2;
			System.out.println(player1.getScore());
			System.out.println("Player1 is a Winner!!");
		} else if (player2.getScore() > player1.getScore()) {
			winner = player2;
			loser = player1;
			System.out.println(player2.getScore());
			System.out.println("Player2 is a Winner!!");
		} else if (winner == null) {
			System.out.println("It's a draw.");
		}		
	}
	private void play(Player player1, Player player2) {
		int deckSize = player1.handSize() + player2.handSize();
		
		for(int turn = 0; turn < deckSize / 2; turn++) {
			Card card1 = player1.flip();
			Card card2 = player2.flip();
			
			if(card1.getRank() > card2.getRank()) {
				player1.incrementScore();	
			} else if (card2.getRank() > card1.getRank()) {
				player2.incrementScore();
			}
		}		
	}
	private void deal(Deck deck, Player player1, Player player2) {	
		for(int pos = 0; pos < deck.size(); pos++) {
		  if (pos % 2 == 0) {
				player1.draw(deck);
		} else {
				player2.draw(deck);
			}
		}
	}    
}


