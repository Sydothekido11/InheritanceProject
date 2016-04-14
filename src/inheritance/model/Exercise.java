package inheritance.model;

import java.util.ArrayList;

public abstract class Exercise implements Foods
{
	private ArrayList<String> workouts;
	private int sets;
	private int reps;
	public int calories;
	
	public ArrayList<String> getWorkouts()
	{
		return workouts;
	}
	public void setWorkouts(ArrayList<String> workouts)
	{
		this.workouts = workouts;
	}
	public int getSets()
	{
		return sets;
	}
	public void setSets(int sets)
	{
		this.sets = sets;
	}
	public int getReps()
	{
		return reps;
	}
	public void setReps(int reps)
	{
		this.reps = reps;
	}
	public String toString()
	{
		String excersizeDescription = "this is a excersise object of type" + this.getClass().getName() + " and has " + getReps() + "reps";
		return excersizeDescription;
	}
	
	 public int compareTo(Object compared)
	{
		 int comparedValue = Integer.MIN_VALUE;
		 
		 if(compared instanceof Foods)
		 {
			 if(this.calorieCounter(this.calories) < ((Foods) compared).calorieCounter(this.calories))
			 {
				 comparedValue = -1;
			 }
			 else if(this.calorieCounter(this.calories) > ((Foods) compared).calorieCounter(this.calories))
			 {
				 comparedValue = 1;
			 }
			 else
			 {
				 comparedValue = 0;
			 }
		 }
		 
		return comparedValue;
	}
}
