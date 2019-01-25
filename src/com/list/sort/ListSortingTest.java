package com.list.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSortingTest {

	public static void main(String[] args) {
		List<String> a = new ArrayList();
		a.add("InterestRate");
		a.add("processsingFee");
		a.add("TotalAmt");
		a.add("abc");
		
		System.out.println("LIST a :"+a);
		
		List<Fee> b = new ArrayList();
		b.add(new Fee("TotalAmt", 1));
		b.add(new Fee("InterestRate", 3));
		b.add(new Fee("processsingFee", 2));
		//b.add(new Fee("abc", 4));
		//b.add(new Fee("xyz", 4));
		
		System.out.println("LIST b :"+b);
		
		//REFERENCE
		/*Collections.sort(listToSort, 
			    Comparator.comparing(item -> listWithOrder.indexOf(item)));*/
		
		Collections.sort(b, 
			    Comparator.comparing(fee -> a.indexOf(fee.getConditionUiName())));
		
		System.out.println("Final List : " +b);

	}

}
