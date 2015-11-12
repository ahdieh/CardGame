import java.security.SecureRandom;

public class DeckOfCards {

	// PRIVATE VARIABLES +++++++++
	public Card[] _deck;
	private int _curentCard;
	private final static int _numberOfCards = 52;

	// RANDOM NUMBER GENERATOR +++++++++++
	private final static SecureRandom randomNumbers = new SecureRandom(); 
	
    // CONSTRUCTOR +++++++++++++++
	public DeckOfCards(){
		String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
				"Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		
		this._deck = new Card[_numberOfCards];
		this._curentCard = 0;
		
		for(int i = 0; i<this._deck.length; i++){
			this._deck[i] = new Card(faces[i % 13], suits[i / 13]);
		}
	}
	

		// PUBLIC METHODS ++++++++++++++++
		public void shuffle(){
			
			this._curentCard = 0;
		
		for (int current = 0; current < this._deck.length; current++){
			
			// Pick a random number between 0 and 51
			int next = randomNumbers.nextInt(_numberOfCards);
		
		    // Swap the current card with the next card using a third variable
			Card temporary = this._deck[current];
			this._deck[current] = this._deck[next];
			this._deck[next] = temporary;
			
		}
		}
		
		public Card dealCard(){
			     if(this._curentCard < this._deck.length)
				 return this._deck[this._curentCard++];
				 else
				 return null;
		}
	} 

