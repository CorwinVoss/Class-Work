package com.company;

class BostonTerrier extends Dog
{
	 private BostonTerrier(String Name)
	{
		super("Boston Terrier",Name,true);
	}
	@Override
	 protected void PlayFetch()
	 {
		 System.out.println("*chases ball 5000 times until your arm falls off*");
		 MakeSound();
	 }
}

