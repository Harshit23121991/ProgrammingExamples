package com.enumswitch;

public class Company {
	
	private String name;
	private RtAdditionaInfoType RtAdditionaInfoType;
	
	
	public Company(String name, RtAdditionaInfoType rtAdditionaInfoType) {
		super();
		this.name = name;
		RtAdditionaInfoType = rtAdditionaInfoType;
	}
	public String getName() {
		return name;
	}
	public RtAdditionaInfoType getRtAdditionaInfoType() {
		return RtAdditionaInfoType;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRtAdditionaInfoType(RtAdditionaInfoType rtAdditionaInfoType) {
		RtAdditionaInfoType = rtAdditionaInfoType;
	}
	

}
