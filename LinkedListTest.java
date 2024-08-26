package com.org.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

//LinkedList it maintains the insertion order 
//LinkedList it allows the duplicate values
//LinkedList is non syncronized (Collections.syncronizedList(linkedList Obj)
// LinkedList is best choice for insert,update and delete operations(node based it will work) 



public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList l = new LinkedList();
		l.add(10);
		l.add("jack");
		l.add("sumit");
		l.add("allen");
		l.add("allen");
		l.add(null);
		l.add(null);
		l.add('c');
		System.out.println(l);
		
		l.addFirst("Ajay");
		
		System.out.println(l);
		
		l.addLast("Vijay");
		System.out.println(l);
		
		
		l.removeFirst();
		System.out.println(l);
		
		l.removeLast();
		System.out.println(l);
		
		System.out.println(l.getFirst() + " : " +l.getLast());
		
//		ListIterator itr = l.listIterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		
//		System.out.println("*******");
//		
//		while(itr.hasPrevious()) {
//			System.out.println(itr.previous());
//		}
		
		List<Employee> list = new LinkedList<>();
		Collections.synchronizedList(list);
		
		
		Employee e1 = new Employee(1, "Vijay");
		
	list.add(e1);
		
	}

}
