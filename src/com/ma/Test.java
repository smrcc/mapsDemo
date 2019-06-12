package com.ma;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test {

	public static void main(String[] args) 
	{
		HashMap <Integer, String> m=new HashMap<Integer,String>();
		m.put(333, "mahesh");
		m.put(15, "appala");
		m.put(78, "babu");
		System.out.println(m);
	Set<Integer> s=m.keySet();
	System.out.println(s);
	
	Collection<String> c=m.values();
	System.out.println(c);
	
	Set<Entry<Integer, String>> s1=m.entrySet();
	
	for(Entry<Integer,String> ss:s1)
	{
		System.out.println(ss.getKey()+" "+ss.getValue());
	}

	}

}
