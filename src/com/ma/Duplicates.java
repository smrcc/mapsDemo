package com.ma;

import java.util.HashSet;
import java.util.Set;

public class Duplicates {

	public static void main(String[] args)
	{
		String str[]= {"a","a","b","d","b","e","d"};
		Set<String> s=new HashSet<String>();
		for(String ss:str)
		{
			if(s.add(ss)==true)
			{
				System.out.println(ss);
			}
		}
		

	}

}
