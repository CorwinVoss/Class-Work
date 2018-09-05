﻿package com.company;

class DogMeat extends GermanShepard
{
	  public DogMeat()
	{
		super("DogMeat");
	}

	  private void FindDrugs()
	  {
		  System.out.println("*returns with stimpack*");
		  hasStimPack = true;
	  }

	  @Override
	  protected  void PlayFetch()
	  {
		  System.out.println("*comes back with zombie arm*");
	  }
}

