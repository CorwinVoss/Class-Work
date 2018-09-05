
package com.company;
class OrangeTabby extends Cat
{
	protected OrangeTabby(String Name)
	{
		super("Orange Tabby", Name, true);
	}

	public void LayOnLap()
	{
		System.out.println("*cuddles up on owner's lap*");
		BeHappy();
	}
	@Override
	protected void BeHappy()
	{
		System.out.println("*Takes cat Nap*");
	}
}

