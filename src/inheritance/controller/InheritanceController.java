package inheritance.controller;

import java.util.ArrayList;

import inheritance.model.FourMeat;
import inheritance.model.FreeWeights;
import inheritance.model.Kpop;
import inheritance.model.Foods;
import inheritance.model.SHINee;
import inheritance.view.InheritanceFrame;

public class InheritanceController 
{

	private ArrayList<Foods> foods;
	private InheritanceFrame baseFrame;
	
	public InheritanceController()
	{
		this.foods = new ArrayList<Foods>();
		makeFoodsList();
		baseFrame = new InheritanceFrame(this);
	}
	private void makeFoodsList() 
	{
	
		foods.add(new FourMeat());
		foods.add(new SHINee());
		foods.add(new FreeWeights());
		
		
		
	}
	public void start()
	{
		
	}
	
	private void swap(int firstLocation, int secondLocation)
	{
		Foods temp = foods.get(firstLocation);
		foods.set(firstLocation, foods.get(secondLocation));
		foods.set(secondLocation, temp);
	}
	
	
	public String showFoodLevels()
	{
		String foodLevels = "";
		int calories = 8;
		for(Foods currentFood : foods)
		{
			foodLevels += ("this is a " + currentFood.toString() + " and has a calorie count of " + currentFood.calorieCounter(calories) + "\n"); 
		}
		return foodLevels;
	}
	public void insertionSort()
	{
		for(int outerLoop = 1; outerLoop < foods.size(); outerLoop++)
		{
			int innerLoop = outerLoop;
			while(innerLoop > 0 && (foods.get(innerLoop-1).compareTo(foods.get(innerLoop))) > 0)
			{
				swap(innerLoop, innerLoop-1);
				innerLoop--;
			}
		}
	}
	
	public void quicksort(int low, int high)
	{
		if(low < high)
		{
			int midPoint = partition(low, high);
			quicksort(low, midPoint-1);
			quicksort(midPoint+1, high);
		}
	}
	
	private int partition(int low, int high)
	{
		int position = low;
		Foods pivot = foods.get(high);
		
		for(int spot = low; spot < high - 1; spot++)
		{
			if(foods.get(spot).compareTo(pivot) <= 0)
			{
				swap(position, spot);
				position++;
			}
		}
		swap(position, high);
		return position;
	}
}
