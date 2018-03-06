package com.company;
public class Dog  extends  Animal
{
	protected boolean dockedTail;
	public Dog(String Species, String Name, boolean DockedTail)
	{        
		super(Species, Name);
	
		dockedTail = DockedTail;
	}
	@Override
	public void MakeSound()
	{
		System.out.println("Woof!");
	}
	protected void PlayFetch()
	{
		System.out.println("*chases ball 5 times then quits*");
	}
	private boolean GetDockedTail(){
		return dockedTail;
	}
}
