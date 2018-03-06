package com.company;
public class Animal
{
	public string species;
	public string name;

	public Animal(String Species,String Name)
	{
		species = Species;
		name = Name;
	}
	public virtual void MakeSound()
	{
		System.out.println("Grrrr");
	}
	public void PrintName()
	{
		System.out.println(name);
	}
}
