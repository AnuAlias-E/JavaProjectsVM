package com.training.ui;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.training.model.Employee;
import com.training.model.LeaveApplication;
import com.training.model.Manager;

public class Main {

	static List<LeaveApplication> leaveApplicationList = new LinkedList<>();
	static List<Employee> employeeList = new ArrayList<>();
	static List<Manager> managerList = new ArrayList<>();

	public static void main(String[] args) {

		employeeList.add(new Employee(101, "Anu Alias"));
		employeeList.add(new Employee(102, "Anju Sebastain"));
		employeeList.add(new Employee(103, "Maria George"));

		managerList.add(new Manager(1004, "Mathew", "IT"));
		managerList.add(new Manager(1005, "Iris", "Finance"));

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.Create New Leave Application");
			System.out.println("2.Manager Approval");
			System.out.println("3.Exit");

			System.out.println("Enter your choice");
			int choice = Integer.parseInt(sc.nextLine());

			switch (choice) {
			case 1:
				// if role is employee , take input for leave application using
				// empid,managerid, fromdate,todate ,reason

				createLeaveApplication(sc);
				break;
			case 2:
				// if role is manager ,this should display all the application submitted to the
				// managers
				// the manager see the list ,he either approve or reject the leave.

				managerApproval();

				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice");
			}
		}

	}

	private static void managerApproval() {
		if(leaveApplicationList.isEmpty()) {
			System.out.println("No leave application to review");
			return;
		}
		List<LeaveApplication> leaveList=leaveApplicationList.stream().filter(app->app.getApprovedOrRejected()==null).collect(Collectors.toList());

		System.out.println(leaveList);
	}

	private static void createLeaveApplication(Scanner sc) {
		String role;
		String loginName;
		System.out.println("Are you Manager or Employee:");
		role = sc.nextLine();
		System.out.println("Enter your name:");
		loginName = sc.nextLine();
		System.out.println();
		if (role.equalsIgnoreCase("employee")) {

			System.out.println("Enter Employee Id");
			int empId = Integer.parseInt(sc.nextLine());

			Employee employee = getEmployee(empId, loginName);

			if (employee == null) {
				System.out.println("Employee not found");
				return;
			}

			boolean previousLeave = false;
			for (LeaveApplication application : leaveApplicationList) {
				if (application.getEmpId() == empId) {
					previousLeave = true;
					break;
				}

			}
			if (previousLeave) {
				System.out.println("Previous Leave Applications");
				for (LeaveApplication application : leaveApplicationList) {
					if (application.getEmpId() == empId) {
						System.out.println(application);
					}

				}
			} else {
				System.out.println("No previous leave applications found");
			}

			System.out.println("Enter manager Id");
			int managerId = Integer.parseInt(sc.nextLine());

			boolean isManagerExists = getManager(managerId);
			if (!isManagerExists) {
				System.out.println("Manager  not found");
				return;
			}
			System.out.println("Enter FromDate");
			LocalDate fromDate = LocalDate.parse(sc.nextLine());
			System.out.println("Enter todate");
			LocalDate toDate = LocalDate.parse(sc.nextLine());

			boolean isDateConflict = checkDateConflict(empId, fromDate, toDate);
			if (isDateConflict) {
				System.out.println("Leave dates overlap with the existing leave");
				return;
			}
			System.out.println("Enter Reason");
			String reason = sc.nextLine();

			LeaveApplication application = new LeaveApplication(empId, managerId, fromDate, toDate, reason);
			leaveApplicationList.add(application);
			System.out.println("Leave application created successfully");
		}
	}

	private static boolean checkDateConflict(int empId, LocalDate newFromDate, LocalDate newToDate) {
//		for (LeaveApplication application : leaveApplicationList) {
//			if (application.getEmpId() == empId) {
//				if (!newFromDate.isBefore(application.getFromDate()) || newToDate.isAfter(application.getToDate()))
//					return true;
//			}
//		}	

		boolean isDateConflicts = leaveApplicationList.stream().filter(e -> e.getEmpId() == empId)
				.anyMatch(app -> !(newFromDate.isBefore(app.getFromDate()) || newToDate.isAfter(app.getToDate())));

		return isDateConflicts;

	}

	private static boolean getManager(int managerId) {
//		for (Manager manager : managerList) {
//			if (manager.getId() == managerId) {
//				return true;
//			}
//		}
//		return false;
//		
		return managerList.stream().filter(manager -> manager.getId() == managerId) != null;
	}

	private static Employee getEmployee(int empId, String loginName) {
//		for (Employee employee : employeeList) {
//			if (employee.getId() == empId && employee.getName().equalsIgnoreCase(loginName)) {
//				return employee;
//			}
//		}
//		return null;

		return employeeList.stream().filter(emp -> emp.getId() == empId && emp.getName().equalsIgnoreCase(loginName))
				.findFirst().get();
	}

}
