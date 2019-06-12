package com.ma;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestMain {

	public static void main(String[] args)
	{
		Emp e1=new Emp(13, "mahesh");
		Emp e2=new Emp(10, "appala");
		Student s1=new Student(18, "appala mahesh ");
		Student s2=new Student(17, "appala mahesh babu");
		LinkedHashMap<Emp, Student> lm=new LinkedHashMap<Emp,Student>();
		lm.put(e1, s1);
		lm.put(e2, s2);
		
		Set<Emp> s=lm.keySet();
		
		for(Emp ss:s)
		{
			System.out.println(ss.id+" "+ss.name);
		}
		
		for(Emp e:lm.keySet())
{System.out.println(e.id+" "+e.name);
	
}
		
		//printing student data
		for(Student ss:lm.values())
		{
			System.out.println(ss.id+" "+ss.name);
		}

	}

}
