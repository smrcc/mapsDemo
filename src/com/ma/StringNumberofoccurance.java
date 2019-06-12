package com.ma;

public class StringNumberofoccurance {

	public static void main(String[] args) 
	{
		String str="maheshbabu";
		int l=str.length()-str.replaceAll("a", "").length();
		System.out.println(l);
		

	}

}
