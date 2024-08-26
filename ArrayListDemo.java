package com.org.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// ArrayList class can contains duplicate elements 
// ArrayList Class can maintain the insertion order 
// ArrayList is non syncronized 
//ArrayList internally it implements random access interface 
// ArrayList allows the null values 

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		ArrayList al = new ArrayList();
		al.add(null);
		al.add(10);
		al.add(30);
		al.add(10);
		al.add("hello");
		al.add(null);
		System.out.println(al);
		
		al.add("welcome");
		al.add(new Student(1, "Ajay"));
		al.add(new Employee(2, "vijay"));
		
		System.out.println(al);
		
		
		List l = new ArrayList();
		
		Collections.synchronizedList(l);
		
		
		
		ListIterator listitr = al.listIterator();
		
		while(listitr.hasNext()) {
			
			System.out.println(listitr.next());
		}
		
		System.out.println("*********");
		
		while(listitr.hasPrevious()) {
			System.out.println(listitr.previous());
		}
		
		System.out.println("############");
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		Employee e1 = null;
		Student s1 = null;
		
		list.add(new Employee(1,"allen"));
		list.add(new Employee(2,"alex"));
		list.add(null);
		
		
		
		System.out.println(list);

	}

}
