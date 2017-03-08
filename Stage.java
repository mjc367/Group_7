//Match interface constructed by Kristopher Moore
//CS386 Group 7
//Last Revision Date: 3-7-17
//
//This interface is responsible for detailing the Stage class
//
public interface Stage 
{
	//variable prototypes
	public String name = null;
	public int size = 0;
	public boolean isLegal = false;
	
	//method prototypes
	public String getName(); //returns name
	public void setName(String toSet); //sets name based on argument
	public int getSize(); //returns size
	public void setSize(int toSet); //sets size based on argument
	public boolean isLegal(); //returns legality of stage
	public void setLegal(boolean toSet); //sets isLegal as either true or false based on arguments
}
