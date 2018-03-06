package com.company; 
class Bulldog extends Dog
{
	private Bulldog(string Name)
	{
		super("BullDog",Name,true);
	}
	protected override void PlayFetch()
	{
		System.out.println("*Watches ball and goes to sleep*");
		MakeSound();
	}
	public override void MakeSound()
	{
		System.out.println("*panting and snoring sounds*");
	}
}

