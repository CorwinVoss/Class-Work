package com.company;
class GermanShepard extends Dog
{
	public bool hasStimPack;
	 public GermanShepard( string Name)
	{
		super("German Shepard",Name,true);
		hasStimPack = false;
	}

	private virtual void FindDrugs()
	{
		System.out.println("searches for Drugs on criminals");
		hasStimPack = true;
	}
	private bool GetHasDrugs()
	{
		return hasStimPack;
	}
	
}
