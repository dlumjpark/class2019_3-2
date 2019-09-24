package kr.ac.daelim.beverage;

public class CoffeeStore {

	public static void main(String[] args) {

		/*
		Beverage b1 = new Espresso();
		System.out.println(b1.getDescription());
		System.out.println(b1.cost());		
		*/

		Beverage latte = new Espresso();
		latte = new Milk(latte);
		System.out.println("재료: " + latte.getDescription());
		System.out.println("가격: " + latte.cost());		
		
		Beverage mix1 = new HouseBlend();
		mix1 = new Soy(mix1);
		mix1 = new Mocha(mix1);
		mix1 = new Whip(mix1);
		
		System.out.println("재료: " + mix1.getDescription());
		System.out.println("가격: " + mix1.cost());		
		
		
	}
}
