package kr.ac.daelim.uml;

public class Medic extends Unit{
	public void move()
	{
		System.out.println("메딕 move");
	}
	public void underAttack(Character charactor)
	{
		System.out.println("메딕 underAttack");
	}
	public void healing(Character charactor)
	{
		System.out.println("메딕 healing");
	}
}
