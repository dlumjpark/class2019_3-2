package kr.ac.daelim.beverage;

public class Decaf extends Beverage{
	public Decaf()
	{
		this.description = "디카페인 ";
	}
	
	@Override
	public int cost() {
		return 4700;
	}
	
}
