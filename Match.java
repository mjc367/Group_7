//Match interface constructed by Kristopher Moore
//CS386 Group 7
//Last Revision Date: 3-7-17
//
//This interface is responsible for detailing the Match class
//
public interface Match //creates Match interface
{
	//all variables will be private, and only modifiable through public methods
	
	//variable prototypes
	public Player winner = null;
	public Player loser = null;
	public Game game = null;
	public Stage stage = null;
	
	//method prototypes
	public Game getGame(); //returns game object to calling method
	public void setGame(Game toSet); //assigns game as passed game object
	public Stage getStage(); //returns stage object to calling method
	public void setStage(Stage toSet); //assigns stage as passed stage object
	public Player getWinner(); //returns player object to calling method
	public Player getLoser(); //returns player object to calling method
	public void setOutcome(Player won, Player lost); //takes in the winner and loser Players and will set their values.
	
}
