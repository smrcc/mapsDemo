package com.ma;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter {

	public static void main(String[] args) 
	{
		String str="maheshbabu";
		char[] c=str.toCharArray();
		int count=1;
		Map<Character,Integer> m=new HashMap<Character, Integer>();
		for(int i=0;i<c.length;i++)
		{
			if(!m.containsKey(c[i]))
			{
				m.put(c[i], count);
			}else
			{
				m.put(c[i], m.get(c[i])+1);
			}
		}
		for(Character cc:m.keySet())
		{
			if(m.get(cc)>1)
			{
				System.out.println(cc +"====== "+m.get(cc));
			}
		}
		

	}

}
