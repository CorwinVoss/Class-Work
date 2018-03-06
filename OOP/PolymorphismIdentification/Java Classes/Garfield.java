package com.company;
class Garfield extends OrangeTabby
{
	private Garfield()  { 
		super("Garfield");
	}

	public override void MakeSound()
	{
		System.out.println("mmmm,  lasagna");
	}
	private override void SeeLaser()
	{
		System.out.println("*goes to sleep*");
	}
}

