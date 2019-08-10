package com.test;

import java.util.ArrayList;
import java.util.List;

public class SwitchBreakTest {

	public static void main(String[] args) {
		
		List<String> l = new ArrayList<>();
		/*l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");*/
		l.add("E");
		
		l.stream().forEach(q ->{
		     switch(q) {
		         case "A":
		            System.out.println("You choose Campaign!");
		            break;
		         case "B":
		            System.out.println("You choose Channel!");
		            break;
		         case "C":
		            System.out.println("You choose ConditionGroup!");
		            break;
		         case "D":
		            System.out.println("You choose DefaultLoanDuration!");
		            break;
		         case "E":
		            System.out.println("You choose MktContent!");
		         default:
		            System.out.println("I don't know your car.");
		            break;
	      }
			
			
		});
		
		
		
		
		// TODO Auto-generated method stub

	}

}
