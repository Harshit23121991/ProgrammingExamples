package com.comparable.comparator;

import java.util.Comparator;

public class DepartmentNameComparator implements Comparator<Department> {

	@Override
	public int compare(Department o1, Department o2) {
		return o1.getDeptName().compareTo(o2.getDeptName());
	}

}
