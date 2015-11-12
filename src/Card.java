
public class Card {

	// PRIVATE VARIABELS +++++++++++++++
	private final String _face;
	private final String _suit;
	
	// CONSTRUCTOR +++++++++++++++++
	public Card(String face,String suit){
		this._face = face;
		this._suit = suit;
			
	}
	
	// PUBLIC METHODS +++++++++
	public String toString(){
		return String.format(this._face,"of", this._suit);
	}
}
