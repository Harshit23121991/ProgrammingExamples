package com.comparable.comparator;

import java.util.Comparator;

public class DepartmentIdComparator implements Comparator<Department> {

	@Override
	public int compare(Department o1, Department o2) {
		if(o1.getDeptId()== o2.getDeptId()) {
			return 0;
		}else if(o1.getDeptId() > o2.getDeptId()) {
			return 1;
		}else {
			return -1;
		}
	}

}
