package inheritance.model;

import java.util.ArrayList;

public class BTS extends Kpop 
{

	public BTS()
	{
		super();
		this.setNumberOfMembers(7.0);
		this.setTypesOfConcepts(getBTSConcepts());
		this.setCatchy(true);
		
	}
	
	

	private ArrayList<String> getBTSConcepts()
	{

		ArrayList<String> concepts = new ArrayList<String>();
		
		concepts.add("High School");
		concepts.add("Death/Youth");
		concepts.add("Bad Boy");
		
		return concepts;
	}



	@Override
	public boolean isCheezy(ArrayList<String> ingredients) {
		
		return false;
	}



	@Override
	public boolean isSpycy(ArrayList<String> ingredients) {
		
		return true;
	}



	@Override
	public boolean isHealthee(ArrayList<String> ingredients) {
		
		return false;
	}



	@Override
	public int calorieCounter(int calories) {
		
		return 0;
	}



	@Override
	public int deliciousness(int criticRating) {
		
		return 100;
	}
}
