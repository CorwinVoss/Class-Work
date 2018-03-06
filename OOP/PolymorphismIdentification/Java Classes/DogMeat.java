package com.company;
class DogMeat extends GermanShepard
{
	  public DogMeat()
	{
		super("DogMeat");
	}
	  private override void FindDrugs()
	  {
		  System.out.println("*returns with stimpack*");
		  hasStimPack = true;
	  }
	  protected override void PlayFetch()
	  {
		  System.out.println("*comes back with zombie arm*");
	  }
}

