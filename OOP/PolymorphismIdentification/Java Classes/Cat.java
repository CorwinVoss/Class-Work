package com.company;
public class Cat  extends  Animal
{
	protected bool shortHair;

	 public Cat(string Species, string Name,bool ShortHair)
	 {
		 super(Species,Name);
		 shortHair = ShortHair;
	 }
	public override void MakeSound()
	{
		System.out.println("Meow!");
	}
	private virtual void BeHappy()
	{
		System.out.println("purrr");
		SeeLaser();
		MakeSound();
	}
	private virtual void SeeLaser()
	{
		System.out.println("*Cat Pounces*");
	}
}
