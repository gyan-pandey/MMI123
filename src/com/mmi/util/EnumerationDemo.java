package com.mmi.util;
import java.util.*;

public class EnumerationDemo {
	public static void main(String[] args)
	{
	
	Vector v = new Vector();
	Enumeration e = v.elements();
	v.addElement(10);
	v.addElement(9);
	v.addElement(45);
	v.addElement(4410);
	v.addElement(15440);
	v.addElement(1450);
	v.addElement(15430);
	v.addElement(1130);
	System.out.println(v);
	while(e.hasMoreElements())
	{
		Integer i = (Integer)e.nextElement();
		System.out.println(i);
	}
	
	
	//CHANGE IN ENUMERATION 
	
	}
}
