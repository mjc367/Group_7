//Interface for Spectators made by Samuel Beals
//CS386 Group 7

public interface Spectator
{
	//possible variables
	public String name = null;
	public String gender = null;;
  public int age = 0;
	public boolean isPlayer = false;//If a spectator is also a competitor

	//methods
	public String getName(); //returns name
	public void setName(String setName); //sets name based on argument
  public int getAge(); //returns age of spectator
  public void setAge(int setAge);//changes Age of spectator
	public String getGender(); //returns gender
	public void setGender(String setGender);
	public boolean isPlayer(); //returns player status
	public void setStatus(boolean platerStatus); //sets spectator as player
}
