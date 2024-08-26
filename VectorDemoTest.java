package com.org.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemoTest {
	
	// Vector allows the insertions order 
	// Vector allows the duplicate values 
	// Vector is syncronized 
	// vector is best choice for reading the elements 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v = new Vector();
		v.add(10);
		v.add("Ajay");
		v.add(null);
		v.add('j');
		v.add(null);
		v.add('j');
		System.out.println(v);
		
		Enumeration e = v.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());	
		}
		
		
		Vector<Employee> v1 = new Vector<>();
		v1.add(new Employee(1,"Ajay"));
		
		System.out.println(v1);
	}

}
