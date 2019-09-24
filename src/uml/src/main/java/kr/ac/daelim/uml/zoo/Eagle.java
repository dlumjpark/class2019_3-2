package kr.ac.daelim.uml.zoo;

public class Eagle extends Animal{

	public Eagle() {
		//생성자
		cry = new BirdCry();
		fly = new FlyWithWings();
	}

	@Override
	public void performCry() {
		cry.cry();
	}
	
	@Override
	public void performFly() {
		fly.fly();
	}
	
	@Override
	public void display() {
		System.out.println("독수리");		
	}

}
