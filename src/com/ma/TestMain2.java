package com.ma;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class TestMain2 {

	public static void main(String[] args) 
	{
		LinkedHashMap<Integer, Product> lm=new LinkedHashMap<Integer,Product>();
		lm.put(1, new Product(12, "glass", 10.5));
		lm.put(3, new Product(15, "book", 25.6));
		lm.put(4, new Product(53, "Fan", 200.6));
	Set<Entry<Integer,Product>> hm	=lm.entrySet();
	Iterator<Entry<Integer,Product>> mm=hm.iterator();
	while(mm.hasNext())
	{
		Entry< Integer, Product> a=mm.next();
		Product p=a.getValue();
		if(p.id==12)
			mm.remove();
		if(p.name.equals("Fan"))
			mm.remove();
		System.out.println(p.id+" "+p.name+" "+p.cost);
		
	}//print the data using for-each loop
//	for(Entry<Integer, Product> m:lm.entrySet())
//	{
//	Product p=	m.getValue();
//	System.out.println(p.id+" "+ p.name+" "+ p.cost);
//	}
//		
		
	
	}

}
