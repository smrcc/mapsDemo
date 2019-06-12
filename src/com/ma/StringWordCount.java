package com.ma;

import java.util.HashMap;
import java.util.Map;

public class StringWordCount {

	public static void main(String[] args) 
	{
		String str="welcome to java and selenium and java very close to selenium and java";
		String[] s=str.split(" ");
		Map<String,Integer> m=new HashMap<>();
		int count=1;
		for(int i=0;i<s.length;i++)
		{
			if(!m.containsKey(s[i]))
					{
				m.put(s[i], count);
					}else 
					{
						m.put(s[i], m.get(s[i])+1);
					}
		}
		for(String x:m.keySet())
		{
			System.out.println("the count of words:"+x+"="+m.get(x));
		}
		
		

	}

}
