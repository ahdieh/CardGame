
public class Card {

	// PRIVATE VARIABLES +++++++++++++++
	private final String _face;
	private final String _suit;
	
	// CONSTRUCTOR +++++++++++++++++
	public Card(String face,String suit){
		this._face = face;
		this._suit = suit;
			
	}
	
	// PUBLIC METHODS +++++++++
	public String toString(){
		return String.format("%s of %s",this._face, this._suit);
	}
}
