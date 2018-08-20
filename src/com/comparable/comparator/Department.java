package com.comparable.comparator;

public class Department {
	
	private String deptName;
	private int deptId;
	public Department(String deptName, int deptId) {
		super();
		this.deptName = deptName;
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	@Override
	public String toString() {
		return "Department [deptName=" + deptName + ", deptId=" + deptId + "]";
	}
}
