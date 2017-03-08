//Match interface constructed by Kristopher Moore
//CS386 Group 7
//Last Revision Date: 3-7-17
//
//This interface is responsible for detailing the Match class
//
import java.util.ArrayList;

public interface MatchHistory 
{
	//CONSTRUCTOR NOTE: constructor will take in two Player objects and a ruleset, and assign them to their corresponding variables
	//all variables will be private, and only modifiable through public methods
	
	//variable prototypes
	public ArrayList<Match> matchList = new ArrayList<Match>(); //matchList of our Match objects
	public Player p1 = null;
	public Player p2 = null;
	public Rule rule = null;
	
	//method prototypes
	public Player getPlayer1(); //retunrs p1
	public void setPlayer1(Player toSet); //sets p1 as argument
	public Player getPlayer2(); //returns p2
	public void setPlayer2(Player toSet); //sets p2 as argument
	public Rule getRule(); //returns rule object
	public void setRule(Rule toSet); //sets rule as argument 
	public int numOfMatches(); //return index of matchList object
	public String toString(); //returns the matchList in string format
	public ArrayList<Object> getMatchList(); //returns the matchList to the calling method
	public void addMatch(Match toAdd); //adds the passed match to the matchlist
}
