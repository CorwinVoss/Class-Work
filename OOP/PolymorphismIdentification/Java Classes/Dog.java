package com.company;
public class Dog  extends  Animal
{
	protected bool dockedTail;
	public Dog(string Species, string Name, bool DockedTail)
	{        
		super(Species, Name);
	
		dockedTail = DockedTail;
	}
	public override void MakeSound()
	{
		System.out.println("Woof!");
	}
	protected virtual void PlayFetch()
	{
		System.out.println("*chases ball 5 times then quits*");
	}
	private bool GetDockedTail(){
		return dockedTail;
	}
}
