package com.company;
public class Cat  extends  Animal
{
	protected boolean shortHair;

	 public Cat(String Species, String Name,boolean ShortHair)
	 {
		 super(Species,Name);
		 shortHair = ShortHair;
	 }
	 @Override
	public void MakeSound()
	{
		System.out.println("Meow!");
	}
	protected void BeHappy()
	{
		System.out.println("purrr");
		SeeLaser();
		MakeSound();
	}
	private void SeeLaser()
	{
		System.out.println("*Cat Pounces*");
	}
}
