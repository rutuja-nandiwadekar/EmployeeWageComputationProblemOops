package com.bridgelabz;

public class EmployeeWage {
	// initialization
	public static final int FULL_TIME = 1;
	public static final int WAGE_PER_HR = 20;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Problem using Oops concepts");
		computeEmpWage(); // calling method
	}

	/*
	 * This method is used to Calculate Daily Employee Wage.
	 */
	public static void computeEmpWage() {
		// variables
		int FullDayHours = 0;
		int wage = 0;

		// Used ((RANDOM)) for Attendance Check
		int empCheck = (int) (Math.random() * 100) % 2;
		if (empCheck == FULL_TIME) {
			System.out.println("Employee is Present");
			FullDayHours = 8;
		} else {
			System.out.println("Employee is Absent");
		}
		// computation
		wage = FullDayHours * WAGE_PER_HR;
		System.out.println("Employee Daily Wage is " + wage);
	}
}
