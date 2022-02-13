package com.bridgelabz;

public class EmployeeWage {
	// initialization
	public static final int IS_PRESENT = 1;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Problem using Oops concepts");
		computeEmpWage(); // calling method
	}

	/*
	 * This method is used to check Employee is Present or Absent Used ((RANDOM))
	 * for Attendance Check
	 */
	public static void computeEmpWage() {

		int empCheck = (int) Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_PRESENT)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}
}
