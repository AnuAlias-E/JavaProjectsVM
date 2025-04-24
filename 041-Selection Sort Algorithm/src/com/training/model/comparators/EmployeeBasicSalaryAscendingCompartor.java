package com.training.model.comparators;

import java.util.Comparator;

import com.training.model.Employee;

public class EmployeeBasicSalaryAscendingCompartor implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employee employee1 = (Employee) o1;
		Employee employee2 = (Employee) o2;
		if (employee1.getBasic() < employee2.getBasic())
			return -1;
		if (employee1.getBasic() > employee2.getBasic())
			return 1;
		return 0;
	}

}
