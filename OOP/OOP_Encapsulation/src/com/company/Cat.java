package com.company;
public class Cat  extends  Animal
{
	protected Boolean shortHair;

	 public Cat(String Species, String Name, Boolean shortHair)
	 {
		 super(Species,Name);
		 this.shortHair = shortHair;
	 }
	 @Override
	public void MakeSound() {
		System.out.println("Meow!");
	}

	protected void BeHappy() {
		System.out.println("purrr");
		SeeLaser();
		MakeSound();
	}
	
	private  void SeeLaser()
	{
		System.out.println("*Cat Pounces*");
	}
}
