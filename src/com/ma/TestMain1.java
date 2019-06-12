package com.ma;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class TestMain1 {

	public static void main(String[] args) {
		LinkedHashMap<Emp, Student> lm=new LinkedHashMap<Emp,Student>();
		lm.put(new Emp(13, "appala"), new Student(10, "mahesh"));
		lm.put(new Emp(15, "andhrapradesh"), new Student(17, "prakasam"));
		for(Emp e:lm.keySet())
		{
			System.out.println(e.id+" "+e.name);
		}
		for(Student ss:lm.values())
		{
			System.out.println(ss.id+" "+ss.name);
		}
            Set<Entry<Emp, Student>> ss=lm.entrySet();
           Iterator<Entry<Emp,Student>> aa= ss.iterator();
           while(aa.hasNext())
           {
        	   Entry<Emp, Student> bb=aa.next();
        	 Emp e=  bb.getKey();
        	 System.out.println(e.id+" "+e.name);
        	 
        	 Student cc=bb.getValue();
        	 System.out.println(cc.id+" "+cc.name);
           }
           

	}

}
