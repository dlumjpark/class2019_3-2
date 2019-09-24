package kr.ac.daelim.uml.zoo;

public class Pigeon extends Animal{

	public Pigeon() {
		//생성자
		cry = new BirdCry();
		fly = new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("비둘기");		
	}
}
