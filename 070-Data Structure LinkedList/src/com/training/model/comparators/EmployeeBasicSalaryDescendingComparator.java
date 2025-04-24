package com.training.model.comparators;

import java.util.Comparator;

import com.training.model.Employee;

public class EmployeeBasicSalaryDescendingComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getBasic() < o2.getBasic())
			return 1;
		if (o1.getBasic() > o2.getBasic())
			return -1;
		return 0;
	}

}
