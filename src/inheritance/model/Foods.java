package inheritance.model;

import java.util.ArrayList;

public interface Foods 
{

	public boolean isCheezy(ArrayList<String> ingredients);
	public boolean isSpycy(ArrayList<String> ingredients);
	public boolean isHealthee(ArrayList<String> ingredients);
	public int calorieCounter(int calories);
	public int deliciousness(int criticRating);
}
