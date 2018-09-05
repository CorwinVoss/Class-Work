package com.company;
class Himalayan extends Cat {
	public Himalayan(String Name)
	{
		super("Himalayan", Name, false);
	}

	  private  void SeeLaser()
	  {
		  System.out.println("*Cat Ignores Laser*");
	  }
	  protected void DunkFaceInMilk()
	  {
		  System.out.println("*face gets covered in milk*");
		  BeHappy();
	  }
}
