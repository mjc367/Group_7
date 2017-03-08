//Match interface constructed by Kristopher Moore
//CS386 Group 7
//Last Revision Date: 3-7-17
//
//This interface is responsible for detailing the Game class
//
public interface Game 
{
	//variable prototypes
	public String name = null;
	public String platform = null;
	
	//method prototypes
	public String getName(); //returns name
	public void setName(String toSet); //sets name based on argument
	public String getPlatform(); //returns platform
	public void setPlatform(String toSet); //sets platform based on argument
}
