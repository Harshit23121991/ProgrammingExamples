package com.test;

import com.collection.EnumPojo;

public class EnumTest {
	public static void main(String[] args) {
		String s = "O";
		new EnumTest().m1();
	}
	void m1(){
	//System.out.println(LoanAffordability.NO_LOAN_OFFER.getKey());
		
		EnumPojo EnumPojo = m2();
	System.out.println(EnumPojo.getLoanAffordability().getKey());
	
	}
	
	EnumPojo m2() {
		EnumPojo enumPojo =  new EnumPojo();
		enumPojo.setLoanAffordability(LoanAffordability.NO_LOAN_OFFER);
		return enumPojo;
	}
}
