package com.mmi.util;

public class Singleton {

	public String s = "mmi";
	public static Singleton si = null;

	public static synchronized Singleton instantiationDemo() {
		if (si == null) {
			si = new Singleton();
		}
		return si;
	}
}
