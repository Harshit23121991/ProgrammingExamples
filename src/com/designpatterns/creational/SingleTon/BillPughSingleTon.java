package com.designpatterns.creational.SingleTon;

public class BillPughSingleTon {
	
	private BillPughSingleTon() {}
	
	private static class SingleTonHelper{
		private static final BillPughSingleTon INSTANCE = new BillPughSingleTon();
	}
	
	public static BillPughSingleTon getInstance() {
		return SingleTonHelper.INSTANCE;
	}

}
