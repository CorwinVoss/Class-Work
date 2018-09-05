package com.company;
class RussianBlue extends Cat
{
	 public RussianBlue(String Name)
	{
		super("Russian Blue",Name,true);
	}
	@Override
	 public void MakeSound()
	 {
		 System.out.println("Hisss!");
	 }
}
