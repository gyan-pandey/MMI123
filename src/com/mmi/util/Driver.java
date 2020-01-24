package com.mmi.util;

class Driver {
	public static void main(String[] args) 
	{
		
		
		Singleton a = Singleton.instantiationDemo();
		Singleton b = Singleton.instantiationDemo();
		Singleton c = Singleton.instantiationDemo();

		b.s = (b.s).toUpperCase();

		System.out.println("String from a is " + a.s);
		System.out.println("String from b is " + b.s);
		System.out.println("String from c is " + c.s);
		System.out.println("\n");

		a.s = (a.s).toLowerCase();

		System.out.println("String from a is " + a.s);
		System.out.println("String from b is " + b.s);
		System.out.println("String from c is " + c.s);
	}
}
