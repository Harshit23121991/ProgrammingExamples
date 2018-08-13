package com.designpatterns.creational.SingleTon;

import java.io.Serializable;

public class SerializedSingleTon implements Serializable{
	
	private static final long serialVersionUID = -3129736553244721689L;
	
	private SerializedSingleTon() {}
	
	private static class SingleTonHelper{
		private static final SerializedSingleTon instance = new SerializedSingleTon();
	}
	
	public static SerializedSingleTon getInstance() {
		return SingleTonHelper.instance;
	}
	
	// If we need to maintain the single ton in serializa and deserialize 
	//we need to implement below method than singleton can be retained
	/*protected Object readResolve() {
		return getInstance();
	}*/
}
