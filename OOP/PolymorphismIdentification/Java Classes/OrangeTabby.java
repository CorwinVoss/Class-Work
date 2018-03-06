
package com.company 
class OrangeTabby extends Cat
{
	protected OrangeTabby(string Name)
	{
		super("Orange Tabby", Name, true);
	}

	public void LayOnLap()
	{
		System.out.println("*cuddles up on owner's lap*");
		BeHappy();
	}
	private override void BeHappy()
	{
		System.out.println("*Takes cat Nap*");
	}
}

