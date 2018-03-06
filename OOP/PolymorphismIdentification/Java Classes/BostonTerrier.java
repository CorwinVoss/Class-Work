package com.company;

class BostonTerrier extends Dog
{
	 private BostonTerrier(string Name)
	{
		super("Boston Terrier",Name,true);
	}
	 protected override void PlayFetch()
	 {
		 System.out.println("*chases ball 5000 times until your arm falls off*");
		 MakeSound();
	 }
}

