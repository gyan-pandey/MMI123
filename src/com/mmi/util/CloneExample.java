
package com.mmi.util;

import java.io.*;
import java.util.Properties;

public class CloneExample implements Cloneable {
	String name = "mapmyindia";

	public Object clone() throws CloneNotSupportedException

	{
		return super.clone();
	}

	public static void main(String[] args) {
		try {
			CloneExample obj1 = CloneExample.class.newInstance();
			CloneExample obj2 = (CloneExample) Class.forName("CloneExample").newInstance(); // throws
																							// ClassNotFoundExeption
			CloneExample obj3 = (CloneExample) obj1.clone();
			System.out.println(obj1.name);
			System.out.println(obj2.name);
			
    //	CloneExample obj1 = CloneExample.class.newInstance();
	//	CloneExample obj2 = (CloneExample) Class.forName("CloneExample").newInstance(); // throws                    // from branch 2
																					// ClassNotFoundExeption
			
			System.out.println(obj3.name);
			Properties p = new Properties();
			FileOutputStream f = new FileOutputStream("config.properties");

		}

		
		
		//VASBDYIOBVSYDAI
		

	//	CloneExample obj1 = CloneExample.class.newInstance();

		
	
		
	//niaspudhp7ig79ghfiuasdghpuidfg

	//	CloneExample obj2 = (CloneExample) Class.forName("CloneExample").newInstance(); // throws
																						// ClassNotFoundExeption    // from branch 2
		
		catch (ClassNotFoundException e)

		{
			e.printStackTrace();   
		//	e.printStackTrace();  
		//	e.printStackTrace();	
			
		} catch (InstantiationException e)

		{
			e.printStackTrace();
		} catch (IllegalAccessException e)

		{
			e.printStackTrace();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// e.printStackTrace();
		///  e.printStackTrace();      frombranch 2

	}
}
