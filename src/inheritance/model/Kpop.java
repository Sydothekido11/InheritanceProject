package inheritance.model;

import java.util.ArrayList;

public abstract class Kpop implements Foods, Comparable
{

	private double numberOfMembers;
	private ArrayList<String> typesOfConcepts;
	private boolean isCatchy;
	
	
	public double getNumberOfMembers() {
		return numberOfMembers;
	}
	public void setNumberOfMembers(double numberOfMembers) {
		this.numberOfMembers = numberOfMembers;
	}
	public ArrayList<String> getTypesOfConcepts() {
		return typesOfConcepts;
	}
	public void setTypesOfConcepts(ArrayList<String> typesOfConcepts) {
		this.typesOfConcepts = typesOfConcepts;
	}
	public boolean isCatchy() {
		return isCatchy;
	}
	public void setCatchy(boolean isCatchy) {
		this.isCatchy = isCatchy;
	}
	
	public String toString()
	{
		String kpopDescription = "This is a Kpop object of type " + this.getClass().getName() + " and has " + getNumberOfMembers() +" members.";
		
		return kpopDescription;
	}
	
}
