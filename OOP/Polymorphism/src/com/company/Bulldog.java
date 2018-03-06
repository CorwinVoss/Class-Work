package com.company; 
class Bulldog extends Dog
{
	private Bulldog(String Name)
	{
		super("BullDog",Name,true);
	}

	@Override
	protected void PlayFetch()
	{
		System.out.println("*Watches ball and goes to sleep*");
		MakeSound();
	}
	@Override
	public void MakeSound()
	{
		System.out.println("*panting and snoring sounds*");
	}
}

