package kr.ac.daelim.beverage;

public abstract class Beverage {
	public String description = "Empty";
	public String getDescription()
	{
		return this.description;
	}
	public abstract int cost();
}
