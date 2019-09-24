package kr.ac.daelim.uml.zoo;

public class Zoo {
	static Animal tiger;
	static Animal eagle;
	
	public static void main(String[] args) {
		tiger = new Tiger();
		eagle = new Eagle();
		//-------------------tiger
		tiger.display();
		tiger.performCry();
		tiger.performFly();
		//-------------------eagle
		eagle.display();
		eagle.performCry();
		eagle.performFly();
		//------------------pigeon
		Animal pigeon = new Pigeon();
		pigeon.display();
		pigeon.performCry();
		pigeon.performFly();
		//------------------turtle
		Animal turtle = new Turtle();
		turtle.display();
		turtle.performCry();
		turtle.performFly();
	}

}
