package kr.ac.daelim.uml;

public class Unit {
	public String name;
	public int health;
	public void move()
	{
		System.out.println("유닛 move()");
	}
	public void underAttack(Charactor charactor)
	{
		System.out.println("유닛 underAttack()");
	}
}
