
public class DeckOfCardsTest {

	public static void main(String[] args) {
		DeckOfCards myDeckOfCards = new DeckOfCards();
	    myDeckOfCards.shuffle();
	    
	    for (int i = 1; i <= 52; i++)
	    	 {
	    	  //deal and display a Card aligned in the left side
	    	 System.out.printf("%-20s", myDeckOfCards.dealCard());
	    	 if (i % 3 == 0) // output a newline after every fourth card
	    	 System.out.println();
	    	 }
	}

}
