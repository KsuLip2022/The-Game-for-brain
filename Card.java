import java.util.List;

public class Card {
	/* i.	Fields
              1.	value (contains a value from 2-14 representing cards 2-Ace)
              2.	name (e.g. Ace of Diamonds, or Two of Hearts)
      ii.	Methods
              1.	Getters and Setters
              2.	describe (prints out information about a card)*/

    
	private String name;
	private int val;
	private int rank;
	public Card(String name, int val, int rank) {
		
		this.name = name;
		this.val = val;
		this.rank = rank;
	}
	@Override
	public String toString() {
		return name + " is " + val;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getName() {
		return name;
	}
	public int getVal() {
		return val;
	}
	}


		     

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

