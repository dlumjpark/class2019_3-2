package kr.ac.daelim.uml;

public class Marine extends Unit{
	protected int attackPower;
	public void move()
	{
		System.out.println("마린 move");
	}
	public void attack()
	{
		System.out.println("마린 attack");
	}
	public void underAttack(Character charactor)
	{
		System.out.println("마린 underAttack");
	}
}
