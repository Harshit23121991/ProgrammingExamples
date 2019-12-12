package com.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestInsertionOrder {

	public static void main(String[] args) {
		/*List<String> l = new ArrayList<>();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		l.add("E");
		
		System.out.println("ArrayList : "+l);
		
		l.stream().forEach( c -> System.out.println(c));
		
		List<String> l1 = new LinkedList<>();
		l1.add("A");
		l1.add("B");
		l1.add("C");
		l1.add("D");
		l1.add("E");
		System.out.println("LinkedList : "+l);
		
		l1.stream().forEach( c -> System.out.println(c));*/
		
		ArrayList<Integer> l = new ArrayList<>();
		l.add(5);
		l.add(4);
		l.add(3);
		l.add(4);
		l.add(1);
		
		System.out.println("ArrayList : "+l);
		
		l.stream().forEach( c -> System.out.println(c));
		
		LinkedList<Integer> l1 = new LinkedList<>();
		l1.add(5);
		l1.add(4);
		l1.add(3);
		l1.add(4);
		l1.add(1);
		System.out.println("LinkedList : "+l1);
		
		l1.stream().forEach( c -> System.out.println(c));
		
		
	}

}
