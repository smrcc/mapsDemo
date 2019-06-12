package com.ma;

import java.util.HashMap;
import java.util.Map;

public class StringNumberofoccurances {

	public static void main(String[] args) 
	{
		String s="appala chandrarao";
		//String[] str=s.split("");
		Map<Character,Integer> m=new HashMap<Character,Integer>();
		for(Character c:s.toCharArray())
		{
			if(m.containsKey(c))
			{
				m.put(c, m.get(c)+1);
			}else 
			{
				m.put(c, 1);
			}
		}System.out.println(m);
		
		

	}

}
