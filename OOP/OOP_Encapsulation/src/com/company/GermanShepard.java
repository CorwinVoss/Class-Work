package com.company;
class GermanShepard extends Dog
{
	public Boolean hasStimPack;
	 public GermanShepard(String Name)
	{
		super("German Shepard",Name,true);
		hasStimPack = false;
	}

	private void FindDrugs()
	{
		System.out.println("searches for Drugs on criminals");
		hasStimPack = true;
	}
	private Boolean GetHasDrugs()
	{
		return hasStimPack;
	}
	
}
