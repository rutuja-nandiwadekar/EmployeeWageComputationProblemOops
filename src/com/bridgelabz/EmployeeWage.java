package com.bridgelabz;

public class EmployeeWage {
	// initialization
	public static final int FULL_TIME = 2;
	public static final int WAGE_PER_HR = 20;
	public static final int PART_TIME = 1;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Problem using Oops concepts");
		computeEmpWage(); // calling method
	}

	/*
	 * This method is used to Calculate Daily Employee Wage. using Switch Case
	 * Statement
	 */
	public static void computeEmpWage() {
		// variables
		int FullDayHours = 0;
		int wage = 0;
		// Used ((RANDOM)) for Attendance Check
		int empCheck = (int) (Math.random() * 100) % 3;
		switch (empCheck) {
		case FULL_TIME:
			System.out.println("Employee is Present Full time");
			FullDayHours = 16;
			break;
		case PART_TIME:
			System.out.println("Employee is Present Part time");
			FullDayHours = 8;
			break;
		default:
			System.out.println("Employee is Absent");
		}
		// computation
		wage = FullDayHours * WAGE_PER_HR;
		System.out.println("Employee Daily Wage is " + wage);
	}
}
