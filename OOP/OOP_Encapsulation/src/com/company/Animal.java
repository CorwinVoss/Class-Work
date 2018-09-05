package com.company;
public class Animal
{
	public String species;
	public String name;

	public Animal(String Species,String name)
	{
		species = Species;
		this.name = name;
	}
	public void MakeSound()
	{
		System.out.println("Grrrr");
	}
	public void PrintName()
	{
		System.out.println(name);
	}
}
