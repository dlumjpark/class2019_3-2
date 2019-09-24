package kr.ac.daelim.uml.zoo;

public class Turtle extends Animal{

	public Turtle() {
		//생성자
		cry = new CryNoWay();
		fly = new FlyNoWay();
	}
	
	@Override
	public void display() {
		System.out.println("거북이");		
	}
}
