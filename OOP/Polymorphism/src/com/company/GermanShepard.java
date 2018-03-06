package com.company;
class GermanShepard extends Dog
{
	public boolean hasStimPack;
	 public GermanShepard( String Name)
	{
		super("German Shepard",Name,true);
		hasStimPack = false;
	}

	private void FindDrugs()
	{
		System.out.println("searches for Drugs on criminals");
		hasStimPack = true;
	}
	private boolean GetHasDrugs()
	{
		return hasStimPack;
	}
	
}
